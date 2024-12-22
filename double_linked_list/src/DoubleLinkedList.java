/**
 * Double Linked List
 *
 *
 */
public class DoubleLinkedList
{
    Node head;
    static class Node
    {
        int value;
        Node next;
        Node previous;

        Node(int value)
        {
            this.value = value;
            next = null;
            previous = null;
        }
    }

    public void insertFront(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.previous = null;
        if (head != null)
        {
            head.previous = newNode;
        }
        head = newNode;
    }

    public void insertAfter(Node prev, int data)
    {
        if (prev == null)
        {
            System.out.println("Error: prev cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prev.next;
        prev.next = newNode;
        newNode.previous = prev;
    }

    public void insertEnd(int data)
    {
        Node newNode = new Node(data);
        
    }

    public int getFront()
    {
        if (head == null)
        {
            return -1;
        }
        return head.value;
    }
}

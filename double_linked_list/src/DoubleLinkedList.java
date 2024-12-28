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
        Node temp = head;
        newNode.next = null;
        if (head == null)
        {
            newNode.previous = null;
            head = newNode;
            return;
        }
        while (temp.next != null)
        {
            // Go to the end
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.previous = temp;
    }

    public void deleteNode(Node nodeToDelete)
    {

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

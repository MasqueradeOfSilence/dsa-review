/**
 * Linked List
 *  https://www.programiz.com/dsa/linked-list
 *  https://www.programiz.com/dsa/linked-list-operations
 *  Creating a singularly-linked list
 *
 *  Time Complexity: O(n) for search, O(1) for insertion and deletion
 *  Space Complexity: O(n)
 */

public class LinkedList
{
    Node head;
    static class Node
    {
        int value;
        Node next;

        Node(int value)
        {
            this.value = value;
            next = null;
        }
    }

    public void traverse()
    {
        System.out.println("Traversing linked list!");
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
    }

    public void insertFront(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertEnd(int data)
    {
        Node newNode = new Node(data);
        Node current = head;
        while(current.next != null)
        {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAt(int position, int data)
    {
        Node current = head;
        Node newNode = new Node(data);
        for (int i = 0; i < position - 1; i++)
        {
            if (current.next != null)
            {
                current = current.next;
            }
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public Node getHead()
    {
        return head;
    }

    public Node getTail()
    {
        Node current = head;
        while(current.next != null)
        {
            current = current.next;
        }
        return current;
    }

    public void deleteFront()
    {
        
    }

    public void deleteRear()
    {

    }

    public void deleteMiddle()
    {

    }

    /*
        We should be able to delete any of the cases above based on conditions
    */
    public void delete()
    {

    }

}

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
        Node temp = head;
        while (temp != null)
        {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

}

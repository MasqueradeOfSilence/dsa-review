/**
 * Linked List
 *  https://www.programiz.com/dsa/linked-list
 *  Creating a singularly-linked list
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
}

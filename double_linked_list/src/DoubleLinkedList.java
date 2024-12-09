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
}

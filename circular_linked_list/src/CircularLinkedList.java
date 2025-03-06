import java.util.Objects;

/**
 * Circular Linked List
 * https://www.programiz.com/dsa/circular-linked-list
 *
 * Here we are implementing a singly circularly linked list.
 *
 * Time Complexity:
 * Space Complexity:
 */

public class CircularLinkedList
{
    Node tail = null;
    static class Node
    {
        int value;
        Node next;
        Node(int value)
        {
            this.value = value;
            next = null;
        }

        @Override
        public boolean equals(Object o)
        {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return value == node.value && Objects.equals(next, node.next);
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(value, next);
        }
    }

    public void insertIntoEmptyList(int value)
    {
        if (tail != null)
        {
            System.out.println("Oops! List is not empty! Returning...");
            return;
        }
        Node newNode = new Node(value);
        tail = newNode;
        tail.next = newNode;
    }

    public void insertFront(int value)
    {
        // programiz's implementation doesn't have a head pointer
        // and that's because it's not necessary
        if (tail == null)
        {
            insertIntoEmptyList(value);
            return;
        }
        Node newNode = new Node(value);
        newNode.next = tail.next;
        tail.next = newNode;
    }

    public void insertAfter(int valueToInsert, int valueToInsertAfter)
    {
        if (tail == null)
        {
            System.out.println("No value to insert after! Inserting into empty list...");
            insertIntoEmptyList(valueToInsert);
        }
        // Add after the first node found that contains the specified value.
        int currentValue = valueToInsert;
        Node current = tail.next;
        Node prev = tail;
        while (currentValue != valueToInsertAfter)
        {
            currentValue = current.value;
            current = current.next;
            prev = current;
        }
        Node newNode = new Node(valueToInsert);
        prev.next = newNode;
        newNode.next = current;
    }

    public void insertEnd()
    {

    }

    public void deleteNode(int valueOfNodeToDelete)
    {

    }

    public Node getTail()
    {
        return tail;
    }

    public Node getHead()
    {
        return tail.next;
    }
}

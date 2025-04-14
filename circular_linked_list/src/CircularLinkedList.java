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
        // and that's because it's not necessary due to the circular implementation
        if (tail == null)
        {
            insertIntoEmptyList(value);
            return;
        }
        Node newNode = new Node(value);
        newNode.next = tail.next;
        tail.next = newNode;
    }

    public void insertAfter(int valueToInsertAfter, int newValue)
    {
//        System.out.println("insertAfter(" + valueToInsertAfter + ", " + newValue + ")");
        if (tail == null)
        {
            System.out.println("No value to insert after! Inserting into empty list...");
            insertIntoEmptyList(newValue);
        }
        // Add after the first node found that contains the specified value.
        int currentValue;
        Node current = tail.next;
        currentValue = current.value;
        while (currentValue != valueToInsertAfter)
        {
            currentValue = current.value;
            if (currentValue != valueToInsertAfter)
            {
                current = current.next;
            }
        }
        Node newNode = new Node(newValue);
        Node trueNext = current.next;
        current.next = newNode;
        newNode.next = trueNext;
    }

    public void insertEnd(int newValue)
    {
        if (tail == null)
        {
            System.out.println("Nothing in list! Inserting into empty list...");
            insertIntoEmptyList(newValue);
        }
        // you will break the link if you don't grab prev
        Node current = tail.next;
        while (current.next != tail)
        {
            current = current.next;
        }
        Node prevToTail = current.next;
        Node newEnd = new Node(newValue);

        Node prevHead = tail.next;
        tail = newEnd;
        tail.next = prevHead;
        prevToTail.next = newEnd;
    }

    public void deleteNode(int valueOfNodeToDelete)
    {
        if (tail == null)
        {
            System.out.println("Nothing to delete!");
            return;
        }
        Node temp = tail;
        do
        {
            temp = temp.next;
        }
        while (temp.value != valueOfNodeToDelete);
        // Now, temp is pointing to the node we want to delete (assuming unique values)
    }

    public Node getTail()
    {
        return tail;
    }

    public Node getHead()
    {
        return tail.next;
    }

    public void print()
    {
        Node current = getHead();
        do
        {
            System.out.print(current.value + " ");
            current = current.next;
        }
        while(current.value != tail.next.value);
    }
}

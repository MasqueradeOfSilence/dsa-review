import java.util.Objects;

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

        @Override
        public boolean equals(Object o)
        {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return value == node.value && Objects.equals(next, node.next) && Objects.equals(previous, node.previous);
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(value, next, previous);
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
        if (head == null || nodeToDelete == null)
        {
            System.out.println("Nothing to delete");
            return;
        }
        // Deleting front node
        if (head.equals(nodeToDelete))
        {
            head = nodeToDelete.next;
        }
        if (nodeToDelete.next != null)
        {
            nodeToDelete.next.previous = nodeToDelete.previous;
        }
        if (nodeToDelete.previous != null)
        {
            nodeToDelete.previous.next = nodeToDelete.next;
        }
    }

    public int getFront()
    {
        if (head == null)
        {
            return -1;
        }
        return head.value;
    }

    public void printDll()
    {
        Node currentNode = head;
        while (currentNode != null)
        {
            System.out.print(currentNode.value + "->");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}

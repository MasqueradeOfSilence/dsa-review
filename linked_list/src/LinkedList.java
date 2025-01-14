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
        // detach the first node and attach head to second node
        head = head.next;
    }

    public void deleteRear()
    {
        Node current = head;
        // Traverse to second-to-last node, and disconnect it
        while (current.next.next != null)
        {
            current = current.next;
        }
        current.next = null;
    }

    public void deleteMiddle(int position)
    {
        Node temp = head;
        for (int i = 1; i < position; i++)
        {
            // If you expect position to be 0-indexed, i should start at 1
            // since i is not used to explicitly index, we need to think of it in terms of how many times we want to loop
            if (temp.next != null)
            {
                temp = temp.next;
            }
        }
        // Detaching
        assert temp.next != null;
        temp.next = temp.next.next;
    }

    /*
        We should be able to delete any of the cases above based on conditions
    */
    public void delete(int position)
    {
        if (head == null)
        {
            return;
        }
        if (position == 0)
        {
            deleteFront();
            return;
        }
        deleteMiddle(position);
    }

    public boolean searchForNodeWithValue(int value)
    {
        Node current = head;
        while (current != null)
        {
            if (current.value == value)
            {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Bubble sort, ascending order
    public void sort()
    {
        if (head == null)
        {
            return;
        }
        Node current = head;
        Node subsequent = null;
        int tempData;
        while (current != null)
        {
            subsequent = current.next;
            while (subsequent != null)
            {
                if (current.value > subsequent.value)
                {
                    tempData = current.value;
                    current.value = subsequent.value;
                    subsequent.value = tempData;
                }
                subsequent = subsequent.next;
            }
            current = current.next;
        }
    }

}

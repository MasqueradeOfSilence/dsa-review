import static org.junit.jupiter.api.Assertions.*;

class CircularLinkedListTest
{
    @org.junit.jupiter.api.Test
    void insertFront()
    {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertFront(6);
        CircularLinkedList.Node head = cll.getHead();
        assertEquals(head.value, 6);
    }

    @org.junit.jupiter.api.Test
    void insertAfter()
    {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertFront(6);
        cll.insertFront(7);
        cll.insertFront(8);
        cll.insertFront(1001);
        cll.insertFront(67);
        // so now the order should be 67, 1001, 8, 7, 6
        CircularLinkedList.Node head = cll.getHead();
        assertEquals(head.value, 67);
        // now run insertAfter
        cll.insertAfter(1001, 333);
        // now expecting: 67, 1001, 333, 8, 7, 6
        cll.insertAfter(333, 143);
        // now expecting: 67, 1001, 333, 143, 8, 7, 6
        CircularLinkedList.Node tail = cll.getTail();
        assertEquals(tail.value, 6);
        assertEquals(tail.next.value, 67);
        assertEquals(tail.next.next.value, 1001);
        assertEquals(tail.next.next.next.value, 333);
        assertEquals(tail.next.next.next.next.value, 143);
        assertEquals(tail.next.next.next.next.next.value, 8);
        assertEquals(tail.next.next.next.next.next.next.value, 7);
        cll.print();
    }

    @org.junit.jupiter.api.Test
    void insertEnd()
    {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertFront(6);
        cll.insertFront(7);
        cll.insertFront(8);
        cll.insertFront(1001);
        cll.insertFront(67);
        // so now the order should be 67, 1001, 8, 7, 6
        CircularLinkedList.Node head = cll.getHead();
        assertEquals(head.value, 67);
        cll.insertEnd(666);
        cll.print();
        System.out.println();
        cll.insertEnd(8);
        cll.print();
        System.out.println();
        cll.insertEnd(1924);
        cll.print();
        // so now the order should be 67, 1001, 8, 7, 6, 666, 8, 1924
        CircularLinkedList.Node tail = cll.getTail();
        assertEquals(tail.value, 1924);
        assertEquals(tail.next.value, 67);
    }

    @org.junit.jupiter.api.Test
    void deleteNode()
    {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertFront(6);
        cll.insertFront(7);
        cll.insertFront(8);
        cll.insertFront(1001);
        cll.insertFront(67);
        // so now the order should be 67, 1001, 8, 7, 6
        // test deletion: at both ends, at various center positions
        cll.deleteNode(8);
        // now: 67, 1001, 7, 6
        cll.print();
        cll.deleteNode(67);
        // now: 1001, 7, 6
        cll.print();
        cll.insertEnd(1924);
        cll.insertEnd(666);
        // Now, 1001, 7, 6, 1924, 666
        cll.print();
        // now test both-end deletion
    }
}
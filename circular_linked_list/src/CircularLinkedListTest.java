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
        cll.insertAfter(333, 1001);
        // now expecting: 67, 1001, 333, 8, 7, 6
        cll.insertAfter(143, 3);
        CircularLinkedList.Node tail = cll.getTail();
        // TODO the order is wrong for insertAfter
        // also, I don't think I'm handling tail case correctly, and it might be messing with the tail every time? 
    }
}
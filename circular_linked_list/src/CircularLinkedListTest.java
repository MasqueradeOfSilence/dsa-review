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
//        System.out.println(cll.tail.value);
//        System.out.println(cll.tail.next.value);
//        System.out.println(cll.tail.next.next.value);
//        System.out.println(cll.tail.next.next.next.value); // it's fine up to this point
        // so now the order should be 67, 1001, 8, 7, 6
        CircularLinkedList.Node head = cll.getHead();
        assertEquals(head.value, 67);
        // now run insertAfter
        cll.insertAfter(1001, 333);

        System.out.println(cll.tail.value);
        System.out.println(cll.tail.next.value);
        System.out.println(cll.tail.next.next.value);
        System.out.println(cll.tail.next.next.next.value);
        // it's inserting at the end instead of after 1001
        System.out.println(cll.tail.next.next.next.next.value);


        // now expecting: 67, 1001, 333, 8, 7, 6
        cll.insertAfter(333, 143);
        // now expecting: 67, 1001, 333, 143, 8, 7, 6
        CircularLinkedList.Node tail = cll.getTail();
        // also, I don't think I'm handling tail case correctly, and it might be messing with the tail every time?
        assertEquals(tail.value, 6);
        assertEquals(tail.next.value, 67);
        assertEquals(tail.next.next.value, 1001);
        // TODO debug this...the algo is not computing properly and printing goes infinitely
        assertEquals(tail.next.next.next.value, 333);
        assertEquals(tail.next.next.next.next.value, 143);
        assertEquals(tail.next.next.next.next.next.value, 8);
        assertEquals(tail.next.next.next.next.next.next.value, 7);
    }
}
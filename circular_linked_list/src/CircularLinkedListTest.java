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

    }
}
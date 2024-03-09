import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest
{

    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown()
    {
    }

    @org.junit.jupiter.api.Test
    void traverse()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFront(12);
        linkedList.insertFront(17);
        linkedList.insertFront(1924);
        linkedList.insertFront(666);
        linkedList.traverse();
    }

    @org.junit.jupiter.api.Test
    void insertFront()
    {
        int testData = 7;
        LinkedList linkedList = new LinkedList();
        linkedList.insertFront(testData);
        LinkedList.Node head = linkedList.getHead();
        int expectedHeadValue = 7;
        assertEquals(head.value, expectedHeadValue);
    }

    @org.junit.jupiter.api.Test
    void insertEnd()
    {
        int testData = 7;
        LinkedList linkedList = new LinkedList();
        linkedList.insertEnd(testData);
    }
}
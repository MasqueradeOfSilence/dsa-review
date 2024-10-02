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
        linkedList.insertFront(12);
        linkedList.insertFront(17);
        linkedList.insertFront(1924);
        linkedList.insertFront(666);
        linkedList.insertEnd(testData);
        int expectedHeadValue = 666;
        int expectedTailValue = 7;
        LinkedList.Node head = linkedList.getHead();
        LinkedList.Node tail = linkedList.getTail();
        assertEquals(head.value, expectedHeadValue);
        assertEquals(tail.value, expectedTailValue);
    }

    @org.junit.jupiter.api.Test
    void insertMiddle()
    {
        int positionToInsertAt = 3;
        int testData = 7;
        LinkedList linkedList = new LinkedList();
        linkedList.insertFront(12);
        linkedList.insertFront(17);
        linkedList.insertFront(1924);
        linkedList.insertFront(666);
        linkedList.insertFront(332);
        linkedList.insertFront(24);
        linkedList.insertFront(25);
        linkedList.insertAt(positionToInsertAt, testData);
        // Expected order: 25 -> 24 -> 332 -> 7 -> 666 -> 1924 -> 17 -> 12
        linkedList.traverse();
    }

    @org.junit.jupiter.api.Test
    void deleteFront()
    {
        
    }

    @org.junit.jupiter.api.Test
    void deleteRear()
    {

    }

    @org.junit.jupiter.api.Test
    void deleteMiddle()
    {

    }

}
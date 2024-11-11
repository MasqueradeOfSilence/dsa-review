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
        LinkedList linkedList = new LinkedList();
        linkedList.insertFront(12);
        linkedList.insertFront(17);
        LinkedList.Node head = linkedList.getHead();
        LinkedList.Node tail = linkedList.getTail();
        assertEquals(head.value, 17);
        assertEquals(tail.value, 12);
        linkedList.deleteFront();
        head = linkedList.getHead();
        tail = linkedList.getTail();
        assertEquals(head.value, 12);
        assertEquals(tail.value, 12);
    }

    @org.junit.jupiter.api.Test
    void deleteRear()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFront(12);
        linkedList.insertFront(17);
        linkedList.insertFront(666);
        LinkedList.Node head = linkedList.getHead();
        LinkedList.Node tail = linkedList.getTail();
        assertEquals(head.value, 666);
        assertEquals(tail.value, 12);
        linkedList.deleteRear();
        head = linkedList.getHead();
        tail = linkedList.getTail();
        assertEquals(head.value, 666);
        assertEquals(tail.value, 17);
    }

    @org.junit.jupiter.api.Test
    void deleteMiddle()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFront(12);
        linkedList.insertFront(17);
        linkedList.insertFront(666);
        LinkedList.Node head = linkedList.getHead();
        LinkedList.Node tail = linkedList.getTail();
        assertEquals(head.value, 666);
        assertEquals(tail.value, 12);
        linkedList.traverse();

        // Deleting assuming index 0 is the first one
        linkedList.deleteMiddle(1);
        head = linkedList.getHead();
        tail = linkedList.getTail();
        assertEquals(head.value, 666);
        assertEquals(tail.value, 12);

        linkedList.traverse();
    }

    @org.junit.jupiter.api.Test
    void delete()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFront(12);
        linkedList.insertFront(17);
        linkedList.insertFront(666);
        LinkedList.Node head = linkedList.getHead();
        LinkedList.Node tail = linkedList.getTail();
        assertEquals(head.value, 666);
        assertEquals(tail.value, 12);
        linkedList.delete(2);
        head = linkedList.getHead();
        tail = linkedList.getTail();
        assertEquals(head.value, 666);
        assertEquals(tail.value, 17);
    }

    @org.junit.jupiter.api.Test
    void searchForNodeWithValue()
    {
        int valueThatShouldExist = 666;
        int valueThatShouldNotExist = 667;
        LinkedList linkedList = new LinkedList();
        linkedList.insertFront(12);
        linkedList.insertFront(17);
        linkedList.insertFront(666);
        boolean expectedValueFound = linkedList.searchForNodeWithValue(valueThatShouldExist);
        assertTrue(expectedValueFound);
        boolean nonExistentValueFound = linkedList.searchForNodeWithValue(valueThatShouldNotExist);
        assertFalse(nonExistentValueFound);
    }

}
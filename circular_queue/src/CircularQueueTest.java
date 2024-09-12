import static org.junit.jupiter.api.Assertions.*;

class CircularQueueTest
{
    @org.junit.jupiter.api.Test
    void isFull()
    {
        int firstItem = 5;
        int secondItem = 4;
        int thirdItem = 0;
        int fourthItem = 6;
        int fifthItem = 123456;
        int sixthItem = 666;
        int seventhItem = 1924;
        int eighthItem = 24;
        int ninthItem = 25;
        int tenthItem = 444;
        CircularQueue circularQueue = new CircularQueue();
        boolean isFull = circularQueue.isFull();
        assertFalse(isFull);
        circularQueue.enqueue(firstItem);
        circularQueue.enqueue(secondItem);
        circularQueue.enqueue(thirdItem);
        circularQueue.enqueue(fourthItem);
        circularQueue.enqueue(fifthItem);
        circularQueue.enqueue(sixthItem);
        circularQueue.enqueue(seventhItem);
        circularQueue.enqueue(eighthItem);
        circularQueue.enqueue(ninthItem);
        circularQueue.enqueue(tenthItem);
        isFull = circularQueue.isFull();
        assertTrue(isFull);
    }

    @org.junit.jupiter.api.Test
    void isEmpty()
    {
        CircularQueue circularQueue = new CircularQueue();
        boolean isEmpty = circularQueue.isEmpty();
        assertTrue(isEmpty);
    }

    @org.junit.jupiter.api.Test
    void enqueue()
    {
        CircularQueue circularQueue = new CircularQueue();
        circularQueue.enqueue(1924);
        int firstElement = circularQueue.getFirstElement();
        int lastElement = circularQueue.getLastElement();
        assertEquals(firstElement, 1924);
        assertEquals(lastElement, 1924);
    }

    @org.junit.jupiter.api.Test
    void dequeue()
    {
        CircularQueue circularQueue = new CircularQueue();
        circularQueue.enqueue(1924);
        circularQueue.enqueue(6);
        // TODO length check and dequeue

    }

    @org.junit.jupiter.api.Test
    void getLength()
    {
        // We have to know that this works so we can rely on the results of the dequeue test 
    }

}
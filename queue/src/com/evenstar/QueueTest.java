package com.evenstar;

import org.junit.jupiter.api.Test;
//import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
    Enqueue, dequeue, isFull, isEmpty, peek, optionally toString
*/
class QueueTest
{
    @Test
    public void testEnqueueShouldAddANewElementToTheBack()
    {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        int frontOfLine = queue.peek();
        assertEquals(5, frontOfLine);
    }

    @Test
    public void testDequeueShouldRemoveTheFrontElement()
    {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.dequeue();
        int frontOfLine = queue.peek();
        assertEquals(6, frontOfLine);
    }

    @Test
    public void testIsEmptyShouldAscertainIfTheQueueIsEmpty()
    {
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
        queue.enqueue(71);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testIsFullShouldAscertainIfTheQueueIsFull()
    {
        Queue queue = new Queue(1);
        assertFalse(queue.isFull());
        queue.enqueue(333);
        assertTrue(queue.isFull());
    }
}
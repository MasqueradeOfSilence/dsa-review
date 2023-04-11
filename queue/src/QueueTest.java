import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
    Enqueue, dequeue, isFull, isEmpty, peek
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
}
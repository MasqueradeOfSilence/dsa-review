/**
 * My implementation of a circular queue
 *
 * Complexity is O(1) for array implementations.
 *
 * Do not use lists!
 */

public class CircularQueue
{
    private int currentFrontPosition = -1;
    private int currentRearPosition = -1;
    private int QUEUE_SIZE = 10;
    private int items[] = new int[QUEUE_SIZE];

    public boolean isFull()
    {
        return false;
    }

    public boolean isEmpty()
    {
        return currentFrontPosition == -1;
    }

    public void enQueue(int element)
    {
        if (isFull())
        {
            System.out.println("Oops! The queue is full. That really sucks for you");
        }
        else
        {
            // Loop around
            if (currentFrontPosition == -1)
            {
                currentFrontPosition = 0;
            }
            currentRearPosition = (currentRearPosition + 1) % QUEUE_SIZE;
            items[currentRearPosition] = element;
            System.out.println("Successfully added " + element + ". Love that for you");
        }
    }

}

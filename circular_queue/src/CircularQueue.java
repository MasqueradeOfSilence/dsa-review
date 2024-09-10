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
        if (currentFrontPosition == 0 && currentRearPosition == QUEUE_SIZE - 1)
        {
            return true;
        }
        if (currentFrontPosition == currentRearPosition + 1)
        {
            return true;
        }
        return false;
    }

    public boolean isEmpty()
    {
        return currentFrontPosition == -1;
    }

    public int getFirstElement() {
        return items[currentFrontPosition];
    }

    public int getLastElement() {
        return items[currentRearPosition];
    }

    public void enqueue(int element)
    {
        if (isFull())
        {
            System.out.println("Oops! The queue is full. That really sucks for you");
        }
        else
        {
            if (currentFrontPosition == -1)
            {
                // Loop around
                currentFrontPosition = 0;
            }
            currentRearPosition = (currentRearPosition + 1) % QUEUE_SIZE;
            items[currentRearPosition] = element;
            System.out.println("Successfully added " + element + ". Love that for you");
        }
    }

    public int dequeue()
    {
        return -1;
    }

    public int getLength()
    {
        return -1;
    }

}

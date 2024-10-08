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
        if (isEmpty())
        {
            System.out.println("Nothing to dequeue");
            return -1;
        }
        int elementToRemove = items[currentFrontPosition];
        // Reset queue
        if (currentFrontPosition == currentRearPosition)
        {
            currentFrontPosition = -1;
            currentRearPosition = -1;
        }
        else
        {
            currentFrontPosition = (currentFrontPosition + 1) % QUEUE_SIZE;
        }
        return elementToRemove;
    }

    public int getLength()
    {
        return currentFrontPosition > currentRearPosition ? (QUEUE_SIZE - currentFrontPosition
                + currentRearPosition + 1) : (currentRearPosition - currentFrontPosition + 1);
    }

    public void print()
    {
        if (isEmpty())
        {
            System.out.println("Empty queue: []");
            return;
        }
        for (int i = currentFrontPosition; i != currentRearPosition; i = (i + 1) % QUEUE_SIZE)
        {
            System.out.println(items[i] + " ");
        }
        System.out.println(items[currentRearPosition]);
    }

}

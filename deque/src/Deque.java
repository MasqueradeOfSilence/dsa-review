import java.util.Arrays;

/**
 *
 * DEQUE

    A deque is a double-ended queue, in which we can insert and remove from both the front *and* the back.

    It's like a movie theater with two entrances (that also serve as exits) where guests can line up to get in
        before showtime.

    Classically, it is implemented with a circular queue.

    Time complexity is O(1) for all operations.

    LINK --> https://www.programiz.com/dsa/deque
        and https://www.simplilearn.com/tutorials/data-structure-tutorial/dequeue-in-data-structure

    Unit tests are best generated via IntelliJ. Right click on a method, Generate, Test.

**/

public class Deque
{
    // Arbitrary max size at which the circular queue is full.
    private static final int MAX_SIZE = 5;
    private int circularQueue[];
    private int frontIndex = 0;
    private int rearIndex = 0;
    public static final int EMPTY_SLOT = -1;

    public static void main(String[] args)
    {
        System.out.println("Hello deque!");
    }

    public Deque()
    {
        circularQueue = new int[MAX_SIZE];
        for (int i = 0; i < MAX_SIZE; i++)
        {
            circularQueue[i] = EMPTY_SLOT;
        }
    }

    public Deque(int[] elements)
    {
        circularQueue = new int[MAX_SIZE];
        for (int i = 0; i < MAX_SIZE; i++)
        {
            if (i < elements.length)
            {
                circularQueue[i] = elements[i];
            }
            else
            {
                circularQueue[i] = EMPTY_SLOT;
            }
        }
        frontIndex = 0;
        rearIndex = elements.length - 1;
    }

    public void insertFront(int elementToInsert)
    {
        if (frontIndex == 0)
        {
            frontIndex = MAX_SIZE - 1;
        }
        else
        {
            frontIndex--;
        }
        circularQueue[frontIndex] = elementToInsert;
    }

    public void insertRear(int elementToInsert)
    {
        if (isFull())
        {
            rearIndex = 0;
        }
        else
        {
            rearIndex++;
        }
        circularQueue[rearIndex] = elementToInsert;
    }

    public void deleteFront()
    {
        if (isEmpty())
        {
            return;
        }
        circularQueue[frontIndex] = EMPTY_SLOT;
        if (frontIndex == rearIndex)
        {
            frontIndex = 0;
            rearIndex = 0;
        }
        else if (frontIndex == MAX_SIZE - 1)
        {
            frontIndex = 0;
        }
        else
        {
            frontIndex++;
        }
    }

    public void deleteRear()
    {
        if (isEmpty())
        {
            return;
        }
        circularQueue[rearIndex] = EMPTY_SLOT;
        if (frontIndex == rearIndex)
        {
            frontIndex = 0;
            rearIndex = 0;
        }
        else if (rearIndex == 0)
        {
            rearIndex = MAX_SIZE - 1;
        }
        else
        {
            rearIndex--;
        }
    }

    private boolean isEmpty()
    {
        return circularQueue.length == 0;
    }

    private boolean isFull()
    {
        return circularQueue.length - 1 >= MAX_SIZE;
    }

    public int[] getElements()
    {
        return circularQueue;
    }

    public int getFrontIndex()
    {
        return frontIndex;
    }

    public int getRearIndex()
    {
        return rearIndex;
    }

    public void setFrontIndex(int frontIndex)
    {
        this.frontIndex = frontIndex;
    }

    public void setRearIndex(int rearIndex)
    {
        this.rearIndex = rearIndex;
    }
}

/**
 *
 * DEQUE

    A deque is a double-ended queue, in which we can insert and remove from both the front *and* the back.

    It's like a movie theater with two entrances (that also serve as exits) where guests can line up to get in
        before showtime.

    Classically, it is implemented with a circular array.

    Time complexity is O(1) for all operations.

    LINK --> https://www.programiz.com/dsa/deque

    Unit tests are best generated via IntelliJ. Right click on a method, Generate, Test.

**/

public class Deque
{
    // Arbitrary max size
    private static final int MAX_SIZE = 100;
    private int circularArray[];

    public static void main(String[] args)
    {
        System.out.println("Hello deque!");
    }

    public Deque(int size)
    {
        assert(size <= MAX_SIZE);
    }

    public void insertFront(int elementToInsert)
    {

    }
}

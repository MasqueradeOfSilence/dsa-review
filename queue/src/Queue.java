import java.util.ArrayList;

public class Queue
{
    private ArrayList<Integer> elements = new ArrayList<>();

    private int MAX = Integer.MAX_VALUE;

    public Queue()
    {

    }

    // Use if you want a max size of the queue
    public Queue(int max)
    {
        this.MAX = max;
    }

    public void enqueue(int value)
    {
        if (isFull())
        {
            System.out.println("Full -- can't add");
            return;
        }
        elements.add(value);
    }

    public void dequeue()
    {
        if (!isFull())
        {
            elements.remove(0);
        }
    }

    public boolean isEmpty()
    {
        return elements.isEmpty();
    }

    public boolean isFull()
    {
        return elements.size() >= MAX;
    }

    public int peek()
    {
        return elements.get(0);
    }
}

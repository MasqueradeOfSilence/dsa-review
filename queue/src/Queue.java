import java.util.ArrayList;

public class Queue
{
    private ArrayList<Integer> elements = new ArrayList<>();

    public void enqueue(int value)
    {
        elements.add(value);
    }

    public int peek()
    {
        return elements.get(0);
    }
}

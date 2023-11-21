import objects.PQNode;
import utils.MaxHeapCustom;

import java.util.ArrayList;

public class PriorityQueueCustom
{
    private MaxHeapCustom maxHeap;

    public static void main(String[] args)
    {
        System.out.println("Hello custom priority queue implementation!");
    }

    public PriorityQueueCustom(ArrayList<PQNode> nodes)
    {
        this.maxHeap = new MaxHeapCustom(nodes);
    }

    public void insert(int priority)
    {
        this.maxHeap.addElement(priority);
    }

    public void remove()
    {
        this.maxHeap.delete();
    }

    public PQNode peek()
    {
        return null;
    }

}

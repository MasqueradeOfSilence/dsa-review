import objects.PQNode;
import utils.MaxHeapCustom;

import java.util.ArrayList;

public class PriorityQueueCustom
{
    private final MaxHeapCustom maxHeap;

    public static void main(String[] args)
    {
        System.out.println("Hello custom priority queue implementation!");
    }

    public PriorityQueueCustom(Integer[] elements)
    {
        ArrayList<PQNode> nodeList = new ArrayList<>();
        for (int i = 0; i < elements.length; i++)
        {
            nodeList.add(new PQNode(elements[i], i));
        }
        this.maxHeap = new MaxHeapCustom(nodeList);
    }

    public void insert(int priority)
    {
        this.maxHeap.addElement(priority);
    }

    public void remove(int position)
    {
        this.maxHeap.delete(position);
    }

    public PQNode peek()
    {
        return this.maxHeap.peek();
    }

    public ArrayList<PQNode> getQueue()
    {
        return this.maxHeap.getNodeList();
    }

}

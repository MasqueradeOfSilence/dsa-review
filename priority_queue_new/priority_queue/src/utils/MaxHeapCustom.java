package utils;

import objects.PQNode;

import java.util.ArrayList;

public class MaxHeapCustom
{
    private final ArrayList<PQNode> nodeList;
    private static int positionInLine = 0;

    public MaxHeapCustom(Integer[] elements)
    {
        nodeList = new ArrayList<>();
        for (int i = 0; i < elements.length; i++)
        {
            nodeList.add(new PQNode(elements[i], i));
        }
    }

    public MaxHeapCustom(ArrayList<PQNode> nodeList)
    {
        this.nodeList = nodeList;
    }

    private int findLastNonLeafNode()
    {
        return (int)Math.floor((nodeList.size() / 2.0) - 1.0);
    }

    public int computeStartingIndex()
    {
        return findLastNonLeafNode();
    }

    public PQNode computeLeftChildAtIndex(int index)
    {
        int leftChildIndex = 2 * index + 1;
        return nodeList.get(leftChildIndex);
    }

    public void addElement(int priority)
    {
        addPQNode(new PQNode(priority, positionInLine));
        positionInLine++;
    }

    public void delete()
    {

    }
    private void addPQNode(PQNode node)
    {
        nodeList.add(node);
        heapify();
    }

    public ArrayList<PQNode> heapify()
    {
        int startIndex = computeStartingIndex();

        return nodeList;
    }
}

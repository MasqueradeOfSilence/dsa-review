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

    private int computeLeftChildIndex(int parentIndex)
    {
        return 2 * parentIndex + 1;
    }

    public PQNode computeLeftChildAtIndex(int index)
    {
        int leftChildIndex = computeLeftChildIndex(index);
        return nodeList.get(leftChildIndex);
    }

    private int computeRightChildIndex(int parentIndex)
    {
        return 2 * parentIndex + 2;
    }

    public PQNode computeRightChildAtIndex(int index)
    {
        int rightChildIndex = computeRightChildIndex(index);
        return nodeList.get(rightChildIndex);
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
        PQNode leftChild = computeLeftChildAtIndex(startIndex);

        return nodeList;
    }
}

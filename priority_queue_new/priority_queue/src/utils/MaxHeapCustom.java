package utils;

import objects.PQNode;

import java.util.ArrayList;

public class MaxHeapCustom
{
    public ArrayList<PQNode> getNodeList()
    {
        return nodeList;
    }

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

    private boolean prioritiesAreEqual(PQNode left, PQNode right)
    {
        return left.getPriorityValue() == right.getPriorityValue();
    }

    private PQNode earlierNode(PQNode left, PQNode right)
    {
        assert(left.getQueueOrder() != right.getQueueOrder());
        if (left.getQueueOrder() > right.getQueueOrder())
        {
            return left;
        }
        return right;
    }

    private PQNode nodeWithGreaterValue(PQNode left, PQNode right)
    {
        int leftValue = left.getPriorityValue();
        int rightValue = right.getPriorityValue();
        if (leftValue > rightValue)
        {
            return left;
        }
        else if (leftValue == rightValue)
        {
            return earlierNode(left, right);
        }
        return right;
    }

    public PQNode findLargerChild(int index)
    {
        PQNode leftChild = computeLeftChildAtIndex(index);
        PQNode rightChild = computeRightChildAtIndex(index);
        if (prioritiesAreEqual(leftChild, rightChild))
        {
            return earlierNode(leftChild, rightChild);
        }
        return nodeWithGreaterValue(leftChild, rightChild);
    }

    private int findIndexOfChild(PQNode child)
    {
        for (int i = 0; i < nodeList.size(); i++)
        {
            if (child == nodeList.get(i))
            {
                return i;
            }
        }
        return -1;
    }

    public void swapParentAndChild(PQNode parent, PQNode child, int parentIndex)
    {
        int childIndex = findIndexOfChild(child);
        assert(childIndex != -1);
        nodeList.set(parentIndex, child);
        nodeList.set(childIndex, parent);
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
        PQNode parent = nodeList.get(startIndex);
        PQNode largerChild = findLargerChild(startIndex);
        swapParentAndChild(parent, largerChild, startIndex);

        return nodeList;
    }
}

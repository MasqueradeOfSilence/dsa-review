package com.evenstar;

import java.util.ArrayList;

// It doesn't like com.evenstar on IntelliJ Mac, so I unchecked "Wrong package statement"
// https://stackoverflow.com/questions/26440623/package-name-does-not-correspond-to-the-file-path-intellij
// Also note that this is not the same thing as Java's priority queue class
public class PriorityQueue
{
    // The max heap data member should not need to be exposed to other classes at any point.
    private com.evenstar.MaxHeap maxHeap;

    public PriorityQueue(ArrayList<Integer> nodeValues)
    {
        maxHeap = new com.evenstar.MaxHeap(nodeValues);
    }

    public void heapify()
    {
        maxHeap.heapify();
    }

    public int findLargerValue(int value1, int value2)
    {
        return Math.max(value1, value2);
    }

    public int findIndexOfLastNonLeafNodeInTree()
    {
        return maxHeap.findIndexOfLastNonLeafNodeInTree();
    }

    public int findLeftChild(int index)
    {
        return maxHeap.getNodes().get(findIndexOfLeftChild(index));
    }

    public int findRightChild(int index)
    {
        return maxHeap.getNodes().get(findIndexOfRightChild(index));
    }

    public int findIndexOfLeftChild(int index)
    {
        return maxHeap.findIndexOfLeftChild(index);
    }

    public int findIndexOfRightChild(int index)
    {
        return maxHeap.findIndexOfRightChild(index);
    }

    public int getNumNodes()
    {
        return maxHeap.getNodes().size();
    }

    public ArrayList<Integer> getNodes()
    {
        return maxHeap.getNodes();
    }
}

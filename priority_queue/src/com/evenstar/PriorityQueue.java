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

    }

    public int findIndexOfLastNonLeafNodeInTree()
    {
        double numNodes = getNumNodes();
        return (int) Math.floor((numNodes / 2) - 1);
    }

    public int findIndexOfLeftChild(int index)
    {
        return 2 * index + 1;
    }

    public int findIndexOfRightChild(int index)
    {
        return 2 * index + 2;
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

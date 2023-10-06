package com.evenstar;

import java.util.ArrayList;

public class MaxHeap
{
    private ArrayList<Integer> nodes;

    public MaxHeap(ArrayList<Integer> nodes)
    {
        this.nodes = nodes;
    }

    public ArrayList<Integer> getNodes()
    {
        return nodes;
    }

    public void heapify()
    {
        int startIndex = findIndexOfLastNonLeafNodeInTree();
        int leftChildIndex = findIndexOfLeftChild(startIndex);
        int rightChildIndex = findIndexOfRightChild(startIndex);
        int leftChildValue = findLeftChild(leftChildIndex);
    }

    public int findLeftChild(int index)
    {
        return nodes.get(index);
    }

    public int findIndexOfLeftChild(int index)
    {
        return 2 * index + 1;
    }

    public int findIndexOfRightChild(int index)
    {
        return 2 * index + 2;
    }

    public int findIndexOfLastNonLeafNodeInTree()
    {
        double numNodes = nodes.size();
        return (int) Math.floor((numNodes / 2) - 1);
    }
}

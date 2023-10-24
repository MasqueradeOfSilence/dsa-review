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
        int leftChildValue = findChildAtIndex(leftChildIndex);
        int rightChildValue = findChildAtIndex(rightChildIndex);
        if (leftChildIsLarger(leftChildValue, rightChildValue))
        {
            // Basically, we find the larger child and swap that. I bet we don't need this if-else
        }
        else if (rightChildIsLarger(leftChildValue, rightChildValue))
        {

        }
        else
        {
            // Equal size case
        }
        
    }

    // unit test me pls
    public int findLargerChild(int child1, int child2)
    {
        return Math.max(child1, child2);
    }

    // not sure if needed
    public boolean leftChildIsLarger(int leftChild, int rightChild)
    {
        return leftChild > rightChild;
    }

    public boolean rightChildIsLarger(int leftChild, int rightChild)
    {
        return leftChild < rightChild;
    }

    // probably need to unit test these too
    public int findChildAtIndex(int index)
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

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
    }

    public int findIndexOfLastNonLeafNodeInTree()
    {
        double numNodes = nodes.size();
        return (int) Math.floor((numNodes / 2) - 1);
    }
}

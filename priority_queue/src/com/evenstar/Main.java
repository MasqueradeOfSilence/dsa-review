package com.evenstar;

import java.util.ArrayList;

/**
 * Heapify reference: https://builtin.com/software-engineering-perspectives/heapify-heap-tree-cpp
 */

public class Main
{
    // Java also has a Priority Queue, so we are specifying our local one.
    private static com.evenstar.PriorityQueue priorityQueue;
    public static void main(String[] args)
    {
        System.out.println("Hello priority queue!");
        ArrayList<Integer> nodeValues = new ArrayList<>();
        priorityQueue = new com.evenstar.PriorityQueue(nodeValues);
    }
}

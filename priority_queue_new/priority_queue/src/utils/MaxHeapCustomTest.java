package utils;

import objects.PQNode;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


class MaxHeapCustomTest
{

    @Test
    void addElement()
    {
    }

    @Test
    void delete()
    {
    }

    @Test
    void computeStartIndexShouldGetLastNonLeafNode()
    {
        Integer[] elements = { 3, 5, 8, 10, 17, 11, 13, 19, 22, 24, 29 };
        MaxHeapCustom maxHeap = new MaxHeapCustom(elements);
        int startIndex = maxHeap.computeStartingIndex();
        int expectedStartIndex = 4;
        assertEquals(startIndex, expectedStartIndex);
    }

    @Test
    void computeLeftChildAtIndexShouldGetTheValueOfTheLeftChildNode()
    {
        Integer[] elements = { 3, 5, 8, 10, 17, 11, 13, 19, 22, 24, 29 };
        MaxHeapCustom maxHeap = new MaxHeapCustom(elements);
        PQNode leftChildOfStartIndex = maxHeap.computeLeftChildAtIndex(4);
        int expectedValueOfLeftChild = 24;
        int actualValueOfLeftChild = leftChildOfStartIndex.getPriorityValue();
        assertEquals(expectedValueOfLeftChild, actualValueOfLeftChild);
    }

    @Test
    void computeRightChildAtIndexShouldGetTheValueOfTheRightChildNode()
    {
        Integer[] elements = { 3, 5, 8, 10, 17, 11, 13, 19, 22, 24, 29 };
        MaxHeapCustom maxHeap = new MaxHeapCustom(elements);
        PQNode rightChildOfStartIndex = maxHeap.computeRightChildAtIndex(4);
        int expectedValueOfRightChild = 29;
        int actualValueOfRightChild = rightChildOfStartIndex.getPriorityValue();
        assertEquals(expectedValueOfRightChild, actualValueOfRightChild);
    }

    @Test
    void findLargerChildShouldReturnTheLargerChildLeftOrRight()
    {
        Integer[] elements = { 3, 5, 8, 10, 17, 11, 13, 19, 22, 24, 29 };
        MaxHeapCustom maxHeap = new MaxHeapCustom(elements);
        PQNode largerChildOfStartIndex = maxHeap.findLargerChild(4);
        int expectedValueOfLargerChild = 29;
        int actualValueOfLargerChild = largerChildOfStartIndex.getPriorityValue();
        assertEquals(expectedValueOfLargerChild, actualValueOfLargerChild);
    }

    @Test
    void swapParentAndChildShouldSwitchPositions()
    {
        Integer[] elements = { 3, 5, 8, 10, 17, 11, 13, 19, 22, 24, 29 };
        MaxHeapCustom maxHeap = new MaxHeapCustom(elements);
        PQNode parent = maxHeap.getNodeList().get(4);
        PQNode child = maxHeap.getNodeList().get(10);
        assertEquals(maxHeap.getNodeList().get(4).getPriorityValue(), 17);
        assertEquals(maxHeap.getNodeList().get(10).getPriorityValue(), 29);
        maxHeap.swapParentAndChild(parent, child, 4);
        assertEquals(maxHeap.getNodeList().get(4).getPriorityValue(), 29);
        assertEquals(maxHeap.getNodeList().get(10).getPriorityValue(), 17);
    }

    @Test
    void heapifyShouldEnforceMaxHeapProperty()
    {
        Integer[] elements = { 3, 5, 8, 10, 17, 11, 13, 19, 22, 24, 29 };
        MaxHeapCustom maxHeap = new MaxHeapCustom(elements);
        ArrayList<PQNode> nodes = maxHeap.heapify();
        Integer[] prioritized = { 29, 24, 13, 22, 17, 11, 8, 19, 10, 5, 3 };
        assertEquals(nodes.size(), prioritized.length);
        System.out.println("Nodes: ");
        for (int i = 0; i < nodes.size(); i++)
        {
            System.out.println(nodes.get(i).getPriorityValue());
        }
        for (int i = 0; i < nodes.size(); i++)
        {
            PQNode currentNode = nodes.get(i);
            int value = currentNode.getPriorityValue();
            assertEquals(value, prioritized[i]);
        }
        System.out.println("THE END");
    }

    @Test
    void heapifyShouldEnforceFIFOForEqualPriorities()
    {
        Integer[] elements = { 3, 5, 8, 10, 17, 11, 13, 19, 22, 17, 24, 29 };
    }
}
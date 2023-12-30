package utils;

import objects.PQNode;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


class MaxHeapCustomTest
{
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
        for (int i = 0; i < nodes.size(); i++)
        {
            PQNode currentNode = nodes.get(i);
            int value = currentNode.getPriorityValue();
            assertEquals(value, prioritized[i]);
        }
    }

    @Test
    void heapifyShouldEnforceFIFOForEqualPriorities()
    {
        Integer[] elements = { 3, 5, 8, 10, 17, 17, 11, 13, 19, 22, 24, 29 };
        // Once this is working, we can then extend out to the priority queue.
        MaxHeapCustom maxHeap = new MaxHeapCustom(elements);
        ArrayList<PQNode> nodes = maxHeap.heapify();
        int firstNodeOrdering = -1;
        int secondNodeOrdering = -1;
        for (PQNode node : nodes)
        {
            if (node.getPriorityValue() == 17)
            {
                if (firstNodeOrdering == -1)
                {
                    firstNodeOrdering = node.getQueueOrder();
                }
                else
                {
                    secondNodeOrdering = node.getQueueOrder();
                }
            }
        }
        assertTrue(firstNodeOrdering > secondNodeOrdering);
    }

    @Test
    void deleteShouldEnforceTheMaxHeapProperty()
    {
        // https://www.programiz.com/dsa/priority-queue
        Integer[] elements = { 9, 3, 7, 1, 4, 2, 5 };
        int deletePosition = 1;
        MaxHeapCustom maxHeap = new MaxHeapCustom(elements);
        maxHeap.delete(deletePosition);
        Integer[] expectedElementsWhenDeleted = { 9, 5, 7, 1, 4, 2 };
        ArrayList<PQNode> nodes = maxHeap.getNodeList();
        for (int i = 0; i < nodes.size(); i++)
        {
            PQNode currentNode = nodes.get(i);
            int value = currentNode.getPriorityValue();
            assertEquals(value, expectedElementsWhenDeleted[i]);
        }
    }

    @Test
    void insertShouldInsertAndReHeapify()
    {
        Integer[] elements = { 9, 3, 5, 1, 4, 2 };
        int elementToInsert = 7;
        MaxHeapCustom maxHeap = new MaxHeapCustom(elements);
        maxHeap.addElement(elementToInsert);
        // The Programiz example is slightly off
        Integer[] expectedElementsAfterInsertion = { 9, 4, 7, 1, 3, 2, 5 };
        ArrayList<PQNode> nodes = maxHeap.getNodeList();
        // print out the node at each step
        for (int i = 0; i < nodes.size(); i++)
        {
            PQNode currentNode = nodes.get(i);
            int value = currentNode.getPriorityValue();
            assertEquals(value, expectedElementsAfterInsertion[i]);
        }
    }

    @Test
    void peekShouldReturnTheFirstElement()
    {
        Integer[] elements = { 9, 3, 7, 1, 4, 2, 5 };
        MaxHeapCustom maxHeap = new MaxHeapCustom(elements);
        PQNode firstNode = maxHeap.peek();
        int expectedFirst = 9;
        int actualFirst = firstNode.getPriorityValue();
        assertEquals(expectedFirst, actualFirst);
    }
}
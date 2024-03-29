import com.evenstar.PriorityQueue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/*
    Methods tested:
*/
class PriorityQueueTest
{
    private PriorityQueue priorityQueue;
    private static ArrayList<Integer> nodes;
    private static ArrayList<Integer> constructNodeArray()
    {
        ArrayList<Integer> nodes = new ArrayList<>();
        nodes.add(3);
        nodes.add(5);
        nodes.add(8);
        nodes.add(10);
        nodes.add(17);
        nodes.add(11);
        nodes.add(13);
        nodes.add(19);
        nodes.add(22);
        nodes.add(24);
        nodes.add(29);
        return nodes;
    }

    @BeforeAll
    public static void initializeNodeArray()
    {
        nodes = constructNodeArray();
    }

    @BeforeEach
    public void createPriorityQueue()
    {
        this.priorityQueue = new PriorityQueue(nodes);
    }

    // This is the starting index of the array for heapify
    @Test
    public void testFindIndexOfLastNonLeafNodeInTreeShouldReturnTheLowestRightmostNodeThatHasChildren()
    {
        int expectedNodeValue = 4;
        int lastNodeValue = priorityQueue.findIndexOfLastNonLeafNodeInTree();
        assertEquals(expectedNodeValue, lastNodeValue);
    }

    @Test
    public void testHeapifyShouldCorrectlyHeapifyTheMaxHeap()
    {
        priorityQueue.heapify();
        ArrayList<Integer> finalNodes = priorityQueue.getNodes();
        int expectedSize = 10;
        // heapified: 29, 24, 13, 22, 17, 11, 8, 19, 10, 5, 3
        assertEquals(finalNodes.get(0), 29);
        assertEquals(finalNodes.get(1), 24);
        assertEquals(finalNodes.get(2), 13);
        assertEquals(finalNodes.get(3), 22);
        assertEquals(finalNodes.get(4), 17);
        assertEquals(finalNodes.get(5), 11);
        assertEquals(finalNodes.get(6), 8);
        assertEquals(finalNodes.get(7), 19);
        assertEquals(finalNodes.get(8), 10);
        assertEquals(finalNodes.get(9), 5);
        assertEquals(finalNodes.get(10), 3);
        assertEquals(finalNodes.size(), expectedSize);
    }

    @Test
    public void testFindIndexOfLeftChildShouldFindTheIndexOfTheLeftChild()
    {
        // Left child = 2 * index + 1
        // at index 4, value = 17
        int startingNodeIndex = 4;
        int expectedLeftChildIndex = 9;
        int actualLeftChildIndex = priorityQueue.findIndexOfLeftChild(startingNodeIndex);
        // at index 9, value = 24
        assertEquals(expectedLeftChildIndex, actualLeftChildIndex);
    }

    @Test
    public void testFindIndexOfRightChildShouldFindTheIndexOfTheRightChild()
    {
        // Right child = 2 * index + 2
        int startingNodeIndex = 4;
        int expectedRightChildIndex = 10; // value = 29
        int actualRightChildIndex = priorityQueue.findIndexOfRightChild(startingNodeIndex);
        assertEquals(expectedRightChildIndex, actualRightChildIndex);
    }

    @Test
    public void testFindLeftChildShouldFindTheLeftChild()
    {
        int startingNodeIndex = 4;
        int expectedValue = 24;
        int actualValue = priorityQueue.findLeftChild(startingNodeIndex);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testFindRightChildShouldFindTheRightChild()
    {
        int startingNodeIndex = 4;
        int expectedValue = 29;
        int actualValue = priorityQueue.findRightChild(startingNodeIndex);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testFindLargerValueShouldReturnTheLargerValue()
    {
        int leftChildValue = 24;
        int rightChildValue = 29;
        // intellisense calls this redundant but I like the clarity
        int expectedLargerValue = rightChildValue;
        int actualLargerValue = priorityQueue.findLargerValue(leftChildValue, rightChildValue);
        assertEquals(expectedLargerValue, actualLargerValue);
    }

}
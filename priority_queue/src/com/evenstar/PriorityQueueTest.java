import com.evenstar.PriorityQueue;
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
    private ArrayList<Integer> constructNodeArray()
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

    @BeforeEach
    public void createPriorityQueue()
    {
        ArrayList<Integer> nodes = constructNodeArray();
        this.priorityQueue = new PriorityQueue(nodes);
    }

    @Test
    public void testFindLastNonLeafNodeInTreeShouldReturnTheLowestRightmostNodeThatHasChildren()
    {
        int expectedNodeValue = 17;
        int lastNodeValue = priorityQueue.findLastNonLeafNodeInTree();
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
    public void testFindLeftChildShouldFindTheLeftChildOfTheGivenNode()
    {
        // Left child = 2 * index - 1
        // Index = 4, value = 17
        int firstLeftChildIndex = priorityQueue.findLeftChild(4);
        // Index = 9, value = 24
        assertEquals(firstLeftChildIndex, 9);
    }
}
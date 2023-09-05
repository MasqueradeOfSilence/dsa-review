import com.evenstar.PriorityQueue;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/*
    Methods tested:
*/
class PriorityQueueTest
{
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

    @Test
    public void testFindLastNonLeafNodeInTreeShouldReturnTheLowestRightmostNodeThatHasChildren()
    {
        int expectedNodeValue = 17;
        ArrayList<Integer> nodes = constructNodeArray();
        PriorityQueue priorityQueue = new PriorityQueue(nodes);
    }

    @Test
    public void testHeapifyShouldCorrectlyHeapifyTheMaxHeap()
    {
        ArrayList<Integer> nodes = constructNodeArray();
        PriorityQueue priorityQueue = new PriorityQueue(nodes);
        priorityQueue.heapify();
        ArrayList<Integer> finalNodes = priorityQueue.getNodes();
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
    }
}
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
    }
}
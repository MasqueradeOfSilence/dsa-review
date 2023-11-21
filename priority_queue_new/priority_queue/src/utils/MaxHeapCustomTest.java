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
            int value = currentNode.getPriority();
            assertEquals(value, prioritized[i]);
        }
    }

    @Test
    void heapifyShouldEnforceFIFOForEqualPriorities()
    {

    }
}
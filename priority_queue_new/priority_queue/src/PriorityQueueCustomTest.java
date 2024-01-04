import objects.PQNode;
import utils.MaxHeapCustom;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PriorityQueueCustomTest
{

    @org.junit.jupiter.api.Test
    void insertShouldAddElementAndObeyPriorityRules()
    {
        Integer[] elements = { 9, 3, 5, 1, 4, 2 };
        int elementToInsert = 7;
        PriorityQueueCustom pq = new PriorityQueueCustom(elements);
        pq.insert(elementToInsert);
        Integer[] expectedElementsAfterInsertion = { 9, 4, 7, 1, 3, 2, 5 };
        ArrayList<PQNode> nodes = pq.getQueue();
        for (int i = 0; i < nodes.size(); i++)
        {
            PQNode currentNode = nodes.get(i);
            int value = currentNode.getPriorityValue();
            assertEquals(value, expectedElementsAfterInsertion[i]);
        }
    }

    @org.junit.jupiter.api.Test
    void removeShouldRemoveElementAndObeyPriorityRules()
    {
        Integer[] elements = { 9, 3, 7, 1, 4, 2, 5 };
        int deletePosition = 1;
        PriorityQueueCustom pq = new PriorityQueueCustom(elements);
        pq.remove(deletePosition);
        Integer[] expectedElementsWhenDeleted = { 9, 5, 7, 1, 4, 2 };
        ArrayList<PQNode> nodes = pq.getQueue();
        for (int i = 0; i < nodes.size(); i++)
        {
            PQNode currentNode = nodes.get(i);
            int value = currentNode.getPriorityValue();
            assertEquals(value, expectedElementsWhenDeleted[i]);
        }
    }

    @org.junit.jupiter.api.Test
    void peekShouldReturnTheRoot()
    {
        Integer[] elements = { 9, 3, 7, 1, 4, 2, 5 };
        PriorityQueueCustom pq = new PriorityQueueCustom(elements);
        PQNode firstNode = pq.peek();
        int expectedFirst = 9;
        int actualFirst = firstNode.getPriorityValue();
        assertEquals(expectedFirst, actualFirst);
    }
}
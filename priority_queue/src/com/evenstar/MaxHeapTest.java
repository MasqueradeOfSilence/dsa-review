import com.evenstar.MaxHeap;
import com.evenstar.PriorityQueue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MaxHeapTest
{
    @Test
    public void testFindLargerChildShouldReturnTheLargerChild()
    {
        MaxHeap maxHeap = new MaxHeap(new ArrayList<Integer>());
        int child1 = 10;
        int child2 = 8;
        // should this be in a utils class instead?
        int largerChild = maxHeap.findLargerChild(child1, child2);
        assertEquals(largerChild, child1);
    }
}
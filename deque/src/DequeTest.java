import static org.junit.jupiter.api.Assertions.*;

class DequeTest
{

    @org.junit.jupiter.api.Test
    void insertFrontShouldPutIntegerAtFrontOfDeque()
    {
        int[] elements = { 7, 3, 1 };
        Deque deque = new Deque(elements);
        int elementToInsert = 5;
        deque.insertFront(elementToInsert);
        int[] elementsAfterAdd = {}; // https://www.simplilearn.com/tutorials/data-structure-tutorial/dequeue-in-data-structure
        //assertEquals();
    }
}
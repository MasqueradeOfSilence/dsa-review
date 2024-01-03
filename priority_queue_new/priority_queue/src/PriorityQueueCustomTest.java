import static org.junit.jupiter.api.Assertions.*;

class PriorityQueueCustomTest
{

    @org.junit.jupiter.api.Test
    void insertShouldAddElementAndObeyPriorityRules()
    {
        Integer[] elements = { 9, 3, 5, 1, 4, 2 };
        int elementToInsert = 7;
        PriorityQueueCustom pq = new PriorityQueueCustom(elements);
    }

    @org.junit.jupiter.api.Test
    void removeShouldRemoveElementAndObeyPriorityRules()
    {
    }
}
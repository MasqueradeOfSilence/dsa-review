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
        int[] actualElementsAfterAdd = deque.getElements();
        int expectedFirstElement = 7;
        int expectedSecondElement = 3;
        int expectedThirdElement = 1;
        int expectedFourthElement = Deque.EMPTY_SLOT;
        int expectedLastElement = 5;
        int actualFirstElement = actualElementsAfterAdd[0];
        int actualSecondElement = actualElementsAfterAdd[1];
        int actualThirdElement = actualElementsAfterAdd[2];
        int actualFourthElement = actualElementsAfterAdd[3];
        int actualLastElement = actualElementsAfterAdd[actualElementsAfterAdd.length - 1];
        assertEquals(expectedFirstElement, actualFirstElement);
        assertEquals(expectedSecondElement, actualSecondElement);
        assertEquals(expectedThirdElement, actualThirdElement);
        assertEquals(expectedFourthElement, actualFourthElement);
        assertEquals(expectedLastElement, actualLastElement);
    }
}
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
        int expectedFrontIndex = 4;
        int expectedRearIndex = 2;
        int actualFrontIndex = deque.getFrontIndex();
        int actualRearIndex = deque.getRearIndex();
        assertEquals(expectedFrontIndex, actualFrontIndex);
        assertEquals(expectedRearIndex, actualRearIndex);
    }

    @org.junit.jupiter.api.Test
    void insertRearShouldPutIntegerAtRearOfDeque()
    {
        int[] elements = { 7, 3, 1 };
        Deque deque = new Deque(elements);
        int elementToInsert = 5;
        deque.insertRear(elementToInsert);
        int[] actualElementsAfterAdd = deque.getElements();
        int expectedFirstElement = 7;
        int expectedSecondElement = 3;
        int expectedThirdElement = 1;
        int expectedFourthElement = elementToInsert;
        int expectedFifthElement = Deque.EMPTY_SLOT;
        int actualFirstElement = actualElementsAfterAdd[0];
        int actualSecondElement = actualElementsAfterAdd[1];
        int actualThirdElement = actualElementsAfterAdd[2];
        int actualFourthElement = actualElementsAfterAdd[3];
        int actualFifthElement = actualElementsAfterAdd[4];
        assertEquals(expectedFirstElement, actualFirstElement);
        assertEquals(expectedSecondElement, actualSecondElement);
        assertEquals(expectedThirdElement, actualThirdElement);
        assertEquals(expectedFourthElement, actualFourthElement);
        assertEquals(expectedFifthElement, actualFifthElement);
        int expectedFrontIndex = 0;
        int expectedRearIndex = 3;
        int actualFrontIndex = deque.getFrontIndex();
        int actualRearIndex = deque.getRearIndex();
        assertEquals(expectedFrontIndex, actualFrontIndex);
        assertEquals(expectedRearIndex, actualRearIndex);
    }

    @org.junit.jupiter.api.Test
    void deleteFrontShouldRemoveValueAtFrontPointer()
    {
        int[] elements = { 7, 3, 1 };
        Deque deque = new Deque(elements);
        deque.deleteFront();
        int expectedFirstElement = Deque.EMPTY_SLOT;
        int expectedSecondElement = 3;
        int expectedThirdElement = 1;
        int[] actualElementsAfterDelete = deque.getElements();
        int actualFirstElement = actualElementsAfterDelete[0];
        int actualSecondElement = actualElementsAfterDelete[1];
        int actualThirdElement = actualElementsAfterDelete[2];
        assertEquals(expectedFirstElement, actualFirstElement);
        assertEquals(expectedSecondElement, actualSecondElement);
        assertEquals(expectedThirdElement, actualThirdElement);
        int expectedFrontIndex = 1;
        int expectedRearIndex = 2;
        int actualFrontIndex = deque.getFrontIndex();
        int actualRearIndex = deque.getRearIndex();
        assertEquals(expectedFrontIndex, actualFrontIndex);
        assertEquals(expectedRearIndex, actualRearIndex);
    }

    @org.junit.jupiter.api.Test
    void deleteRearShouldRemoveValueAtRearPointer()
    {
        int[] elements = { 7, 3, 1 };
        Deque deque = new Deque(elements);
        deque.deleteRear();
        int expectedFirstElement = 7;
        int expectedSecondElement = 3;
        int expectedThirdElement = Deque.EMPTY_SLOT;
        int[] actualElementsAfterDelete = deque.getElements();
        int actualFirstElement = actualElementsAfterDelete[0];
        int actualSecondElement = actualElementsAfterDelete[1];
        int actualThirdElement = actualElementsAfterDelete[2];
        assertEquals(expectedFirstElement, actualFirstElement);
        assertEquals(expectedSecondElement, actualSecondElement);
        assertEquals(expectedThirdElement, actualThirdElement);
        int expectedFrontIndex = 0;
        int expectedRearIndex = 1;
        int actualFrontIndex = deque.getFrontIndex();
        int actualRearIndex = deque.getRearIndex();
        assertEquals(expectedFrontIndex, actualFrontIndex);
        assertEquals(expectedRearIndex, actualRearIndex);
    }
}
import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListTest
{
    @org.junit.jupiter.api.Test
    void insertFront()
    {
        DoubleLinkedList dll = new DoubleLinkedList();
        int data1 = 6;
        int data2 = 1924;
        dll.insertFront(data1);
        dll.insertFront(data2);
        
    }
}
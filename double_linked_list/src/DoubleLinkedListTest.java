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
        int front = dll.getFront();
        assertEquals(front, data2);
    }

    @org.junit.jupiter.api.Test
    void insertAfter()
    {
        DoubleLinkedList dll = new DoubleLinkedList();
        int data1 = 6;
        int data2 = 1924;
        dll.insertFront(data1);
        dll.insertFront(data2);
        int data3 = 666;
        dll.insertAfter(dll.head, data3);
        // 1924 -> 666 -> 6
        int data4 = 10;
        dll.insertAfter(dll.head.next.next, data4);
        // 1924 -> 666 -> 6 -> 10
        assertEquals(dll.head.value, data2);
        assertEquals(dll.head.next.value, data3);
        assertEquals(dll.head.next.next.value, data1);
        assertEquals(dll.head.next.next.next.value, data4);
    }

    @org.junit.jupiter.api.Test
    void insertEnd()
    {
        DoubleLinkedList dll = new DoubleLinkedList();
        int data1 = 6;
        int data2 = 1924;
        int data3 = 666;
        int data4 = 444;
        dll.insertFront(data1);
        dll.insertFront(data2);
        dll.insertFront(data3);
        dll.insertEnd(444);
    }
}
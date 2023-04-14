package com.evenstar;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello queue!");
        Queue queue = new Queue(4);
        queue.enqueue(6);
        queue.enqueue(24);
        queue.enqueue(1924);
        queue.enqueue(25);
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        queue.enqueue(68);
        System.out.println("Below me, a error should appear due to a full queue:");
        queue.enqueue(2);
    }
}

package com.evenstar;

public class Main
{

    public static void main(String[] args)
    {
        Stack stack = new Stack();
        int first = 4;
        int second = 12;
        int third = 1924;
        int fourth = 6;
        int fifth = 666;
        stack.push(first);
        stack.push(second);
        stack.push(third);
        stack.push(fourth);
        stack.push(fifth);
        // Should see 666 😈
        System.out.println(stack.peek());
        stack.pop();
        // we should now see how many points spongebob got on his driver's test (6)
        System.out.println(stack.peek());
    }
}

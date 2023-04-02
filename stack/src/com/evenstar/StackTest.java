package com.evenstar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest
{
    Stack stack = new Stack();

    @Test
    public void testPushShouldAddANewElementToTheStack()
    {
        int initialSize = stack.getSize();
        assertEquals(initialSize, 0);
        int pancake = 1;
        stack.push(pancake);
        int finalSize = stack.getSize();
        assertEquals(finalSize, 1);
        assertEquals(stack.at(0), 1);
    }

    @Test
    public void testPopShouldRemoveAnElementFromTheStack()
    {
        stack = new Stack();
        int pancake = 1;
        stack.push(pancake);
        stack.pop();
        int finalSize = stack.getSize();
        assertEquals(finalSize, 0);
    }
}
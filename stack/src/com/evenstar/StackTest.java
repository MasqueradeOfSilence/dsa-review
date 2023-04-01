package com.evenstar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest
{
    Stack stack = new Stack();

    @Test
    public void TestPushShouldAddANewElementToTheStack()
    {
        int initialSize = stack.getSize();
        assertEquals(initialSize, 0);
        int pancake = 1;
        stack.push(pancake);
        int finalSize = stack.getSize();
        assertEquals(finalSize, 1);
        assertEquals(stack.at(0), 1);
    }
}
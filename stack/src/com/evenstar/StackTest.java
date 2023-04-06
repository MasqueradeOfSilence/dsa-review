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

    @Test
    public void testPeekShouldShowUsTheTopElementOfTheStack()
    {
        stack = new Stack();
        int pancake = 6;
        int anotherPancake = 5;
        stack.push(pancake);
        stack.push(anotherPancake);
        int top = stack.peek();
        assertEquals(top, anotherPancake);
    }

    @Test
    public void testIsEmptyShouldInformUsIfTheStackIsEmpty()
    {
        stack = new Stack();
        boolean isEmpty = stack.isEmpty();
        assertTrue(isEmpty);
        int pancake = 3;
        stack.push(pancake);
        boolean isEmptyAfterInserting = stack.isEmpty();
        assertFalse(isEmptyAfterInserting);
    }

    @Test
    public void testToStringShouldPrintTheStack()
    {
        stack = new Stack();
        int pancake = 6;
        int anotherPancake = 5;
        stack.push(pancake);
        stack.push(anotherPancake);
        // expecting 5, 6. Not mocking the print right now, just visually examining.
        stack.print();
    }

    @Test
    public void testIsFullShouldInformUsIfTheStackIsFull()
    {
        stack = new Stack(2);
        boolean isFull = stack.isFull();
        assertFalse(isFull);
        int pancake = 6;
        int anotherPancake = 5;
        stack.push(pancake);
        stack.push(anotherPancake);
        isFull = stack.isFull();
        assertTrue(isFull);
    }
}
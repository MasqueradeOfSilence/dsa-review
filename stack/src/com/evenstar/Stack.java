package com.evenstar;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Stack elements: Push, Pop, Size, IsEmpty, IsFull, Print, Peek
 * We are making a stack of ints
 * Stack = LIFO
 */

public class Stack
{
    private int MAX = Integer.MAX_VALUE;
    ArrayList<Integer> elements = new ArrayList<>();

    public Stack()
    {

    }

    public Stack(int max)
    {
        this.MAX = max;
    }

    public void push(int item)
    {
        if (this.isFull())
        {
            System.out.println("Stack is full. Cannot add anything else!");
            return;
        }
        elements.add(item);
    }

    public void pop()
    {
        if (elements.size() > 0)
        {
            elements.remove(elements.size() - 1);
        }
    }

    public int peek()
    {
        return elements.get(elements.size() - 1);
    }

    public int getSize()
    {
        return elements.size();
    }

    public int at(int where)
    {
        return elements.get(where);
    }

    public boolean isEmpty()
    {
        return elements.size() == 0;
    }

    public boolean isFull()
    {
        return elements.size() >= MAX;
    }

    public void print()
    {
        // shallow copy so we don't mess with access of the original
        ArrayList<Integer> elementsCopy = new ArrayList<>(elements);
        Collections.reverse(elementsCopy);
        System.out.println(elementsCopy.toString());
    }
}

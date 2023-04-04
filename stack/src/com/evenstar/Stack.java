package com.evenstar;

import java.util.ArrayList;

/**
 * Stack elements: Push, Pop, Size, IsEmpty, Print
 * We are making a stack of ints
 * Stack = LIFO
 */

public class Stack
{
    ArrayList<Integer> elements = new ArrayList<>();

    public void push(int item)
    {
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
}

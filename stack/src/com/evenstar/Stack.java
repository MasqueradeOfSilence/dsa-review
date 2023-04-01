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

    public int getSize()
    {
        return elements.size();
    }

    public int at(int where)
    {
        return elements.get(where);
    }
}

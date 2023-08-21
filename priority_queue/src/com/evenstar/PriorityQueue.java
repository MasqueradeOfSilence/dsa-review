package com.evenstar;

// It doesn't like com.evenstar on IntelliJ Mac, so I unchecked "Wrong package statement"
// https://stackoverflow.com/questions/26440623/package-name-does-not-correspond-to-the-file-path-intellij
// Also note that this is not the same thing as Java's priority queue class
public class PriorityQueue
{
    // The max heap data member should not need to be exposed to other classes at any point.
    private com.evenstar.MaxHeap maxHeap;
}

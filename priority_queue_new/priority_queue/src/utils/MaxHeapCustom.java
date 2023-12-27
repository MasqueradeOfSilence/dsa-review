package utils;

import objects.PQNode;

import java.util.ArrayList;

public class MaxHeapCustom
{
    public ArrayList<PQNode> getNodeList()
    {
        return nodeList;
    }

    private final ArrayList<PQNode> nodeList;
    private static int positionInLine = 0;

    public MaxHeapCustom(Integer[] elements)
    {
        nodeList = new ArrayList<>();
        for (int i = 0; i < elements.length; i++)
        {
            nodeList.add(new PQNode(elements[i], i));
            positionInLine++;
        }
    }

    public MaxHeapCustom(ArrayList<PQNode> nodeList)
    {
        this.nodeList = nodeList;
    }

    private int findLastNonLeafNode()
    {
        return (int)Math.floor((nodeList.size() / 2.0) - 1.0);
    }

    public int computeStartingIndex()
    {
        return findLastNonLeafNode();
    }

    private int computeLeftChildIndex(int parentIndex)
    {
        return 2 * parentIndex + 1;
    }

    public PQNode computeLeftChildAtIndex(int index)
    {
        int leftChildIndex = computeLeftChildIndex(index);
        return nodeList.get(leftChildIndex);
    }

    private int computeRightChildIndex(int parentIndex)
    {
        return 2 * parentIndex + 2;
    }

    public PQNode computeRightChildAtIndex(int index)
    {
        int rightChildIndex = computeRightChildIndex(index);
        if (rightChildIndex >= nodeList.size())
        {
            return null;
        }
        return nodeList.get(rightChildIndex);
    }

    private boolean leftChildIsOOB(int parentIndex)
    {
        return computeLeftChildIndex(parentIndex) >= nodeList.size();
    }

    private boolean rightChildIsOOB(int parentIndex)
    {
        return computeRightChildIndex(parentIndex) >= nodeList.size();
    }

    private boolean prioritiesAreEqual(PQNode left, PQNode right)
    {
        return left.getPriorityValue() == right.getPriorityValue();
    }

    private PQNode earlierNode(PQNode left, PQNode right)
    {
        assert(left.getQueueOrder() != right.getQueueOrder());
        if (left.getQueueOrder() > right.getQueueOrder())
        {
            return left;
        }
        return right;
    }

    private PQNode nodeWithGreaterValue(PQNode left, PQNode right)
    {
        int leftValue = left.getPriorityValue();
        int rightValue = right.getPriorityValue();
        if (leftValue > rightValue)
        {
            return left;
        }
        else if (leftValue == rightValue)
        {
            return earlierNode(left, right);
        }
        return right;
    }

    public PQNode findLargerChild(int index)
    {
        PQNode leftChild = computeLeftChildAtIndex(index);
        PQNode rightChild = computeRightChildAtIndex(index);
        if (leftChild == null && rightChild != null)
        {
            return rightChild;
        }
        if (leftChild != null && rightChild == null)
        {
            return leftChild;
        }
        if (leftChild == null && rightChild == null)
        {
            return null;
        }
        if (prioritiesAreEqual(leftChild, rightChild))
        {
            return earlierNode(leftChild, rightChild);
        }
        return nodeWithGreaterValue(leftChild, rightChild);
    }

    private int findIndexOfChild(PQNode child)
    {
        for (int i = 0; i < nodeList.size(); i++)
        {
            if (child.equals(nodeList.get(i)))
            {
                return i;
            }
        }
        return -1;
    }

    public void swapParentAndChild(PQNode parent, PQNode child, int parentIndex)
    {
        int childIndex = findIndexOfChild(child);
        assert(childIndex != -1);
        nodeList.set(parentIndex, child);
        nodeList.set(childIndex, parent);
    }

    private boolean childIsLargerThanParent(PQNode parent, PQNode child)
    {
        int parentValue = parent.getPriorityValue();
        int childValue = child.getPriorityValue();
        return childValue > parentValue;
    }

    private boolean childAndParentAreEqualAndChildGotInLineFirst(PQNode parent, PQNode child)
    {
        int parentValue = parent.getPriorityValue();
        int childValue = child.getPriorityValue();
        int parentPlaceInLine = parent.getQueueOrder();
        int childPlaceInLine = child.getQueueOrder();
        return childValue == parentValue && childPlaceInLine < parentPlaceInLine;
    }

    private boolean parentAndChildShouldBeSwapped(PQNode parent, PQNode child)
    {
        return childAndParentAreEqualAndChildGotInLineFirst(parent, child)
                || childIsLargerThanParent(parent, child);
    }

    public void addElement(int priority)
    {
        addPQNode(new PQNode(priority, positionInLine));
        positionInLine++;
    }

    public void delete(int deletePosition)
    {
        if (nodeList.size() == 0 || deletePosition > nodeList.size() - 1 || deletePosition < 0)
        {
            System.out.println("Error: Delete position is not valid");
            return;
        }
        PQNode lastNode = nodeList.get(nodeList.size() - 1);
        // Swap
        PQNode nodeToDelete = nodeList.get(deletePosition);
        nodeList.set(deletePosition, lastNode);
        nodeList.set(nodeList.size() - 1, nodeToDelete);
        nodeList.remove(nodeList.size() - 1);
        heapify();
    }

    private void addPQNode(PQNode node)
    {
        nodeList.add(node);
        heapify();
    }

    private boolean atTopOfTree(int index)
    {
        return index <= 0;
    }

    private void printNodeList()
    {
        System.out.println("Printing node list...");
        for (PQNode pqNode : nodeList)
        {
            System.out.println(pqNode.getPriorityValue());
        }
        System.out.println("End print");
    }

    public ArrayList<PQNode> heapify()
    {
        int index = computeStartingIndex();
        PQNode parent = nodeList.get(index);
        PQNode largerChild = findLargerChild(index);
        if (largerChild == null)
        {
            return nodeList;
        }
        if (parentAndChildShouldBeSwapped(parent, largerChild))
        {
            swapParentAndChild(parent, largerChild, index);
        }
//        printNodeList();
        while (!atTopOfTree(index))
        {
            index -= 1;
            if (index < 0)
            {
                // root node reached
                return nodeList;
            }
            parent = nodeList.get(index);
            largerChild = findLargerChild(index);
            if (parentAndChildShouldBeSwapped(parent, largerChild))
            {
                swapParentAndChild(parent, largerChild, index);
            }
            //printNodeList();
            boolean finishedVisitingChildren = false;
            int tempIndex = findIndexOfChild(parent);
            while (!finishedVisitingChildren)
            {
                if (tempIndex >= nodeList.size())
                {
                    finishedVisitingChildren = true;
                }
                else
                {
                    PQNode tempParent = nodeList.get(tempIndex);
                    PQNode tempLargerChild;
                    if (rightChildIsOOB(tempIndex) && !leftChildIsOOB(tempIndex))
                    {
                        tempLargerChild = computeLeftChildAtIndex(tempIndex);
                    }
                    else if (leftChildIsOOB(tempIndex))
                    {
                        finishedVisitingChildren = true;
                        continue;
                    }
                    else
                    {
                        tempLargerChild = findLargerChild(tempIndex);
                    }
                    if (parentAndChildShouldBeSwapped(tempParent, tempLargerChild))
                    {
                        int saved = tempIndex;
                        tempIndex = findIndexOfChild(tempLargerChild);
                        swapParentAndChild(tempParent, tempLargerChild, saved);
                        //printNodeList();
                    }
                    else
                    {
                        finishedVisitingChildren = true;
                    }
                }
            }
        }
        return nodeList;
    }
}

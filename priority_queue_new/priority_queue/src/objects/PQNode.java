package objects;

import java.util.Objects;

public class PQNode
{
    private final int priorityValue;
    private final int queueOrder;

    public PQNode(int priority, int queueOrder)
    {
        this.priorityValue = priority;
        this.queueOrder = queueOrder;
    }

    public int getPriorityValue()
    {
        return priorityValue;
    }

    public int getQueueOrder()
    {
        return queueOrder;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PQNode pqNode = (PQNode) o;
        return priorityValue == pqNode.priorityValue &&
                queueOrder == pqNode.queueOrder;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(priorityValue, queueOrder);
    }
}

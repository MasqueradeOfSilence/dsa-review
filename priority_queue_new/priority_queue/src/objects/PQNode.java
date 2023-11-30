package objects;

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
}

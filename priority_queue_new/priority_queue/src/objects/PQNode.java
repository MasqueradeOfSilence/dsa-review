package objects;

public class PQNode
{
    private final int priority;
    private final int queueOrder;

    public PQNode(int priority, int queueOrder)
    {
        this.priority = priority;
        this.queueOrder = queueOrder;
    }

    public int getPriority()
    {
        return priority;
    }

    public int getQueueOrder()
    {
        return queueOrder;
    }
}

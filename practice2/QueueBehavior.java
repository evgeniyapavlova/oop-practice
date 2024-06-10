package practice2;

public interface QueueBehavior {

    void takeInQueue(Human actor);

    void takeOrders();

    void giveOrders();

    void releaseFromQueue();

}

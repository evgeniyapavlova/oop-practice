package practice2;

public interface ActorBehavior {
    void setMakeOrder(boolean status);

    void setTakeOrder(boolean status);

    boolean isMakeOrder();

    boolean isTakeOrder();
}

package practice2;

public class Human extends Actor implements ActorBehavior {

    public Human(String name) {
        super(name);
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean status) {
        isMakeOrder = status;
    }

    @Override
    public void setTakeOrder(boolean status) {
        isTakeOrder = status;
    }

    @Override
    public String toString() {
        String output = String.format("NAME - %s | STATUS - made order: %b, receive order: %b", name, isMakeOrder,
                isTakeOrder);
        return output;
    }

}

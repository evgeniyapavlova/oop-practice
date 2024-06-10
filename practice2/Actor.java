package practice2;

public abstract class Actor {
    protected String name;

    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    abstract String getName();

    public Actor(String name) {
        this.name = name;
    }

}

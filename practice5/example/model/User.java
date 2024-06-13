package practice5.example.model;

public abstract class User {
    protected int id;
    protected String name;
    protected String lastName;

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("%s: id = %s, name = %s, lastName = %s", getClass().getSimpleName(), id, name, lastName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}

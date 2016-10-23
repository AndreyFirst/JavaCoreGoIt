package module8;

public class User {
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class User {
    public String name;
    public String username;
    public int age;

    User(String name, String username, int age) {
        this.name = name;
        this.username = username;
        this.age = age;
    }

    public void show() {
        System.out.println("Customer information: ");
    }
}

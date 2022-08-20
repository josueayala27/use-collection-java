import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class UseCollection {
    public static void main(String[] args) {
        // Create collection
        Collection<User> user = new ArrayList<User>();

        // Create first user instance
        User user1 = new User("Michelle", "electrochemically4", 19);

        // Fill user collection positions
        user.add(user1);
        user.add(new User("Nuria", "palacios_nuri", 19));

        // Iterate all users
        user.forEach(name -> {
            System.out.println(String.format("Name: %s, username: %s, age: %s", name.name, name.username, name.age));
        });

        System.out.println("First item will be deleted.");

        // Remove item
        user.remove(user1);

        // Iterate all users
        user.forEach(name -> {
            System.out.println(String.format("Name: %s, username: %s, age: %s", name.name, name.username, name.age));
        });
    }
}

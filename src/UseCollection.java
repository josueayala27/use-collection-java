import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class UseCollection {
    public static void main(String[] args) {
        // Create collection
        Collection<User> user = new ArrayList<User>();

        // Fill fields
        user.add(new User("Michelle", "electrochemically4", 19));
        user.add(new User("Nuria", "palacios_nuri", 19));

        user.forEach(name -> {
            System.out.println(String.format("Name: %s, username: %s, age: %s", name.name, name.username, name.age));
        });
    }
}

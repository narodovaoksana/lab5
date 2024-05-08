import task1.User;
import task1.UserDetails;
import task1.UserListProcessor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("admin1"));
        users.add(new User("user1"));
        users.add(new User("admin2"));

        UserListProcessor processor = new UserListProcessor(users);
        processor.processUserList();
        System.out.println("Admin users count: " + processor.countAdminUsers());

        UserDetails userDetails = new UserDetails("user@example.com", "password", "address");
        processor.addUser(new User("newuser"), userDetails);
        processor.sendEmailToUser(new User("newuser"));
    }
}
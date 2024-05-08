package task1;

import task1.User;
import task1.UserDetails;

import java.util.List;

public class UserListProcessor {
    private List<User> users;

    public UserListProcessor(List<User> users) {
        this.users = users;
    }

    public void processUserList() {
        for (User user : users) {
            processUser(user);
        }
    }

    private void processUser(User user) {
        System.out.println("Processing user: " + user.getUsername());
        if (user.isAdmin()) {
            System.out.println("Admin user detected!");
        }
    }

    public int countAdminUsers() {
        return (int) users.stream().filter(User::isAdmin).count();
    }

    public void addUser(User user, UserDetails userDetails) {
        // Adding user...
        user.setUsername(user.getUsername());
        userDetails.setEmail(userDetails.getEmail());
        userDetails.setPassword(userDetails.getPassword());
        userDetails.setAddress(userDetails.getAddress());
    }

    public void sendEmailToUser(User user) {
        // Sending email...
        System.out.println("Sending email to " + user.getUsername());
    }
}
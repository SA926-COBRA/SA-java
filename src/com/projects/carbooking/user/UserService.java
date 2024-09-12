package com.projects.carbooking.user;

import java.util.UUID;

public class UserService {
    private User[] users = new User[100];  // Example array size
    private int userCount = 0;

    public User createUser(String name, String email) {
        String userId = UUID.randomUUID().toString();  // Generate a unique user ID using UUID
        User newUser = new User(userId, name, email);
        users[userCount] = newUser;
        userCount++;
        return newUser;
    }

    public User[] getAllUsers() {
        return users;
    }
}

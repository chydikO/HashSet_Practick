package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("admin", "qwerty");
        User user2 = new User("user", "qwerty");
        User user3 = new User("vasya", "Asdfg");
        User user4 = new User("Vova", "Zxcv");
        User user5 = new User("admin", "qwerty");

        Set<User> userSet = new HashSet<>();
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        userSet.add(user4);
        userSet.add(user5);

        System.out.println(userSet);
    }
}
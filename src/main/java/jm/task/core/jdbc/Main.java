package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Dmitriy", "Mochalov", (byte) 32);
        userService.saveUser("Sergey", "Ivanov", (byte) 27);
        userService.saveUser("Petr", "Veselov", (byte) 43);
        userService.saveUser("Elena", "Sidorova", (byte) 22);


        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();


    }

}

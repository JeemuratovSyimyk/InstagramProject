package org.example;


import org.example.Entity.User;
import org.example.Enum.Gender;
import org.example.ServiceImpl.UserServiceImpl;
import org.example.db.DataBase;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        DataBase dataBase = new DataBase();
        UserServiceImpl userService = new UserServiceImpl(dataBase);

        while (true){
            System.out.println("""
                    ~~~~~~~Choose an operation~~~~~~
                    1-addNewUser
                    2-update user's name,password and photo
                    3-get all users
                    4-search user by name
                    5-sort user by age
                    6-filter by age
                    7-exit program
                    """);
            switch (num = scanner.nextInt()) {
                case 1:
                    System.out.println(userService.addNewUser(List.of(
                            new User(1L, "Nursultan", "1", 24, "Mountains", Gender.MALE),
                            new User(2L, "Samat", "2", 27, "Cars", Gender.MALE),
                            new User(3L, "Mederbek", "3", 27, "Animals", Gender.MALE),
                            new User(4L, "Rasul", "3", 21, "Flags", Gender.MALE),
                            new User(5L, "Erbol", "5", 19, "With family", Gender.MALE),
                            new User(6L, "Aizada", "2", 17, "With friend", Gender.FEMALE),
                            new User(7L, "Meerim", "7", 18, "At museum", Gender.FEMALE),
                            new User(8L, "Temirlan", "8", 22, "At camp", Gender.MALE))));
                            break;
                 case 2:
                    System.out.println(userService.userUpdateById(1L, "Isma", "9", "Glass"));
                case 3:
                    System.out.println(userService.getAllUsers());
                case 4:
                    System.out.println(userService.searchByName("Samat"));
                case 5:
                    System.out.println(userService.sortByAge());
                case 6:
                    System.out.println(userService.filter());
            }

        }
    }
}

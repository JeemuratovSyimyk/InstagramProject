package org.example.ServiceImpl;

import org.example.Entity.User;
import org.example.Service.UserService;
import org.example.db.DataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {
    {
    }
  private DataBase dataBase;

    public UserServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public String addNewUser(List<User> users) {
      dataBase.getUsers().addAll(users);
        return "User is successfully saved!";
    }

    @Override
    public User userUpdateById(Long id, String nickName, String password, String photo) {
       List<User> user = dataBase.getUsers();
       for(User u: user){
           if(u.getId().equals(id)){
               u.setNickName(nickName);
               u.setPassword(password);
               u.setPhoto(photo);
         return u;
           }
        }
        return null;
    }
    @Override
    public List<User> getAllUsers() {
        return dataBase.getUsers();
    }
    @Override
    public User searchByName(String nickName) {
  List<User> users = dataBase.getUsers().stream()
          .filter(user -> user.getNickName().equalsIgnoreCase(nickName))
          .toList();
        return users.get(0);
    }
    @Override
    public List<User> sortByAge() {
   List<User> listUser = dataBase.getUsers();
   List<User> list = listUser.stream()
           .sorted(Comparator.comparing(User::getAge))
           .collect(Collectors.toList());
        System.out.println("Here are the sorted age");
        return list;
    }

    @Override
    public List<User> filter() {
 List<User> list = dataBase.getUsers();
 List<User> list1 = list.stream()
         .filter(user -> user.getPassword()!= null && !user.getPassword().isEmpty())
         .collect(Collectors.toList());
        return list1;
    }
}

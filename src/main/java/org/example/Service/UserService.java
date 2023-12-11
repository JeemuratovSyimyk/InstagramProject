package org.example.Service;

import org.example.Entity.User;

import java.util.List;

public interface UserService {
    String addNewUser(List<User> users);
    User userUpdateById(Long id,String nickName,String password,String photo);
    List<User> getAllUsers();
    User searchByName(String nickName);
    List<User> sortByAge();
    List<User> filter();
}

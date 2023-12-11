package org.example.db;

import lombok.Getter;
import lombok.Setter;
import org.example.Entity.User;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class DataBase {
    List<User> users = new ArrayList<>();
}

package org.example.Entity;

import lombok.Getter;
import lombok.Setter;
import org.example.Enum.Gender;
@Setter
@Getter
public class User {
    private Long id;
    private String nickName;
    private String password;
    private int age;
    private String photo;
    private Gender gender;

    public User(Long id, String nickName, String password, int age, String photo, Gender gender) {
        this.id = id;
        this.nickName = nickName;
        this.password = password;
        this.age = age;
        this.photo = photo;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", photo='" + photo + '\'' +
                ", gender=" + gender +
                '}';
    }
}

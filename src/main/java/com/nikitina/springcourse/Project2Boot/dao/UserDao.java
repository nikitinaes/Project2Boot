package com.nikitina.springcourse.Project2Boot.dao;

import com.nikitina.springcourse.Project2Boot.models.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();
    void addUser(User user);
    User getUserById(long id);
    void deleteUser(long id);
    void editUser(User user);
}

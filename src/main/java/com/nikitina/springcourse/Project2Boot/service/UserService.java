package com.nikitina.springcourse.Project2Boot.service;

import com.nikitina.springcourse.Project2Boot.models.User;
import jakarta.validation.Valid;
import java.util.List;

public interface UserService {
    List<User> getUsers();
    void addUser(User user);
    User getUserById(long id);
    void deleteUser(long id);
    void editUser(@Valid User user);
}

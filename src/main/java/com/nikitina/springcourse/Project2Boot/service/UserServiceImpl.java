package com.nikitina.springcourse.Project2Boot.service;

import com.nikitina.springcourse.Project2Boot.dao.UserDao;
import com.nikitina.springcourse.Project2Boot.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
            this.userDao = userDao;
        }
        @Override
        public List<User> getUsers() {
            return userDao.getUsers();
        }

        @Override
        public User getUserById(long id) {
            return userDao.getUserById(id);
        }

        @Override
        public void deleteUser(long id) {
        userDao.deleteUser(id);
        }

        @Override
        public void editUser(User user) {
            userDao.editUser(user);
        }

        @Override
        public void addUser(User user) {
            userDao.addUser(user);
        }

    }


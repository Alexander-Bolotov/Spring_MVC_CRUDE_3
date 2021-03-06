package ru.aibolotov.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.aibolotov.dao.UserDao;
import ru.aibolotov.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;


    @Override
    @Transactional
    public List<User> getListUsers() {
        return userDao.getListUsers();
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public void deleteUserById(int id) {
        userDao.deleteUserById(id);
    }
}

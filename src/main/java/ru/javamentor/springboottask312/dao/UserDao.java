package ru.javamentor.springboottask312.dao;


import ru.javamentor.springboottask312.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void addNewUser(User user);

    public User findById(Integer id);

    public void updateUser(Integer id, User user);

    public void deleteUser(Integer id);

}

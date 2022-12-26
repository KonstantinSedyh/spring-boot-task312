package ru.javamentor.springboottask312.service;

import ru.javamentor.springboottask312.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void addNewUser(User user);

    public User findById(Integer id);

    public void updateUser(Integer id, User user);

    public void deleteUser(Integer id);

}

package ru.javamentor.springboottask312.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.javamentor.springboottask312.model.User;


import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        String hql = "select c from User c";
        return entityManager.createQuery(hql, User.class).getResultList();
    }

    @Override
    public void addNewUser(User user) {
        if (user.getId()==null) {
            entityManager.persist(user);
        }
    }

    @Override
    public void updateUser(Integer id, User user) {
        User updatedUser = findById(id);
        updatedUser.setName(user.getName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setAge(user.getAge());
        updatedUser.setEmail(user.getEmail());
    }

    @Override
    public void deleteUser(Integer id) {
        entityManager.remove(entityManager.find(User.class, id));
    }

    @Override
    public User findById(Integer id) {
        return entityManager.find(User.class, id);
    }


}

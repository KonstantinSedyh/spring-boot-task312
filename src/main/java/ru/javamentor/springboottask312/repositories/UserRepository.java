package ru.javamentor.springboottask312.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javamentor.springboottask312.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}

package com.najib.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.najib.users.entities.User;
public interface UserRepository extends JpaRepository<User, Long> {

User findByUsername(String username);

}
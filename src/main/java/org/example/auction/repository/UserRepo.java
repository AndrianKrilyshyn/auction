package org.example.auction.repository;

import org.example.auction.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, Long> {
    User getUserByEmail(String email);
}

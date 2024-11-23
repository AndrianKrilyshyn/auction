package org.example.auction.repository;

import org.example.auction.model.role.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role getRoleByName(String name);
}

package org.example.auction.service;

import org.example.auction.model.role.Role;
import org.example.auction.model.role.dto.RoleDTO;

public interface RoleService {
    RoleDTO getRoleById(long id);
    RoleDTO getRoleByName(String name);
    RoleDTO createRole(RoleDTO role);
    RoleDTO updateRole(Role role);
    void deleteRole(long id);
}

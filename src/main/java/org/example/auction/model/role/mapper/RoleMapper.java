package org.example.auction.model.role.mapper;

import org.example.auction.model.role.Role;
import org.example.auction.model.role.dto.RoleDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;

@Mapper(config = MapperConfig.class)
public interface RoleMapper {
    Role toRole(RoleDTO roleDTO);
    RoleDTO toRoleDTO(Role role);
}

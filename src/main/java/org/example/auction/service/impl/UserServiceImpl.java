package org.example.auction.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.auction.model.user.User;
import org.example.auction.model.user.dto.GetUserDTO;
import org.example.auction.model.user.dto.GetUserFullDTO;
import org.example.auction.model.user.dto.PostUserDTO;
import org.example.auction.model.user.dto.UpdateUserDTO;
import org.example.auction.model.user.mapper.UserMapper;
import org.example.auction.repository.RoleRepo;
import org.example.auction.repository.UserRepo;
import org.example.auction.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final UserMapper userMapper;
    private final RoleRepo roleRepo;
    @Override
    public GetUserDTO getUserById(long id) {
        return userMapper.toDTO(userRepo.findById(id).orElseThrow());
    }

    @Override
    public GetUserDTO getUserByEmail(String email) {
        return userMapper.toDTO(userRepo.getUserByEmail(email));
    }

    @Override
    public GetUserDTO createUser(PostUserDTO postUserDTO) {
        User user = userMapper.toModel(postUserDTO);
        user.setRole(roleRepo.getRoleByName("User"));
        return userMapper.toDTO(userRepo.save(user));
    }

    @Override
    public GetUserDTO updateUser(User user) {
        return userMapper.toDTO(userRepo.save(user));
    }

    @Override
    public void deleteUser(long id) {
        userRepo.deleteById(id);
    }
    @Override
    public List<GetUserDTO> getAllUsers() {
        return userRepo.findAll().stream().map(userMapper::toDTO).toList();
    }

    @Override
    public GetUserFullDTO getUserFull(long id) {
        return userMapper.toFullDTO(userRepo.findById(id).orElseThrow());
    }
}

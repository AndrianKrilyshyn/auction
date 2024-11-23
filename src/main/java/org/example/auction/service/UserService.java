package org.example.auction.service;

import org.example.auction.model.user.User;
import org.example.auction.model.user.dto.GetUserDTO;
import org.example.auction.model.user.dto.GetUserFullDTO;
import org.example.auction.model.user.dto.PostUserDTO;
import org.example.auction.model.user.dto.UpdateUserDTO;

import java.util.List;

public interface UserService {
    GetUserDTO getUserById(long id);
    GetUserDTO getUserByEmail(String email);
    GetUserDTO createUser(PostUserDTO user);
    GetUserDTO updateUser(User user);
    void deleteUser(long id);
    List<GetUserDTO> getAllUsers();
    GetUserFullDTO getUserFull(long id);


}

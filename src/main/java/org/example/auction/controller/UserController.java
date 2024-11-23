package org.example.auction.controller;

import lombok.RequiredArgsConstructor;
import org.example.auction.model.user.User;
import org.example.auction.model.user.dto.GetUserDTO;
import org.example.auction.model.user.dto.GetUserFullDTO;
import org.example.auction.model.user.dto.PostUserDTO;
import org.example.auction.model.user.dto.UpdateUserDTO;
import org.example.auction.model.user.mapper.UserMapper;
import org.example.auction.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;
    @PostMapping("/register")
    public GetUserDTO createUser(@RequestBody PostUserDTO postUserDTO) {
        return userService.createUser(postUserDTO);
    }
    @GetMapping("/{id}")
    public GetUserDTO getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }
    @PostMapping("/{id}")
    public GetUserDTO updateUser(@PathVariable Long id, @RequestBody UpdateUserDTO updateUserDTO) {
        User user = userMapper.toModel(userService.getUserById(id));
        user.setRole(updateUserDTO.getRole());
        user.setAuctions(updateUserDTO.getAuctions());
        user.setCars(updateUserDTO.getCars());
        user.setBids(updateUserDTO.getBids());
        user.setFirstName(updateUserDTO.getFirstName());
        user.setLastName(updateUserDTO.getLastName());
        user.setEmail(updateUserDTO.getEmail());
        return userService.updateUser(user);

    }
    @PostMapping("/del{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
    @GetMapping("/all")
    public List<GetUserDTO> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/{id}/all")
    public GetUserFullDTO getUserFull(@PathVariable Long id) {
        return userService.getUserFull(id);
    }
}

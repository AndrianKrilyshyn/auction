package org.example.auction.model.user.dto;

import lombok.Getter;
import lombok.Setter;
import org.example.auction.model.role.Role;

@Getter
@Setter
public class GetUserDTO {
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private Role role;


}

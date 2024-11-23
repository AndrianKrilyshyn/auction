package org.example.auction.model.user.dto;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AllUsersDTO {
    private List<GetUserDTO> getUsers;
    private Integer totalUsers;
}

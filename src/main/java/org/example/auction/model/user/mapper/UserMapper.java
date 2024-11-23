package org.example.auction.model.user.mapper;
import org.example.auction.model.user.User;
import org.example.auction.model.user.dto.GetUserDTO;
import org.example.auction.model.user.dto.GetUserFullDTO;
import org.example.auction.model.user.dto.PostUserDTO;
import org.example.auction.model.user.dto.UpdateUserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;

@Mapper(config = MapperConfig.class)
public interface UserMapper {
    User toModel(PostUserDTO postUserDTO);
    GetUserDTO toDTO(User user);
    GetUserFullDTO toFullDTO(User user);
    User toModel(UpdateUserDTO updateUserDTO);
    User toModel(GetUserDTO getUserDTO);
}

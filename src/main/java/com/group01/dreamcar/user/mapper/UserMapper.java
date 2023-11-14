package com.group01.dreamcar.user.mapper;

import com.group01.dreamcar.user.dto.UserRequestDTO;
import com.group01.dreamcar.user.dto.UserResponseDTO;
import com.group01.dreamcar.user.model.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserResponseDTO toUserResponseDTO(User user);
    User toUser(UserRequestDTO userRequest);

    List<UserResponseDTO> toUserResponseDTOList(List<User> users);
    List<User> toUserList(List<UserRequestDTO> userRequestList);
}

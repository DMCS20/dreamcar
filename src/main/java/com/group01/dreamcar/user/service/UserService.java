package com.group01.dreamcar.user.service;

import com.group01.dreamcar.user.dto.UserLoginDTO;
import com.group01.dreamcar.user.dto.UserRequestDTO;
import com.group01.dreamcar.user.dto.UserResponseDTO;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    UserResponseDTO getUserById(ObjectId id);
    List<UserResponseDTO> getAllUsers();
    UserResponseDTO createUser(UserRequestDTO user);
    String login(UserLoginDTO userLogin);
}

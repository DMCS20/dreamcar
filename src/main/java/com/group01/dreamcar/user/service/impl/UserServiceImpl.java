package com.group01.dreamcar.user.service.impl;

import com.group01.dreamcar.shared.exceptions.ResourceNotFoundException;
import com.group01.dreamcar.shared.exceptions.ValidationException;
import com.group01.dreamcar.user.dto.UserLoginDTO;
import com.group01.dreamcar.user.dto.UserRequestDTO;
import com.group01.dreamcar.user.dto.UserResponseDTO;
import com.group01.dreamcar.user.mapper.UserMapper;
import com.group01.dreamcar.user.model.User;
import com.group01.dreamcar.user.repository.UserRepository;
import com.group01.dreamcar.user.service.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;
    @Override
    public UserResponseDTO getUserById(ObjectId id) {
        Optional<User> userOptional = userRepository.findById(id);

        if(userOptional.isEmpty()){
            throw new ResourceNotFoundException("User ID" + id.toString() + " not found");
        }

        return userMapper.toUserResponseDTO(userOptional.get());
    }

    @Override
    public List<UserResponseDTO> getAllUsers() {
        List<User> users = userRepository.findAll();
        return userMapper.toUserResponseDTOList(users);
    }

    @Override
    public UserResponseDTO createUser(UserRequestDTO userRequest) {
        if(userRepository.existsByEmail(userRequest.getEmail())){
            throw new ValidationException("Email already exists");
        }
        User user = userMapper.toUser(userRequest);
        userRepository.insert(user);
        return userMapper.toUserResponseDTO(user);
    }

    @Override
    public String login(UserLoginDTO userLogin) {
        if(!userRepository.existsByEmailAndPassword(userLogin.getEmail(),userLogin.getPassword())){
            throw new ValidationException("Invalid email or password");
        }
        User user = userRepository.findByEmail(userLogin.getEmail()).get();
        return user.getId().toString();
    }
}

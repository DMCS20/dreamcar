package com.group01.dreamcar.user.controller;

import com.group01.dreamcar.user.dto.UserLoginDTO;
import com.group01.dreamcar.user.dto.UserRequestDTO;
import com.group01.dreamcar.user.dto.UserResponseDTO;
import com.group01.dreamcar.user.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @Operation(summary = "Obtiene todos los usuarios")
    @Transactional(readOnly = true)
    @GetMapping
    public ResponseEntity<List<UserResponseDTO>> getUsers(){
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @Operation(summary = "Obtiene un usuario por id")
    @Transactional(readOnly = true)
    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDTO> getUserById(@PathVariable ObjectId id){
        return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
    }

    @Operation(summary = "Crea un usuario")
    @Transactional
    @PostMapping
    public ResponseEntity<UserResponseDTO> createUser(@RequestBody UserRequestDTO userRequest){
        return new ResponseEntity<>(userService.createUser(userRequest), HttpStatus.CREATED);
    }

    @Operation(summary = "Permite que un usuario se logee con su email y password. Devuelve la ID del usuario si las credenciales son correctas." +
            "Caso contrario lanza un ValidationException")
    @Transactional
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserLoginDTO userLogin){
        return new ResponseEntity<>(userService.login(userLogin), HttpStatus.OK);
    }
}

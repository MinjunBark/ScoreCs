package com.sourcecs.scsapi.controller;

import com.sourcecs.scsapi.model.request.UserRequest;
import com.sourcecs.scsapi.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<Object> createUser(@RequestBody UserRequest userRequest) {
        userService.createUserNative(userRequest);
        return new ResponseEntity<>("New user created!", HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findUserInfoById(@PathVariable long id) {
        userService.findUserInfoByIdNative(id);
        return new ResponseEntity<>("User info:", HttpStatus.ACCEPTED);
    }

    @PutMapping("/ign")
    public ResponseEntity<Object> changeUserIgn(UserRequest userRequest) {
        userService.changeUserIgnNative(userRequest);
        return new ResponseEntity<>("User info:", HttpStatus.ACCEPTED);
    }

}

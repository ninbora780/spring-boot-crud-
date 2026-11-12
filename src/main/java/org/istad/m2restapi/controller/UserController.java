package org.istad.m2restapi.controller;

import lombok.RequiredArgsConstructor;
import org.istad.m2restapi.model.User;
import org.istad.m2restapi.repository.UserRepository;
import org.istad.m2restapi.service.impl.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@Service
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

   private final UserServiceImpl userService;

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable UUID id) {
        return userService.getById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable UUID id) {
        userService.deleteUser(id);
        return "User deleted successfully!";
    }

}

package org.istad.m2restapi.controller;

import lombok.RequiredArgsConstructor;
import org.istad.m2restapi.dto.UserRespond;
import org.istad.m2restapi.repository.UserRepository;
import org.istad.m2restapi.service.UserService;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@Service
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

   private final UserRepository userRepository;
   private final UserService userService;

   @GetMapping("/paging")
   public Page<UserRespond> getAllByPagination(
           @RequestParam(required = false , defaultValue = "0")  int pageNumber,
           @RequestParam(required = false , defaultValue = "25")  int pageSize
   ){
       return userService.getAllWithPagination(pageNumber , pageSize);
   }
    @GetMapping
    public List<UserRespond> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public UserRespond getById(@PathVariable UUID id) {
        return userService.getById(id);
    }

//    @PostMapping
//    public User createUser(@RequestBody User user) {
//        return userService.createUser(user);
//    }
//
//    @PutMapping("/{id}")
//    public User updateUser(
//            @PathVariable UUID id,
//            @RequestBody User user) {
//        return userService.updateUser(id, user);
//    }
//
//    @PatchMapping("/{id}")
//    public User patchUser(
//            @PathVariable UUID id,
//            @RequestBody User user) {
//        return userService.patchUser(id, user);
//    }
//
//    @DeleteMapping("/{id}")
//    public String deleteUser(@PathVariable UUID id) {
//        userService.deleteUser(id);
//        return "User deleted successfully!";
//    }

}

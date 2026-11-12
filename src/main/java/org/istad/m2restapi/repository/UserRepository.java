package org.istad.m2restapi.repository;


import org.istad.m2restapi.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UserRepository {

    List<User> users;

    public UserRepository(){
        users = new ArrayList<>();
        User usrAdmin = new User(UUID.randomUUID(), "Administrator", "male", "qwer", "naka992");
        User usrEditor = new User(UUID.randomUUID(), "Editor", "female", "qwer", "false121");
        User usrCustomer = new User(UUID.randomUUID(), "Chan Dara", "male", "qwer", "bora8182");
        users.add(usrAdmin);
        users.add(usrCustomer);
        users.add(usrEditor);
    }

    public List<User> getAll(){
        return users;
    }

    public Optional<User> selectById(UUID id){
        return  users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    public User insert(User user) {
        user.setId(UUID.randomUUID());
        users.add(user);
        return user;
    }

    public boolean deleteById(UUID id) {
        return users.removeIf(
                user -> user.getId().equals(id)
        );
    }

}

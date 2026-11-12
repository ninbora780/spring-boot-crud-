package org.istad.m2restapi.service;

import lombok.RequiredArgsConstructor;
import org.istad.m2restapi.model.User;
import org.istad.m2restapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public interface UsrService {

    List<User> getAll();
    User getById(UUID id);
    User createUser(User user);
    void deleteUser(UUID id);

}

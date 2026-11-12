package org.istad.m2restapi.service.impl;

import lombok.RequiredArgsConstructor;
import org.istad.m2restapi.model.User;
import org.istad.m2restapi.repository.UserRepository;
import org.istad.m2restapi.service.UsrService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UsrService {
    private final UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.getAll();
    }

    @Override
    public User getById(UUID id) {
        return userRepository.selectById(id)
                .orElse(null);
    }

    @Override
    public User createUser(User user) {
        return userRepository.insert(user);
    }

    @Override
    public void deleteUser(UUID id) {
        userRepository.deleteById(id);
    }
}

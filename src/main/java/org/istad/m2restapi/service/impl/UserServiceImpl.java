package org.istad.m2restapi.service.impl;

import lombok.RequiredArgsConstructor;
import org.istad.m2restapi.dto.UserRespond;
import org.istad.m2restapi.mapper.UserMapper;
import org.istad.m2restapi.model.User;
import org.istad.m2restapi.repository.UserRepository;
import org.istad.m2restapi.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public Page<UserRespond> getAllWithPagination(int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber , pageSize);
        return userRepository.findAll(pageable)
                .map(userMapper::mapperUserToUserResponse);
    }

    @Override
    public List<UserRespond> getAll() {
        return userRepository.findAll()
                .stream()
                .map(userMapper ::mapperUserToUserResponse)
                .toList();
    }

    @Override
    public UserRespond getById(UUID id) {
        return userRepository.findById(id)
                .map(userMapper::mapperUserToUserResponse)
                .orElse(null);
    }

    @Override
    public UserRespond createUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(UUID id) {

    }

    @Override
    public UserRespond updateUser(UUID id, User user) {
        return null;
    }

    @Override
    public UserRespond patchUser(UUID id, User user) {
        return null;
    }
}

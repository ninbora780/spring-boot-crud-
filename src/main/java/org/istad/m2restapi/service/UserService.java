package org.istad.m2restapi.service;

import org.istad.m2restapi.dto.UserRespond;
import org.istad.m2restapi.model.User;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.UUID;

public interface UserService {
    // Pagination
    Page<UserRespond> getAllWithPagination(int pageNumber , int pageSize);


    List<UserRespond> getAll();
    UserRespond getById(UUID id);
    UserRespond createUser(User user);
    void deleteUser(UUID id);
    UserRespond updateUser(UUID id , User user);
    UserRespond patchUser(UUID id , User user);
}

package org.istad.m2restapi.mapper;

import org.istad.m2restapi.dto.UserRespond;
import org.istad.m2restapi.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    // what is source ?
    // what is target ?
    UserRespond mapperUserToUserResponse(User user);
}

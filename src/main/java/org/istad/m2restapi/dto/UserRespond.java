package org.istad.m2restapi.dto;

import java.util.UUID;

public record UserRespond(
        UUID id,
        String name,
        Boolean isActive
) {
}

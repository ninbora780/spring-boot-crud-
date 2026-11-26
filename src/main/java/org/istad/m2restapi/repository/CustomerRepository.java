package org.istad.m2restapi.repository;

import org.istad.m2restapi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer , UUID> {
}

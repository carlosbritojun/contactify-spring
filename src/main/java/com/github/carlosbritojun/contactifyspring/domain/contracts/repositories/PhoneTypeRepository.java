package com.github.carlosbritojun.contactifyspring.domain.contracts.repositories;

import java.util.UUID;

import com.github.carlosbritojun.contactifyspring.domain.entities.PhoneType;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneTypeRepository extends CrudRepository<PhoneType, UUID> {
}
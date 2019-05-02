package com.github.carlosbritojun.contactifyspring.domain.contracts.repositories;

import java.util.UUID;

import com.github.carlosbritojun.contactifyspring.domain.entities.Category;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, UUID> {
}
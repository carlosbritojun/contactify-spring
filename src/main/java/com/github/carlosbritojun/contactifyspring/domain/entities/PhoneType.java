package com.github.carlosbritojun.contactifyspring.domain.entities;

import java.util.UUID;

import com.github.carlosbritojun.contactifyspring.domain.valueobjects.Description;
import com.github.carlosbritojun.contactifyspring.shared.models.Entity;

public class PhoneType extends Entity {

    public PhoneType(UUID id, Description description) {
        super(id);

        addNotifications(description);

        if (isValid())
            this.description = description;
    }

    private Description description;

    public Description getDescription() {
        return this.description;
    }
}
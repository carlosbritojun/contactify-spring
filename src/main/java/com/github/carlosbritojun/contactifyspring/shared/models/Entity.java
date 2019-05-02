package com.github.carlosbritojun.contactifyspring.shared.models;

import java.util.UUID;

import jflunt.notifications.Notifiable;

public abstract class Entity extends Notifiable {

    public Entity(UUID id) {
        this.id = id;
    }

    public UUID id;

    public UUID getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        Entity comp = (Entity)obj;
        if (!this.id.equals(comp.getId())) return false;

        return true;
    }
}
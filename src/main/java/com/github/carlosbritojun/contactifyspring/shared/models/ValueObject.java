package com.github.carlosbritojun.contactifyspring.shared.models;

import jflunt.notifications.Notifiable;

public abstract class ValueObject extends Notifiable {

    public abstract boolean customEquals(Object obj);

    @Override
    public boolean equals(Object obj) {
        return this.customEquals(obj);
    }
}
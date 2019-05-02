package com.github.carlosbritojun.contactifyspring.domain.valueobjects;

import com.github.carlosbritojun.contactifyspring.shared.models.ValueObject;

import jflunt.validations.Contract;

public class Name extends ValueObject {

    public Name(String value) {

        addNotifications(new Contract()
            .isNotNullOrEmpty(value, "value", "Nome requerido")
            .hasMinLen(value, 3, "name", "Nome deve ter no mínimo 3 caracteres")
            .hasMaxLen(value, 50, "name", "Nome deve ter no máximo 50 caracteres")
        );

        if (isValid())
            this.value = value;
    }

    public String value;

    public String getValue() {
        return this.value;
    }

    @Override
    public boolean customEquals(Object obj) {
        
        //Implementing a custom equality
        return false;
    }
}
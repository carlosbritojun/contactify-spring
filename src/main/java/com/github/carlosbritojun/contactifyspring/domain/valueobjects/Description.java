package com.github.carlosbritojun.contactifyspring.domain.valueobjects;

import com.github.carlosbritojun.contactifyspring.shared.models.ValueObject;

import jflunt.validations.Contract;

public class Description extends ValueObject {

    public Description(String value) {

        addNotifications(new Contract().requires()
            .isNotNullOrEmpty(value, "description", "Descrição requerida")
            .hasMinLen(value, 2, "description", "Descrição deve ter no mínimo 3 caracteres")
            .hasMaxLen(value, 50, "description", "Descrição deve ter no máximo 50 caracteres")
        );
        
        if (isValid())
            this.value = value;
    }

    private String value;

    public String getValue() {
        return this.value;
    }

    @Override
    public boolean customEquals(Object obj) {
        
        //Implementing a custom equality
        return false;
    }
}
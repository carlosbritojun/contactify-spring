package com.github.carlosbritojun.contactifyspring.domain.valueobjects;

import com.github.carlosbritojun.contactifyspring.shared.models.ValueObject;

import jflunt.validations.Contract;

public class Email extends ValueObject {

    public Email(String address) {

        addNotifications(new Contract().requires()
            .isEmail(address, "email", "E-mail inválido")
        );

        if (isValid())
            this.address = address;
    }

    public String address;

    public String getAddress() {
        return this.address;
    }

    @Override
    public boolean customEquals(Object obj) {
        
        //Implementing a custom equality
        return false;
    }
}
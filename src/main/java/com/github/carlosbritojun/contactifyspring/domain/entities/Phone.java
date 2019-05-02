package com.github.carlosbritojun.contactifyspring.domain.entities;

import java.util.UUID;

import com.github.carlosbritojun.contactifyspring.shared.models.Entity;

import jflunt.validations.Contract;

public class Phone extends Entity {

    public Phone(UUID id, PhoneType type, String prefix, String number) {
        super(id);

        addNotifications(new Contract().requires()
            .isNotNullOrEmpty(prefix, "prefix", "Prefixo requerido")
            .isNotNullOrEmpty(number, "numero", "Número de telefone requerido")
        );

        if (isInvalid()) {
            this.prefix = prefix;
            this.number = number;
        }
    }

    private Contact contact;
    private PhoneType type;
    private String prefix;
    private String number;

    public void setContact(Contact contact) {
        this.contact = contact;
    }
 
    public PhoneType getType() {
        return this.type;
    }

    public Contact getContact() {
        return this.contact;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public String getNumber() {
        return this.number;
    }

}
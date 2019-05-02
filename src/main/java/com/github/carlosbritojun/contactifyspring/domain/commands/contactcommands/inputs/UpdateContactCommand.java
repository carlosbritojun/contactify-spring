package com.github.carlosbritojun.contactifyspring.domain.commands.contactcommands.inputs;

import java.util.UUID;

import com.github.carlosbritojun.contactifyspring.shared.contracts.commands.Command;

public class UpdateContactCommand implements Command {

    public UpdateContactCommand(UUID id, String name, String email, UUID category, ContactPhoneCommand[] phones) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.category = category;
        this.phones = phones;
    }

    private UUID id;
    private String name;
    private String email;
    private UUID category;
    private ContactPhoneCommand[] phones;

    public UUID getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public UUID getCategory() {
        return this.category;
    }

    public ContactPhoneCommand[] getPhones() {
        return this.phones;
    }

}
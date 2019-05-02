package com.github.carlosbritojun.contactifyspring.domain.commands.contactcommands.inputs;

import java.util.UUID;

import com.github.carlosbritojun.contactifyspring.shared.contracts.commands.Command;

public class CreateNewContactCommand implements Command {

    public CreateNewContactCommand(String name, String email, UUID category, ContactPhoneCommand[] phones) {
        this.name = name;
        this.email = email;
        this.category = category;
        this.phones = phones;
    }

    private String name;
    private String email;
    private UUID category;
    private ContactPhoneCommand[] phones;

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
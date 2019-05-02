package com.github.carlosbritojun.contactifyspring.domain.commands.contactcommands.inputs;

import java.util.UUID;

import com.github.carlosbritojun.contactifyspring.shared.contracts.commands.Command;

public class ContactPhoneCommand implements Command {

    public ContactPhoneCommand(UUID type, String prefix, String phoneNumber) {
        this.prefix = prefix;
        this.phoneNumber = phoneNumber;
    }

    private UUID type;
    private String prefix;
    private String phoneNumber;

    public UUID getType() {
        return this.type;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}
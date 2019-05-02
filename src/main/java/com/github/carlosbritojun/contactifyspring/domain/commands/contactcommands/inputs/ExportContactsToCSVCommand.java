package com.github.carlosbritojun.contactifyspring.domain.commands.contactcommands.inputs;

import java.util.UUID;

import com.github.carlosbritojun.contactifyspring.shared.contracts.commands.Command;

public class ExportContactsToCSVCommand implements Command {

    private UUID[] contacts;

    public ExportContactsToCSVCommand(UUID[] contacts) {
        this.contacts = contacts;
    }

    public UUID[] getContacts() {
        return this.contacts;
    }
}
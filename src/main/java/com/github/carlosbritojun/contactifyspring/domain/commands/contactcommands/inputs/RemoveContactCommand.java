package com.github.carlosbritojun.contactifyspring.domain.commands.contactcommands.inputs;

import java.util.UUID;

import com.github.carlosbritojun.contactifyspring.shared.contracts.commands.Command;

public class RemoveContactCommand implements Command {

    public RemoveContactCommand(UUID id) {
        this.id = id;
    }

    private UUID id;

    public UUID getId() {
        return this.id;
    }
}
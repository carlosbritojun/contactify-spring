package com.github.carlosbritojun.contactifyspring.shared.contracts.commands;

public interface CommandResultHandler<TCommand extends Command, TCommandResult extends CommandResult> {
    TCommandResult executeCommand(TCommand command);
}
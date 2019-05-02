package com.github.carlosbritojun.contactifyspring.shared.contracts.commands;

public interface CommandHandler<TCommand extends Command> {
    boolean handle(TCommand command);
}
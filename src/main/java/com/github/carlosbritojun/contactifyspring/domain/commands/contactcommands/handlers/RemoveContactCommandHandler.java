package com.github.carlosbritojun.contactifyspring.domain.commands.contactcommands.handlers;

import com.github.carlosbritojun.contactifyspring.domain.commands.contactcommands.inputs.RemoveContactCommand;
import com.github.carlosbritojun.contactifyspring.domain.contracts.repositories.ContactRepository;
import com.github.carlosbritojun.contactifyspring.shared.contracts.commands.CommandHandler;

import org.springframework.beans.factory.annotation.Autowired;

import jflunt.notifications.Notifiable;

public class RemoveContactCommandHandler extends Notifiable
    implements 
        CommandHandler<RemoveContactCommand> {

    @Autowired private ContactRepository contactRepository;

    @Override
    public boolean handle(RemoveContactCommand command) {
        
        var entity = contactRepository.findById(command.getId());
        if (!entity.isPresent()) {
            addNotification("contato", "Contato inexistente");
        }
        
        contactRepository.delete(entity.get());

        return true;
    }
}
package com.github.carlosbritojun.contactifyspring.domain.commands.contactcommands.handlers;

import java.util.UUID;

import com.github.carlosbritojun.contactifyspring.domain.commands.contactcommands.inputs.UpdateContactCommand;
import com.github.carlosbritojun.contactifyspring.domain.contracts.repositories.CategoryRepository;
import com.github.carlosbritojun.contactifyspring.domain.contracts.repositories.ContactRepository;
import com.github.carlosbritojun.contactifyspring.domain.contracts.repositories.PhoneTypeRepository;
import com.github.carlosbritojun.contactifyspring.domain.entities.Phone;
import com.github.carlosbritojun.contactifyspring.domain.valueobjects.Email;
import com.github.carlosbritojun.contactifyspring.shared.contracts.commands.CommandHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jflunt.notifications.Notifiable;

@Service
@Transactional
public class UpdateContactCommandHandler extends Notifiable
    implements
        CommandHandler<UpdateContactCommand> {

    @Autowired private ContactRepository contactRepository;
    @Autowired private CategoryRepository categoryRepository;
    @Autowired private PhoneTypeRepository phoneTypeRepository;

    @Override
    public boolean handle(final UpdateContactCommand command) {

        var contact = contactRepository.findById(command.getId()).get();

        contact.Update(
            new com.github.carlosbritojun.contactifyspring.domain.valueobjects.Name(command.getName()),
            new Email(command.getEmail()),
            categoryRepository.findById(command.getCategory()).get());
        
        contact.getPhones().clear();

        for (var phoneDto : command.getPhones()) {
            var phone = new Phone(UUID.randomUUID(), this.phoneTypeRepository.findById(phoneDto.getType()).get(),
                    phoneDto.getPrefix(), phoneDto.getPhoneNumber());
            contact.addPhone(phone);
        }

        addNotifications(contact);
        
        if (isInvalid()) 
            return false;

        return contactRepository.save(contact) != null;
    }
}
package com.github.carlosbritojun.contactifyspring.domain.entities;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

import com.github.carlosbritojun.contactifyspring.domain.valueobjects.Email;
import com.github.carlosbritojun.contactifyspring.domain.valueobjects.Name;
import com.github.carlosbritojun.contactifyspring.shared.models.Entity;

public class Contact extends Entity {

    public Contact(UUID id, Name name, Email email, Category category) {
        super(id);
        Update(name, email, category);
    }

    private Name name;
    private Email email;
    private Category category;
    private List<Phone> phones;

    public void Update(Name name, Email email, Category category) {
        addNotifications(name, email);
        if (isValid()) {
            this.name = name;
            this.email = email;
            this.category = category;
        }
    }

    public Name getName() {
        return this.name;
    }

    public Email getEmail() {
        return this.email;
    }

    public Category getCategory() {
        return this.category;
    }

    public List<Phone> getPhones() {
        return Collections.unmodifiableList(this.phones);
    }

    public void addPhone(Phone phone) {
        addNotifications(phone);

        if (isValid()) {
            phone.setContact(this);
            this.phones.add(phone);
        } 
    }
}
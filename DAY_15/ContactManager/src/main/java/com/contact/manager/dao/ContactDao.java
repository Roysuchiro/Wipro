package com.contact.manager.dao;

import java.util.List;
import com.contact.manager.model.Contact;

public interface ContactDao {
    void addContact(Contact c);
    List<Contact> getAllContacts();
    Contact getContactById(int id);
    void updateContact(Contact c);
    void deleteContact(int id);
}

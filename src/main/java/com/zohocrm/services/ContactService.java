package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entites.Contact;

public interface ContactService {
    public void saveContact(Contact contact);  //interface abstract class
    
    public List<Contact> listContacts();
	public Contact getOneContact(long id);

	public void deleteContactbyId(long id);
    
}
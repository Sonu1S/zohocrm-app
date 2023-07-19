package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Repository.ContactRepository;
import com.zohocrm.entites.Contact;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contactRepo;
    
	@Override
	public void saveContact(Contact contact) {
      	contactRepo.save(contact);	
	}

	@Override
	public List<Contact> listContacts() {
       List<Contact> contacts= contactRepo.findAll();
		return contacts;
	}


	@Override
	public Contact getOneContact(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		return findById.get();
	}

	@Override
	public void deleteContactbyId(long id) {
		contactRepo.deleteById(id);
		
	}

}

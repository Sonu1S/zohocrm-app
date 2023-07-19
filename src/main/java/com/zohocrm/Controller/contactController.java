package com.zohocrm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entites.Contact;
import com.zohocrm.services.ContactService;

@Controller
public class contactController {
	
	@Autowired
	private ContactService contactService;
	

	@RequestMapping("/listallcontacts")
    public String listAllContacts(ModelMap model) {
   	 List<Contact> contacts = contactService.listContacts();
   	 model.addAttribute("contacts", contacts);
		return "search_contact_result";
	}
	
	 @RequestMapping("/contactInfo")
     public String contactInfo(@RequestParam("id") long id, ModelMap model) {
    	Contact contacts = contactService.getOneContact(id);
    	 model.addAttribute("contact", contacts);
		return "contact_info";
     } 
	 
}

package com.zohocrm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entites.Contact;
import com.zohocrm.entites.Lead;
import com.zohocrm.services.ContactService;
import com.zohocrm.services.LeadService;

@Controller
public class leadController {
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactService;
	
     @RequestMapping("/")
	public String viewCreateLeadPage() {
		return "create_lead";
		
	}
     @RequestMapping("/saveLead")
     public String SaveLead(@ModelAttribute("lead") Lead lead, ModelMap model) {
		leadService.saveOneLead(lead);
		model.addAttribute("lead",lead);
    	 return "lead_info";
     }
     
     @RequestMapping("/convertLead")
     public String convertLead(@RequestParam("id") long id, ModelMap model){
		Lead lead = leadService.getOneLeadById(id);
		
		//for copy data from lead object to contact object
		
		Contact contact = new Contact();
		contact.setFirstName(lead.getFirstname());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		
		contactService.saveContact(contact);
		
		leadService.deleteOneLeadById(id);
		
		 List<Contact> contacts = contactService.listContacts();
	   	 model.addAttribute("contacts", contacts);
			return "search_contact_result";
    
     }
     @RequestMapping("/listall")
     public String listAllLeads(ModelMap model) {
    	 List<Lead> leads = leadService.listLeads();
    	 model.addAttribute("leads", leads);
    	 
		return "search_lead_result";
    
     }
     
     @RequestMapping("/leadInfo")
     public String leadInfo(@RequestParam("id") long id, ModelMap model) {
    	 Lead leads = leadService.getOneLeadById(id);
    	 model.addAttribute("lead", leads);
		return "lead_info";
     } 
     
}  
     
     


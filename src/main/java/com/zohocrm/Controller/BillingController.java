package com.zohocrm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entites.Billing;
import com.zohocrm.entites.Contact;
import com.zohocrm.services.BillingServices;
import com.zohocrm.services.ContactService;

@Controller
public class BillingController {
	@Autowired
	private BillingServices billingService;
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/showGenerateBillPage")
     public String showGenerateBillPage(@RequestParam("id") long id, ModelMap model) {
    	 Contact contact = contactService.getOneContact(id);
		 model.addAttribute("contact", contact);
		// contactService.deleteContactbyId(id);
    	 return "generate_bill";
     }
	
	@RequestMapping("/generatebill")
	public String generateBill(@ModelAttribute("bill") Billing bill,ModelMap model) {
	 billingService.saveBill(bill);
	 List<Billing> allbills = billingService.getAllBills();
	 model.addAttribute("bills", allbills);
	    return "search_billing_result";
		
	}
	@RequestMapping("/delete")
	public String deleteBill(@RequestParam("id")long id,ModelMap model) {
		billingService.deleteBillById(id);
		List<Billing> allbills = billingService.getAllBills();
		model.addAttribute("bills", allbills);
		return "search_billing_result";
	}
	
	@RequestMapping("/update")
	public String updateBill(@RequestParam("id")long id,ModelMap model) {
		Billing bill=billingService.getOneBill(id);
		model.addAttribute("bill",bill);
		return "update_bill";
	}
	
	@RequestMapping("/updatebill")
	public String update(@ModelAttribute("bill") Billing bill,ModelMap model) {
		billingService.saveBill(bill);
		List<Billing> allbills = billingService.getAllBills();
		model.addAttribute("bills", allbills);
		return "search_billing_result";
	}
}

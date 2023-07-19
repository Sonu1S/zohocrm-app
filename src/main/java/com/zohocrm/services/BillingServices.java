package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entites.Billing;

public interface BillingServices {
    public void saveBill(Billing bill);
	//public contact getOneContact(long id);
    
    public List<Billing> getAllBills();

	public void deleteBillById(long id);

	public Billing getOneBill(long id);
	
}

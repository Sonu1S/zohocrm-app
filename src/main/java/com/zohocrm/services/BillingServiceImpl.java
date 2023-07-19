package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Repository.BillingRepository;
import com.zohocrm.entites.Billing;

@Service
public class BillingServiceImpl implements BillingServices {
    @Autowired
    private BillingRepository billingRepo;
	
	@Override
	public void saveBill(Billing bill) {
		billingRepo.save(bill);
	}

	@Override
	public List<Billing> getAllBills() {
		List<Billing> bills = billingRepo.findAll();
		return bills;
	}

	@Override
	public void deleteBillById(long id) {
		billingRepo.deleteById(id);
	}

	@Override
	public Billing getOneBill(long id) {
		Optional<Billing> findById = billingRepo.findById(id);
		Billing bill = findById.get();
		return bill;
	}

	


	

}

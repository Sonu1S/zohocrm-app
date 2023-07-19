package com.zohocrm.Repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.zohocrm.entites.Billing;

public interface BillingRepository extends JpaRepositoryImplementation<Billing, Long> {

}

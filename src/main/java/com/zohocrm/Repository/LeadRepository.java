package com.zohocrm.Repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.zohocrm.entites.Lead;

public interface LeadRepository extends JpaRepositoryImplementation<Lead, Long> {

}

package com.zohocrm.Repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.zohocrm.entites.Contact;

public interface ContactRepository extends JpaRepositoryImplementation<Contact, Long> {

}

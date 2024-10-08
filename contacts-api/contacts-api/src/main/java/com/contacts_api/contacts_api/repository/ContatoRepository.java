package com.contacts_api.contacts_api.repository;

import com.contacts_api.contacts_api.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contact, Long> {

}

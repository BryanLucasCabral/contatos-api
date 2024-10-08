package com.contacts_api.contacts_api.service;

import com.contacts_api.contacts_api.model.Contact;
import com.contacts_api.contacts_api.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContatoService {
    @Autowired
    private ContatoRepository contatoRepository;

    public Contact cadastrarContato(Contact contato){
        return contatoRepository.save(contato);
    }

    public Contact buscarContato(Long id){
        Optional<Contact> contatoOpt = contatoRepository.findById(id);
        if (contatoOpt.isPresent()) {
            return contatoOpt.get();
        }
        return null;
    }
}

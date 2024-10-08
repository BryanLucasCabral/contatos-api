package com.contacts_api.contacts_api.controller;

import com.contacts_api.contacts_api.model.Contact;
import com.contacts_api.contacts_api.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contatos")
public class ContatoController {

    @Autowired
    private ContatoService contatoService;

    @PostMapping
    public ResponseEntity<Contact> cadastrarContato(@RequestBody Contact contato){
        return ResponseEntity.status(HttpStatus.CREATED).body(contatoService.cadastrarContato(contato));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Contact> buscarContato(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(contatoService.buscarContato(id));
    }
}

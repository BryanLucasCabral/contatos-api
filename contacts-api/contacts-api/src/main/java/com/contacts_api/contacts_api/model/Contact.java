package com.contacts_api.contacts_api.model;

import com.contacts_api.contacts_api.dto.ContatoDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "tb_contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String sombreness;

    @Column(nullable = false)
    private String cellular;

    @Column(nullable = false, unique = true)
    private String email;

    public ContatoDTO toDTO(){
        ContatoDTO dto = new ContatoDTO();

        dto.setNome(nome);
        dto.setSobrenome(sombreness);
        dto.setCelular(cellular);
        dto.setEmail(email);

        return dto;
    }
}

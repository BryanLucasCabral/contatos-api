package com.contacts_api.contacts_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContatoDTO {
    private String nome;
    private String sobrenome;
    private String celular;
    private  String email;
}

package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private String email;
}

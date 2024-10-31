package com.grupo3.exame_chuunin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MissaoModel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private char classificacao;
    private String tipoMissao;
    private String status;

}

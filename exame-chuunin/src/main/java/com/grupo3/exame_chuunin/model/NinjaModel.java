package com.grupo3.exame_chuunin.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ninja")

public class NinjaModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name = "ninja")
    private String ninja;
    @Column(name = "vila")
    private String vila;
    @Column(name = "nivelExperiencia")
    private String nivelExperiencia;
    @Column(name = "status")
    private String status;



}

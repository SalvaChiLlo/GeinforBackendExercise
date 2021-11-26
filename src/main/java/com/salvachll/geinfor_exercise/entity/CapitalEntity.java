package com.salvachll.geinfor_exercise.entity;

import javax.persistence.*;

@Entity
@Table(name = "Capital")
public class CapitalEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(unique = true)
    String nombre;

    public CapitalEntity(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public CapitalEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

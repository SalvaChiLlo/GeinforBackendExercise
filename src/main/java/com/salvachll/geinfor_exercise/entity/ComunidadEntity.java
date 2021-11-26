package com.salvachll.geinfor_exercise.entity;

import javax.persistence.*;

@Entity
@Table(name = "Comunidad")
public class ComunidadEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column
    String nombre;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "pais_id", referencedColumnName = "id", nullable = false)
    PaisEntity pais;


    public ComunidadEntity(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public ComunidadEntity() {
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

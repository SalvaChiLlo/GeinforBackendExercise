package com.salvachll.geinfor_exercise.entity;

import javax.persistence.*;

@Entity
@Table(name = "Comunidad")
public class ComunidadEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(unique = true)
    String nombre;

    @Column
    int poblacion = -1;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "pais_id", nullable = false)
    PaisEntity pais;


    public ComunidadEntity(int id, String nombre, int poblacion, PaisEntity pais) {
        this.id = id;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.pais = pais;
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

    public PaisEntity getPais() {
        return pais;
    }

    public void setPais(PaisEntity pais) {
        this.pais = pais;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
}

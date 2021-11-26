package com.salvachll.geinfor_exercise.entity;

import javax.persistence.*;

@Entity
@Table(name = "Pais")
public class PaisEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column
    String nombre;

    @OneToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "capital_id", referencedColumnName = "id", nullable = false)
    CapitalEntity capital;

    public PaisEntity(int id, String nombre, CapitalEntity capital) {
        this.id = id;
        this.nombre = nombre;
        this.capital = capital;
    }

    public PaisEntity() {
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

    public CapitalEntity getCapital() {
        return capital;
    }

    public void setCapital(CapitalEntity capital) {
        this.capital = capital;
    }
}

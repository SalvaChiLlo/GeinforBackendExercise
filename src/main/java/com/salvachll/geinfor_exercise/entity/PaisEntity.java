package com.salvachll.geinfor_exercise.entity;

import javax.persistence.*;

@Entity
@Table(name = "Pais")
public class PaisEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(unique = true)
    String nombre;

    @Column
    int poblacion = -1;

    @Column
    String estado = "";

    @Column
    int deuda = (int) (Math.random() * 10_000_000);

    @OneToOne(optional = false, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "capital_id", referencedColumnName = "id", nullable = false)
    CapitalEntity capital;

    public PaisEntity(int id, String nombre, int poblacion, CapitalEntity capital) {
        this.id = id;
        this.nombre = nombre;
        this.poblacion = poblacion;
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

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
}

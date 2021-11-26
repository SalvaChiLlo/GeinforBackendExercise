package com.salvachll.geinfor_exercise.models;

import com.salvachll.geinfor_exercise.entity.CapitalEntity;

public class PaisModel {
    int id;
    String nombre;
    int poblacion = -1;
    CapitalEntity capital;

    public PaisModel(int id, String nombre, int poblacion, CapitalEntity capital) {
        this.id = id;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.capital = capital;
    }

    public PaisModel() {
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

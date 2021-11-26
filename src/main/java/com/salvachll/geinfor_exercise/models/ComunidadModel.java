package com.salvachll.geinfor_exercise.models;

import com.salvachll.geinfor_exercise.entity.PaisEntity;

public class ComunidadModel {
    int id;
    String nombre;
    int poblacion = -1;
    PaisEntity pais;

    public ComunidadModel(int id, String nombre, int poblacion, PaisEntity pais) {
        this.id = id;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.pais = pais;
    }

    public ComunidadModel() {
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

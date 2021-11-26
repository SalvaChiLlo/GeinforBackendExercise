package com.salvachll.geinfor_exercise.models;

import com.salvachll.geinfor_exercise.entity.PaisEntity;

public class ComunidadModel {
    int id;
    String nombre;
    PaisEntity pais;

    public ComunidadModel(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
}

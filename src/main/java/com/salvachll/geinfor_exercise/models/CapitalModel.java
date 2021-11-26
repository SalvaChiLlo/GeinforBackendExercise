package com.salvachll.geinfor_exercise.models;

public class CapitalModel {
    int id;
    String nombre;

    public CapitalModel(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public CapitalModel() {
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

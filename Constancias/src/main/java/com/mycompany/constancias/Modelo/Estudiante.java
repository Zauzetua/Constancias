/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constancias.Modelo;

/**
 *
 * @author jesus
 */
public class Estudiante {
    private String Id;
    private String Nombre;
    private int Semestre;
    private int cantidadMaterias;

    public Estudiante(String Id, String Nombre, int Semestre, int cantidadMaterias) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Semestre = Semestre;
        this.cantidadMaterias = cantidadMaterias;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    public int getCantidadMaterias() {
        return cantidadMaterias;
    }

    public void setCantidadMaterias(int cantidadMaterias) {
        this.cantidadMaterias = cantidadMaterias;
    }

    @Override
    public String toString() {
        return Id + " - " + Nombre;
    }
}

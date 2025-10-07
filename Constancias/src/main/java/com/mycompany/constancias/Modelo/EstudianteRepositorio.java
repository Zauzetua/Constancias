/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constancias.Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jesus
 */
public class EstudianteRepositorio {

    private final List<Estudiante> Estudiantes = new ArrayList<>();

    public EstudianteRepositorio() {
        Estudiantes.add(
                new Estudiante("00000251943", "Jesus Egren", 5, 7));
        Estudiantes.add(
                new Estudiante("00000251944", "Martin Vargas", 2, 5));
        Estudiantes.add(
                new Estudiante("00000251945", "Ana Lila", 6, 8));
        Estudiantes.add(
                new Estudiante("00000251946", "Alberto Ramirez", 1, 4));
        Estudiantes.add(
                new Estudiante("00000251947", "Enrique Borbon", 3, 6));
        Estudiantes.add(
                new Estudiante("00000251948", "Andres Zazueta", 7, 7));
        Estudiantes.add(
                new Estudiante("00000251949", "Balatro Balatrez", 2, 5));
    }

    public List<Estudiante> BuscarPorIdPrefijo(String Id) {
        //Hace mucho que no usaba stream jaja
        return Estudiantes.stream().filter((e) -> e.getId().contains(Id)).toList();
    }

    public Estudiante BuscarPorId(String Id) {
        return Estudiantes.stream().filter((e) -> e.getId().equals(Id)).findFirst().orElse(null);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constancias.Controlador;

import com.mycompany.constancias.Modelo.Estudiante;
import com.mycompany.constancias.Modelo.EstudianteRepositorio;
import com.mycompany.constancias.Modelo.GeneradorConstancias;
import com.mycompany.constancias.Vista.ConsolaVista;
import java.util.List;

/**
 *
 * @author jesus
 */
public class Controlador {

    private final EstudianteRepositorio Repo;
    private final GeneradorConstancias Gen;
    private final ConsolaVista Vista;

    public Controlador(EstudianteRepositorio Repo, GeneradorConstancias Gen, ConsolaVista Vista) {
        this.Repo = Repo;
        this.Gen = Gen;
        this.Vista = Vista;
    }

    public List<Estudiante> ManejarInput(String prefix) {
        return Repo.BuscarPorIdPrefijo(prefix);
    }

    public Estudiante ManejarEstudianteSeleccionado(String id) {
        return Repo.BuscarPorId(id);
    }

    public String ManejarGenerarConstancia(Estudiante Estudiante) {
        return Gen.Generar(Estudiante);
    }
}

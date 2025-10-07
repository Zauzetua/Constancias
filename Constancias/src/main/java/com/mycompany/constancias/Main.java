/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constancias;

import com.mycompany.constancias.Controlador.Controlador;
import com.mycompany.constancias.Modelo.EstudianteRepositorio;
import com.mycompany.constancias.Modelo.GeneradorConstancias;
import com.mycompany.constancias.Vista.ConsolaVista;

/**
 *
 * @author jesus
 */
public class Main {

    public static void main(String[] args) {
        EstudianteRepositorio repo = new EstudianteRepositorio();
        GeneradorConstancias certGen = new GeneradorConstancias();
        ConsolaVista view = new ConsolaVista();
        Controlador controller = new Controlador(repo, certGen, view);
        view.start(controller);
    }

}

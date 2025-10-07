/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constancias.Modelo;

import java.util.Date;

/**
 *
 * @author jesus
 */
public class GeneradorConstancias {

    public String Generar(Estudiante Estudiante) {
        if (Estudiante == null) {
            return "N/A";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("========================================\n");
        sb.append("         CONSTANCIA DE INSCRIPCIÓN      \n");
        sb.append("========================================\n");
        sb.append("Alumno: ").append(Estudiante.getNombre()).append("\n");
        sb.append("ID: ").append(Estudiante.getId()).append("\n");
        sb.append("Semestre inscrito: ").append(Estudiante.getSemestre()).append("\n");
        sb.append("Cantidad de materias: ").append(Estudiante.getCantidadMaterias()).append("\n");
        sb.append("\n");
        sb.append("Se hace constar que el alumno se encuentra inscrito en el periodo vigente.\n");
        sb.append("\n");
        sb.append("Fecha de emision: ").append(new Date()).append("\n");
        sb.append("Firma: ____________ITSON_________________\n");
        sb.append("Sello: ____________Sello Balatro___________\n");
        sb.append("========================================\n");
        return sb.toString();
    }

}

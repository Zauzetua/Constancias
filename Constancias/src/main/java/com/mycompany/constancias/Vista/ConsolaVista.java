/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constancias.Vista;

import com.mycompany.constancias.Controlador.Controlador;
import com.mycompany.constancias.Modelo.Estudiante;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class ConsolaVista {

    private Scanner scanner = new Scanner(System.in);

    public void start(Controlador controller) {
        System.out.println("=== Sistema de Constancias (Consola) ===");
        System.out.println("Instrucciones: Teclea partes del ID para buscar. 'exit' para salir.");
        String prefix = "";
        while (true) {
            System.out.print("\nTeclea ID:\n");
            prefix = scanner.nextLine().trim();
            if (prefix.equalsIgnoreCase("exit")) {
                System.out.println("Saliendo...");
                break;
            }
            if (prefix.isEmpty()) {
                System.out.println("(Escribe al menos un caracter para buscar.)");
                continue;
            }

            List<Estudiante> matches = controller.ManejarInput(prefix);
            showMatches(matches);

            if (matches.isEmpty()) {
                continue;
            }

            System.out.print("Selecciona numero de alumno para ver detalles (0 para seguir tecleando) > ");
            String sel = scanner.nextLine().trim();
            int idx;
            try {
                idx = Integer.parseInt(sel);
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Volviendo a búsqueda.");
                continue;
            }
            if (idx == 0) {
                continue;
            }
            if (idx < 1 || idx > matches.size()) {
                System.out.println("Numero fuera de rango. Volviendo a busqueda.");
                continue;
            }
            Estudiante chosen = matches.get(idx - 1);
            showDetails(chosen);

            System.out.print("Generar constancia para este alumno? (s/n) > ");
            String gen = scanner.nextLine().trim();
            if (gen.equalsIgnoreCase("s") || gen.equalsIgnoreCase("y")) {
                String constancia = controller.ManejarGenerarConstancia(chosen);
                showCertificate(constancia);
                System.out.print("Deseas generar otra constancia? (s/n) > ");
                String otro = scanner.nextLine().trim();
                if (!otro.equalsIgnoreCase("s") && !otro.equalsIgnoreCase("y")) {
                    System.out.println("Finalizando sesión.");
                    break;
                }
            } else {
                System.out.println("No se genero constancia. Volviendo a búsqueda.");
            }
        }
    }

    public void showMatches(List<Estudiante> matches) {
        if (matches.isEmpty()) {
            System.out.println("No se encontraron coincidencias.");
            return;
        }
        System.out.println("\nCoincidencias:");
        for (int i = 0; i < matches.size(); i++) {
            System.out.printf("  %d) %s\n", i + 1, matches.get(i).toString());
        }
    }

    public void showDetails(Estudiante s) {
        System.out.println("\n--- Datos de confirmacion ---");
        System.out.println("ID: " + s.getId());
        System.out.println("Nombre: " + s.getNombre());
        System.out.println("Semestre inscrito: " + s.getSemestre());
        System.out.println("Cantidad de materias: " + s.getCantidadMaterias());
        System.out.println("-----------------------------");
    }

    public void showCertificate(String certText) {
        System.out.println("\n\n***** CONSTANCIA *****");
        System.out.println(certText);
        System.out.println("***** FIN CONSTANCIA *****\n\n");
    }
}

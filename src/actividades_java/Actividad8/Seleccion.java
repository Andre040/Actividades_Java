/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades_java.Actividad8;

import java.util.*;

/**
 *
 * @author andre
 */
public class Seleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sistema de nomina");
        System.out.println("-----------------");
        char opcion,volver;
        do {
            System.out.println("A. Horas extras.");
            System.out.println("B. Sueldo basico.");
            System.out.println("C. Devengado.");
            System.out.println("N. Salir del sistema.");
            System.out.print("Seleccione opcion: ");
            opcion = sc.next().charAt(0);
            System.out.println("------------------");
            if (opcion == 'A' || opcion == 'a') {
                Horas_extra.mostrarHoras();
                System.out.println("-----------------");
            } else if (opcion == 'B' || opcion == 'b') {
                Sueldo_basico.mostrarSueldo();
                System.out.println("-----------------");
            } else if (opcion == 'C' || opcion == 'c') {
                Devengado.mostrarDevengado();
                System.out.println("-----------------");
            } else if (opcion == 'N' || opcion == 'n') {
                
            } else {
                System.out.println("Opcion incorrecta");
            }
            System.out.println("¿Desea volver al menu?");
            System.out.println("S = Si / N = No");
            volver = sc.next().charAt(0);
            System.out.println("-----------------");
        } while (volver == 's' || volver == 'S');

    }
}

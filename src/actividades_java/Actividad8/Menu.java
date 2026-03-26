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
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("Menu de voxLess");
        System.out.println("-----------------");
        char opcion, volver;
        do {
            System.out.println("A. Inicio.");
            System.out.println("B. Jugar.");
            System.out.println("C. Perfil.");
            System.out.println("D. Acerca de nosotros.");
            System.out.println("S. Salir.");
            System.out.print("Seleccione opción: ");
            opcion = sc.next().charAt(0);
            System.out.println("------------------");

            if (opcion == 'A' || opcion == 'a') {
                Inicio.mostrarInicio();
            } else if (opcion == 'B' || opcion == 'b') {
                juego.mostrarJuego();
            } else if (opcion == 'C' || opcion == 'c') {
                Perfil.mostrarPerfil();
            } else if (opcion == 'D' || opcion == 'd') {
                Sobre_nosotros.mostrarSobre();
            } else if (opcion == 'S' || opcion == 's') {
                System.out.println("Saliendo del programa...");
                break; 
            } else {
                System.out.println("Opción incorrecta");
            }

            System.out.println("-----------------");
            System.out.println("¿Desea volver al menú?");
            System.out.println("S = Sí / N = No");
            volver = sc.next().charAt(0);
            System.out.println("-----------------");

        } while (volver == 's' || volver == 'S');

    }
}

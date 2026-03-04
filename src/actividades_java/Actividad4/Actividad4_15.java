/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades_java.Actividad4;
import java.util.*;
/**
 *
 * @author andre
 */
public class Actividad4_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una letra (A-L): ");
        char opcion = sc.next().toUpperCase().charAt(0);

        switch (opcion) {

            case 'A':
                System.out.println("Enero");
                break;

            case 'B':
                System.out.println("Febrero");
                break;

            case 'C':
                System.out.println("Marzo");
                break;

            case 'D':
                System.out.println("Abril");
                break;

            case 'E':
                System.out.println("Mayo");
                break;

            case 'F':
                System.out.println("Junio");
                break;

            case 'G':
                System.out.println("Julio");
                break;

            case 'H':
                System.out.println("Agosto");
                break;

            case 'I':
                System.out.println("Septiembre");
                break;

            case 'J':
                System.out.println("Octubre");
                break;

            case 'K':
                System.out.println("Noviembre");
                break;

            case 'L':
                System.out.println("Diciembre");
                break;

            default:
                System.out.println("Opción inválida.");
        }
    }
    
}

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
public class Actividad4_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de teléfono: ");
        String telefono = sc.next();

        int longitud = telefono.length();

        switch (longitud) {

            case 7:
                System.out.println("Es un teléfono fijo local.");
                break;

            case 9:
                if (telefono.startsWith("99")) {
                    System.out.println("Es un móvil - Movistar.");
                } 
                else if (telefono.startsWith("98")) {
                    System.out.println("Es un móvil - Claro.");
                } 
                else {
                    System.out.println("Es un móvil.");
                }
                break;

            default:
                if (longitud > 9) {
                    System.out.println("Es un número internacional.");
                } else {
                    System.out.println("Número inválido.");
                }
        }
    }
    
}

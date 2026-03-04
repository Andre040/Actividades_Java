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
public class Actividad4_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el peso del paquete (kg): ");
        double peso = sc.nextDouble();

        if (peso > 5) {
            System.out.println("El paquete excede el peso permitido. Envío rechazado.");
        } 
        else {

           System.out.println("Zonas disponibles:");
            System.out.println("1. América del Norte");
            System.out.println("2. América Central");
            System.out.println("3. América del Sur");
            System.out.println("4. Europa");
            System.out.println("5. Asia");
            int zona = sc.nextInt();

            double costoPorKg = 0;

            switch (zona) {
                case 1:
                    costoPorKg = 24000;
                    break;
                case 2:
                    costoPorKg = 20000;
                    break;
                case 3:
                    costoPorKg = 21000;
                    break;
                case 4:
                    costoPorKg = 10000;
                    break;
                case 5:
                    costoPorKg = 18000;
                    break;
                default:
                    System.out.println("Zona inválida.");
                    return;
            }

            double total = peso * costoPorKg;

            System.out.println("El costo total del envío es: " + total + " pesos");
        }
    }
    
}

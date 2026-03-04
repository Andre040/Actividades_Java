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
public class Actividad4_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Precio inicial por kilo: ");
        double precio = sc.nextDouble();

        System.out.print("Tipo de uva (A/B): ");
        char tipo = sc.next().charAt(0);

        System.out.print("Tamaño (1/2): ");
        int tamaño = sc.nextInt();

        System.out.print("Cantidad de kilos: ");
        int kilos = sc.nextInt();

        if (tipo == 'A') {
            if (tamaño == 1) {
                precio += 2000;
            } else if (tamaño == 2) {
                precio += 3000;
            }
        } else if (tipo == 'B') {
            if (tamaño == 1) {
                precio -= 3000;
            } else if (tamaño == 2) {
                precio -= 5000;
            }
        } if (precio < 0) {
            precio = 0;
        }

        double total = precio * kilos;

        System.out.println("El productor recibirá: " + total + " pesos");
    }
    
}

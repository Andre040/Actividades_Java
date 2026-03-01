/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades_java.actividad3;
import java.util.*;
/**
 *
 * @author andre
 */
public class Actividad3_15 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la nota 1: ");
        double n1 = sc.nextDouble();

        System.out.print("Ingrese la nota 2: ");
        double n2 = sc.nextDouble();

        System.out.print("Ingrese la nota 3: ");
        double n3 = sc.nextDouble();

        double menor = n1;

        if (n2 < menor) {
            menor = n2;
        }

        if (n3 < menor) {
            menor = n3;
        }

        double promedio = (n1 + n2 + n3 - menor) / 2;

        System.out.println("El promedio de las dos notas más altas es: " + promedio);
    }
    
}

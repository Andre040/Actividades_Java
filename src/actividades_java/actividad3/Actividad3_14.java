/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades_java.actividad3;
import java.util.*;
public class Actividad3_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el lado 1: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese el lado 2: ");
        double b = sc.nextDouble();

        System.out.print("Ingrese el lado 3: ");
        double c = sc.nextDouble();

        double s = (a + b + c) / 2;

        double resultado = s * (s - a) * (s - b) * (s - c);

        double area = resultado;  
        area = area / 2;  

        System.out.println("Área = " + area);
    }
    
}

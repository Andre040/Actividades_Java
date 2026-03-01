/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades_java.actividad3;

import java.util.*;
public class Actividad3_13 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        
        double lado, area;
        
        System.out.print("Ingrese el lado del triángulo: ");
        lado = sc.nextDouble();
        
        area = (1.732 / 4) * lado * lado;
        
        System.out.println("El área del triángulo equilátero es: " + area);
    }
    
}

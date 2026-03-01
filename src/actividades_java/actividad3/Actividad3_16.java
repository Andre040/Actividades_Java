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
public class Actividad3_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese los galones surtidos: ");
        double galones = sc.nextDouble();

        double litros = galones * 3.785;
        double total = litros * 1.02515;

        System.out.println("Total a cobrar: $" + total);
    }
    
}

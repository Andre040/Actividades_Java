/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades_java.actividad3;

import java.util.*;
public class Actividad3_5 {
    
    public static void main(String[] args) {
    int A,B,P;
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        A=sc.nextInt();
        System.out.println("Ingrese el segundo valor");
        B=sc.nextInt();
        P=A+B;
        System.out.println("La suma de "+A+" y de "+B+" es "+P);
        P=A-B;
        System.out.println("La resta de "+A+" y de "+B+" es "+P);
        P=A*B;
        System.out.println("La Multiplicacion de "+A+" y de "+B+" es "+P);
        P=A/B;
        System.out.println("La Division de "+A+" y de "+B+" es "+P);
    }
    
}

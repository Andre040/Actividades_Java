/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades_java.actividad3;
import java.util.*;
public class Actividad3_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1, n2, n3, n4, mayor;
        
        System.out.print("Ingrese el primer número: ");
        n1 = sc.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        n2 = sc.nextInt();
        
        System.out.print("Ingrese el tercer número: ");
        n3 = sc.nextInt();
        
        System.out.print("Ingrese el cuarto número: ");
        n4 = sc.nextInt();
        
        mayor = n1; 
        
        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }
        if (n4 > mayor) {
            mayor = n4;
        }
        
        System.out.println("El mayor es: " + mayor);
    }
    
}

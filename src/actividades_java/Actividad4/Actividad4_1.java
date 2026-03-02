/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades_java.Actividad4;
import java.util.*;
public class Actividad4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a,b,c;
        System.out.print("Ingrese el valor de a: ");
        a=sc.nextInt();
        System.out.print("Ingrese el valor de b: ");
        b=sc.nextInt();
        System.out.print("Ingrese el valor de c: ");
        c=sc.nextInt();
        if (a>b && a>c) {
            System.out.println("El numero mayor es "+a);
        }else if (b>a && b>c) {
            System.out.println("El numero mayor es "+b);
        }else if(c>a && c>b){
            System.out.println("El numero mayor es "+c);
        }else {
            System.out.println("Todos los numeros son iguales");
        }
    }
    
}

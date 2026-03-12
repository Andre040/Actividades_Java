/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades_java.Actividad6;
import java.util.*;
/**
 *
 * @author andre
 */
public class Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n,i=1,n1,n2,n3;
        System.out.print("Ingrese la cantidad de alumnos: ");
        n=sc.nextInt();
        sc.nextLine();
        System.out.println("---------------------------");
        while(i<=n){
            System.out.println("Alumno "+i);
            System.out.print("Ingrese nota 1: ");
            n1=sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese nota 2: ");
            n2=sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese nota 3: ");
            n3=sc.nextInt();
            sc.nextLine();
            System.out.println("Su promedio es de "+(n1+n2+n3)/3);
            System.out.println("---------------------------");
            i++;
        }
    }
    
}

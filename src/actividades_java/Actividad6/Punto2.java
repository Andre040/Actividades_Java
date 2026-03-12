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
public class Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i=1,n;
        double s,d;
        String Nd,nombre;
        System.out.print("Digite la cantidad de empleados: ");
        n=sc.nextInt();
        sc.nextLine();
        System.out.println("---------------------------");
        while(i<=n){
            System.out.println("Empleado "+i);
            System.out.print("Ingrese su numero de documento: ");
            Nd=sc.nextLine();
            System.out.print("Ingrese su nombre: ");
            nombre=sc.nextLine();
            System.out.print("Ingrese su salario: ");
            s=sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese su deducciones: ");
            d=sc.nextInt();
            sc.nextLine();
            System.out.println("Su neto a pagar es: "+(s-d));
            System.out.println("---------------------------");
            i++;
        }
    }
    
}

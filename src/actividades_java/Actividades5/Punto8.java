/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades_java.Actividades5;

import java.util.Scanner;

/**
 *
 * @author APRENDIZ
 */
public class Punto8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ne;
        double d,s,p;
        String n,docs;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite la cantidad de empleados: ");
        ne=sc.nextInt();
        sc.nextLine();
        for(int i = 1; i<=ne; i++){
            System.out.print("Documento: ");  
            docs=sc.nextLine();
            System.out.print("Nombres y apellidos: ");  
            n=sc.nextLine();
            System.out.print("Salario Basico: ");  
            s=sc.nextDouble();
            System.out.print("Deducciones: ");  
            d=sc.nextDouble();
            sc.nextLine();
            p=s-d;
            System.out.println("Neto a pagar= "+p);
            System.out.println("---------------------");
        }
    }
    
}

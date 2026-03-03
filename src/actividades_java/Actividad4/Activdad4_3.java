/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades_java.Actividad4;
import java.util.*;
/**
 *
 * @author APRENDIZ
 */
public class Activdad4_3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A,B,R;
    Scanner sc= new Scanner(System.in);
        System.out.println("Digite el dividiendo");
        A=sc.nextInt();
        System.out.println("Digite el divisor");
        B=sc.nextInt();
        if (B==0){
            System.out.println("No se puede dividir por 0 bruto hpta");
        } else {
        R=A/B;
            System.out.println("El resultado de la division es "+R);
        }
        
    }
    
}

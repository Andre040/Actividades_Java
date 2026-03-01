/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades_java.actividad3;
import java.util.*;

public class Actividad3_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double baseMenor, baseMayor, altura, area;
        
        System.out.print("Ingrese la base menor: ");
        baseMenor = sc.nextDouble();
        
        System.out.print("Ingrese la base mayor: ");
        baseMayor = sc.nextDouble();
        
        System.out.print("Ingrese la altura: ");
        altura = sc.nextDouble();
        
        area = ((baseMayor + baseMenor) * altura) / 2;
        
        System.out.println("El área del trapecio es: " + area);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades_java.actividad3;
import java.util.*;
public class Actividad3_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double radio, altura, area, volumen;
        
        System.out.print("Ingrese el radio: ");
        radio = sc.nextDouble();
        
        System.out.print("Ingrese la altura: ");
        altura = sc.nextDouble();
        
        area = 2 * Math.PI * radio * (radio + altura);
        volumen = Math.PI * radio * radio * altura;
        
        System.out.println("El área del cilindro es: " + area);
        System.out.println("El volumen del cilindro es: " + volumen);
    }
    
}

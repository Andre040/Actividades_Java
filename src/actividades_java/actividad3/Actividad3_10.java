/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades_java.actividad3;
import java.util.*;
public class Actividad3_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        
        double soles, dolares;
        double tipoCambio = 3.80;
        
        System.out.print("Ingrese la cantidad en soles: ");
        soles = sc.nextDouble();
        
        dolares = soles / tipoCambio;
        
        System.out.println("El monto en dólares es: $" + dolares);
    }
    
}

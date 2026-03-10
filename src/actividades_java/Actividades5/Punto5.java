/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades_java.Actividades5;

/**
 *
 * @author APRENDIZ
 */
public class Punto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fila=5;
        for (int i = 1; i<=fila; i++){
            
            for (int F= 1; F<=fila-i;F++){
            System.out.print(" ");
            }
            
            for (int j=1; j<=(2*i-1);j++){
                System.out.print("*");
            }
            
             System.out.println(); 
        }
    }
    
}

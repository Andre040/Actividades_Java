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
public class Actividad4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char c;
        System.out.println("Escriba cualquier frase");
        c=sc.next().charAt(0);
        if (c >='A' && c<='Z'){
            System.out.println("La primera letra es mayuscula " + c);
        } else {
            System.out.println("La primera letra es minuscula");
        }
}
    
}

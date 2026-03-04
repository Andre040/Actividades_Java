/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades_java.Actividad4;
import java.util.*;
/**
 *
 * @author andre
 */
public class Actividad4_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();

        String mensaje = "";

        if (edad < 0) {
            mensaje = "Edad inválida.";
        } 
        else if (edad <= 3) {
            mensaje = "Eres un Bebé.";
        } 
        else if (edad <= 9) {
            mensaje = "Eres un Infante.";
        } 
        else if (edad <= 12) {
            mensaje = "Eres un Puberto.";
        } 
        else if (edad <= 19) {
            mensaje = "Eres un Adolescente.";
        } 
        else if (edad <= 29) {
            mensaje = "Eres un Joven.";
        } 
        else if (edad <= 39) {
            mensaje = "Eres un Adulto.";
        } 
        else if (edad <= 59) {
            mensaje = "Eres un Adulto Mayor.";
        } 
        else {
            mensaje = "Eres un Anciano.";
        }

        System.out.println(mensaje);
    }
    
}

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
public class Actividad4_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una vocal: ");
        char letra = sc.next().toLowerCase().charAt(0);

        String palabra = "";

        switch (letra) {

            case 'a':
                palabra = "Amor";
                break;

            case 'e':
                palabra = "Elefante";
                break;

            case 'i':
                palabra = "Iglesia";
                break;

            case 'o':
                palabra = "Oso";
                break;

            case 'u':
                palabra = "Uva";
                break;

            default:
                palabra = "No es una vocal";
        }

        System.out.println(palabra);
    }
    
}

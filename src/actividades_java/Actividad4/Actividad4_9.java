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
public class Actividad4_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 12: ");
        int mes = sc.nextInt();

        if (mes == 1) {
            System.out.println("Enero tiene 31 días");
        } 
        else if (mes == 2) {
            System.out.println("Febrero tiene 29 días");
        } 
        else if (mes == 3) {
            System.out.println("Marzo tiene 31 días");
        } 
        else if (mes == 4) {
            System.out.println("Abril tiene 30 días");
        } 
        else if (mes == 5) {
            System.out.println("Mayo tiene 31 días");
        } 
        else if (mes == 6) {
            System.out.println("Junio tiene 30 días");
        } 
        else if (mes == 7) {
            System.out.println("Julio tiene 31 días");
        } 
        else if (mes == 8) {
            System.out.println("Agosto tiene 31 días");
        } 
        else if (mes == 9) {
            System.out.println("Septiembre tiene 30 días");
        } 
        else if (mes == 10) {
            System.out.println("Octubre tiene 31 días");
        } 
        else if (mes == 11) {
            System.out.println("Noviembre tiene 30 días");
        } 
        else if (mes == 12) {
            System.out.println("Diciembre tiene 31 días");
        } 
        else {
            System.out.println("Número inválido");
        }
    }
    
}

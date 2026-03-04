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
public class Actividad4_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int alumnos = sc.nextInt();

        double costoPorAlumno;
        double totalPagar;

        if (alumnos >= 100) {
            costoPorAlumno = 650000;
            totalPagar = costoPorAlumno * alumnos;
        } 
        else if (alumnos >= 50) {
            costoPorAlumno = 700000;
            totalPagar = costoPorAlumno * alumnos;
        } 
        else if (alumnos >= 30) {
            costoPorAlumno = 950000;
            totalPagar = costoPorAlumno * alumnos;
        } 
        else {
            totalPagar = 2000000;
            costoPorAlumno = totalPagar / alumnos;
        }

        System.out.println("Cada alumno debe pagar: " + costoPorAlumno + " pesos");
        System.out.println("La escuela debe pagar en total: " + totalPagar + " pesos");

    }
    
}

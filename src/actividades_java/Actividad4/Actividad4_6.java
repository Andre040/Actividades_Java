/*
Realiza un programa que calcule la aceptación de una solicitud en base a
los siguientes parámetros: edad, nota y sexo.
✓ Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
✓ Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
✓ Otros casos -> NO ACEPTADA
 */
package actividades_java.Actividad4;
import java.util.*;
/**
 *
 * @author andre
 */
public class Actividad4_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese la nota: ");
        double nota = sc.nextDouble();

        System.out.print("Ingrese el sexo (M/F): ");
        char sexo = sc.next().charAt(0);

        if (nota >= 5 && edad >= 18 && sexo == 'F') {
            System.out.println("ACEPTADA");
        } 
        else if (nota >= 5 && edad >= 18 && sexo == 'M') {
            System.out.println("POSIBLE");
        } 
        else {
            System.out.println("NO ACEPTADA");
        }
    }
    
}

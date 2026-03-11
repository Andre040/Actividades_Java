/*
Crear un algoritmo que solicite la cantidad de alumnos para ingresar a
cada uno de ellos 3 calificaciones, al final de cada estudiante mostrar el
promedio de la definitiva, si el promedio es menor que 3 arrojar un
mensaje “Reprobado”, de lo contrario si el promedio se encuentra entre 3
y 5 arrojar un mensaje “Aprobado”.
 */
package actividades_java.Actividades5;

import java.util.*;

/**
 *
 * @author APRENDIZ
 */
public class Punto7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int e,n1,n2,n3,r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite la cantidad de alumnos: ");
        e=sc.nextInt();
        for(int i = 1; i<=e; i++){
            System.out.println("Estudiante "+i);
            System.out.print("Digite nota 1: ");
            n1=sc.nextInt();
            System.out.print("Digite nota 2: ");
            n2=sc.nextInt();
            System.out.print("Digite nota 3: ");
            n3=sc.nextInt();
            r=(n1+n2+n3)/3;
            if (r>=3){
                System.out.println("El promedio es: "+r+" Aprobado");
            }else{
                System.out.println("El promedio es: "+r+" Reprobado");
            }
            System.out.println("--------------------------");
        }
    }

}

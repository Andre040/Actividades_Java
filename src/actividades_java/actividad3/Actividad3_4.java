/*
Calcular el Promedio de tres números. Ej: de la salida: “El promedio de los
3 números es...: 8.5 mts. “
 */
package actividades_java.actividad3;
import java.util.*;
public class Actividad3_4 {

    public static void main(String[] args) {
        int A,B,C;
        double P;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cuantos metros ha recorrido el personaje 1");
        A=sc.nextInt();
        System.out.println("Ingrese cuantos metros ha recorrido el personaje 2");
        B=sc.nextInt();
        System.out.println("Ingrese cuantos metros ha recorrido el personaje 3");
        C=sc.nextInt();
        P = A+B+C;
        P = P/3;
        System.out.println("El promedio es= "+P);
    }
    
}

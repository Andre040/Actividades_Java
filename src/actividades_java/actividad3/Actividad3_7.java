/*
 Se ingresa la base y la altura de un rectángulo. Imprima su área.
 */
package actividades_java.actividad3;
import java.util.*; 

public class Actividad3_7 {

    public static void main(String[] args) {
        int AR,B,A;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la altura del rectangulo = ");
        A=sc.nextInt();
        System.out.print("Ingrese la base del rectangulo = ");
        B=sc.nextInt();
        AR=B*A;
        System.out.println("El area del rectangulo es "+AR);
    }
    
}

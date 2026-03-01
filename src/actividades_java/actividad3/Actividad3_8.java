/*
Se ingresa el radio de una circunferencia. Imprimir la longitud de dicha circunferencia.
 */
package actividades_java.actividad3;
import java.util.*;

public class Actividad3_8 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int R;
    double L;
        System.out.print("Ingrese el radio de la circunferencia ");
        R=sc.nextInt();
        L=2*3.1416*R;
        System.out.println("La longitud es "+L);
    }
    
}

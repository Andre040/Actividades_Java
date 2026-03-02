/*
Realiza un programa que pida un número por teclado y nos indique si es
par o impar.
 */
package actividades_java.Actividad4;
import java.util.*;
/**
 *
 * @author andre
 */
public class Actividad4_2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int A,P;
        System.out.print("Digite un numero: ");
    A=sc.nextInt();
    P=A/2;
        if (A%1) {
            System.out.println("Es impar");
        }
    }
    
}

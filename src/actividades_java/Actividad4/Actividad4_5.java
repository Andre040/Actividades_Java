/*
Realiza un programa que calcule la potencia de un número, dado este y su
exponente. Pueden ocurrir tres casos:
✓ El exponente sea positivo: imprime resultado en pantalla.
✓ El exponente sea 0, el resultado es 1.
✓ El exponente sea negativo, el resultado es 1/potencia con el exponente
positivo.
 */
package actividades_java.Actividad4;
import java.util.*;
/**
 *
 * @author APRENDIZ
 */
public class Actividad4_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,e,r,i=1;
        System.out.print("Digite el primer numero: ");
        a=sc.nextInt();
        System.out.print("Digite la potencia: ");
        e=sc.nextInt();
        if (e==0){
           r=1;
            System.out.println("Tu resultado es: "+r);
        }else if (e<0){
            r=a;
              r=r*a;
            i++;
            
            System.out.println("El resultado es 1/"+r);
        } else{
            r=a;
        while (i<e){
            r=r*a;
            i++;
        }
        System.out.println("El resultado es: "+r);
    }
    }
}

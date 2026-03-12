/*
Utilizando el Ciclo While construya un algoritmo que imprima las tablas de multiplicar del 1 al
10. (While anidados).
 */
package actividades_java.Actividad6;

/**
 *
 * @author andre
 */
public class Punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=1,j=1;
        while (i<=10){
            System.out.println("La tabla del "+i);
            j=1;
            while (j<=10){
                System.out.println(i+"X"+j+"= "+(i*j));
                j++;
            }
                System.out.println("------------------");
            i++;
        }
            
    }
    
}

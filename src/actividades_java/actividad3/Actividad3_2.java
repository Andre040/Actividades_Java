package actividades_java.actividad3;

import java.util.*;

public class Actividad3_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad1, edad2, edad3;
        System.out.print("Digite edad 1 = ");
        edad1 = sc.nextInt();
        System.out.print("Digite edad 2 = ");
        edad2 = sc.nextInt();
        System.out.print("Digite edad 3 = ");
        edad3 = sc.nextInt();
        if (edad1 >= 18 && edad2 >= 18 && edad3 >= 18) {
            System.out.println("todos son mayores de edad");
        } else if (edad1<=0 || edad2<=0 ||edad3<=0){
            System.out.println("Edad no valida");
        }else if (edad1 < 18 && edad2 < 18 && edad3 < 18) {
            System.out.println("Todos son menores de edad");
        } else if ((edad1 >= 18 && edad2 >= 18) || (edad3 >= 18 && edad1 >= 18) || (edad2 >= 18 && edad3 >= 18)) {
            System.out.println("Solo dos son mayores de edad");
        } else if ((edad1 < 18 && edad2 < 18) || (edad3 < 18 && edad1 < 18) || (edad2 < 18 && edad3 < 18)) {
            System.out.println("Solo dos son menores de edad");
        } else { 
        System.out.println("Todos son menores de edad");
    }
    }
}

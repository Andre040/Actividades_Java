    package actividades_java.Actividad3;

import java.util.*;
public class actividad3_1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double PI = 3.1416, r, Area;
        System.out.print("Ingrese el radio = ");
        r=sc.nextDouble();
        Area=(r*r)*PI;      
        System.out.println("El area del circulo es = "+Area);   
    }
}

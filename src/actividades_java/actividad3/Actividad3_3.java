/*
Leer por teclado sus datos personales y arrojar la información por consola.
Nombres – Apellidos – Edad – Genero – Dirección – Teléfono – Nombre
carrera que estudia.
Nota: Mostrar los datos por pantalla en una sola Línea.
 */
package actividades_java.actividad3;
import java.util.*;
public class Actividad3_3 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String Nombre,Apellido,Direccion,Nombre_carrera,Telefono;
    int Edad;
    char Genero;
        System.out.print("Ingrese sus nombres= ");
    Nombre=sc.nextLine();
        System.out.print("Ingrese sus apellidos= ");
    Apellido=sc.nextLine();
        System.out.print("Ingrese su edad= ");
    Edad=sc.nextInt();
        System.out.print("Ingrese su Genero(M/F)= ");
    Genero=sc.next().charAt(0);
    sc.nextLine();
        System.out.print("Ingrese su Direccion= ");
    Direccion=sc.nextLine();
        System.out.print("Ingrese su Telefono= ");
    Telefono=sc.nextLine();
        System.out.print("Ingrese su Nombre de su carrera= ");
    Nombre_carrera=sc.nextLine(); 
    switch (Genero){
        case 'M':{
            System.out.println("Bienvenido "+Nombre+" "+Apellido +" Su edad es "+Edad+" y su genero es Masculino tu direccion es "+Direccion+" Y tu telefono es "+Telefono+" y el nombre de su carrera es "+Nombre_carrera);
            break;
        }
        case 'F':{
            System.out.println("Bienvenido "+Nombre+" "+Apellido + " Su edad es "+Edad+" y su genero es Femenino tu direccion es "+Direccion+" Y tu telefono es "+Telefono+" y el nombre de su carrera es "+Nombre_carrera);
            break;
        }
        default:{
            System.out.println("Genero invalido");
        }
    }
    }  
    }  


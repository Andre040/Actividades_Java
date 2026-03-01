package actividades_java.Actividad2;

public class Actividad2 {
    public static void main(String[] args) {
    int A=12, B=3, C=12;
    boolean rta;
    rta= (A > 3);
        System.out.println("la respuesta de la A es "+rta);
    rta= A > C;
        System.out.println("la respuesta de la B es "+rta);
    rta= A < C;
        System.out.println("la respuesta de la C es "+rta);
    rta= B < C;
        System.out.println("la respuesta de la D es "+rta);
    rta= B != C;
        System.out.println("la respuesta de la E es "+rta);
    rta= A == 3;
        System.out.println("la respuesta de la F es "+rta);
    rta= A * B == 15;
        System.out.println("la respuesta de la G es "+rta);
    rta= A * B == -30;
        System.out.println("la respuesta de la H es "+rta);
    rta= C / B < A;
        System.out.println("la respuesta de la I es "+rta);
    rta= C / B == -10;
        System.out.println("la respuesta de la J es "+rta);
    rta= C / B == -4;
        System.out.println("la respuesta de la K es "+rta);
    rta= A + B + C == 5;
        System.out.println("la respuesta de la L es "+rta);
    rta= (A+B == 8) && (A-B == 2);
        System.out.println("la respuesta de la M es "+rta);
    rta= (A+B == 8) || (A-B == 6);
        System.out.println("la respuesta de la N es "+rta);
    rta= A > 3 && B > 3 && C < 3;
        System.out.println("la respuesta de la O es "+rta);
    rta= A > 3 && B >= 3 && C < -3;
        System.out.println("la respuesta de la P es "+rta);
    }
    
}

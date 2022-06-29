package volumen.models;

import java.util.Scanner;

public class LecturaDatos {
    static double radio;
    public static  void lecturaDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el radio de la esfera: ");
        radio = entrada.nextDouble();
        Operaciones.operaciones(radio);
    }

}

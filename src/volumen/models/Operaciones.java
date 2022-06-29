package volumen.models;

public class Operaciones {
    public static void operaciones(double radio){
        double resultado = (4.0/3)* Math.PI * Math.pow(radio, 3);
        Impresion.impresion(resultado);
    }
}

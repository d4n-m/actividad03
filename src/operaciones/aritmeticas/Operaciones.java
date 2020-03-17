package operaciones.aritmeticas;

public class Operaciones {
    public static void muestraLogaritmo(double num) {
/*
    desc: Muestra el logaritmo en base e del número double que recibimos como parámetro
    input: un número double
    output: void.
 */
        System.out.println("El logaritmo natural en base e del número " + num + " es: " + Math.log(num));
    }
    public static void calculaPotencia(double num1, double num2) {
/*
    desc: Muestra el resultado del calculo num1 elevado a la potencia num2
    input: dos números double: num1, num2.
    output: void.
 */
        System.out.println("El número " + num1 + " elevado a la potencia " + num2 + " es: " + Math.pow(num1,num2));
    }

}

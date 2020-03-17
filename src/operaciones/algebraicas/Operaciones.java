package operaciones.algebraicas;

public class Operaciones {
    public static void muestraRaizCuadrada(double num) {
/*
    desc: Simplemente muestra por pantalla la raíz cuadrada del número recibido como parámetro
    input: un número double: num.
    output: void.
 */
        System.out.println("La raíz cuadrada de " + num + " es: " + Math.sqrt(num));
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

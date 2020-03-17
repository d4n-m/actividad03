package operaciones;

public class Valores {
    public static void muestraPi() {
/*
    desc: Simplemente muestra el número Pi por pantalla
    input: void.
    output: void.
 */
        System.out.println("El valor del 'Pi' como dato primitivo double en Java es: " + Math.PI);
    }
    public static void muestraValorAleatorio(int numEntero) {
/*
    desc: Muestra un número aleatorio de zero al número entero que recibimos como parámetro
    input: número int
    output: void.
 */
        System.out.print("Un número aleatorio del 0 al " + numEntero + " es: ");
        System.out.println(0 + (int)(Math.random() * ((numEntero - 0) + 1)));
    }
}



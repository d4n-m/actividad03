package main;

import operaciones.algebraicas.Operaciones;

import java.util.Scanner;

import static actividad03.Ejercicio01.pideDouble;
import static actividad03.Ejercicio01.pideEntero;
import static operaciones.aritmeticas.Operaciones.calculaPotencia;
import static operaciones.aritmeticas.Operaciones.muestraLogaritmo;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInputMenuItem = 99;
        do {
            System.out.println("\nIndica la opción a realizar:"); // mostramos el menú
            System.out.println("1 - muestraPi");
            System.out.println("2 - muestraValorAleatorio");
            System.out.println("3 - muestraLogaritmo");
            System.out.println("4 - calculaPotencia");
            System.out.println("5 - muestraRaízCuadrada");
            System.out.println("6 - calculaPotencia");
            System.out.println("0 - Salir.\n");


            try {
                userInputMenuItem = pideEntero("Elige una opción: "); //para el menú
            } catch (Exception e) { //En caso de que se pongan letras por ejemplo
                System.out.println("El programa acepta sólo números.\n");
                sc.nextLine();
            }

            switch (userInputMenuItem) {
                case 0: // salir del programa
                    System.out.println("¡Hasta luego!");
                    break;
                case 1: // función muestraPi()
                    operaciones.Valores.muestraPi();
                    break;
                case 2: // función muestraValorAleatorio(pedimos un int que será el valor máximo del número aleatorio)
                    operaciones.Valores.muestraValorAleatorio(pideEntero("Dime el valor máximo del número aleatorio: "));
                    break;
                case 3: // función muestraLogaritmo(double que pedimos)
                    muestraLogaritmo(pideDouble("Número del cual mostrar el logaritmo: "));
                    break;
                case 4: // función calculaPotencia(double a otro double)
                    calculaPotencia((pideDouble("Elige el número: ")),(pideDouble("Elige la potencia: ")));
                    break;
                case 5: // función muestraRaízCuadrada()
                    Operaciones.muestraRaizCuadrada(pideDouble("Número de cual mostrar la raíz cuadrada: "));
                    break;
                case 6: // función calculaPotencia(double a otro double)
                    operaciones.algebraicas.Operaciones.calculaPotencia((pideDouble("Elige el número: ")),(pideDouble("Elige la potencia: ")));
                    break;
                default: // caso default para volver a mostrar el menu en caso de que el usuario eligiera una opción no válida
                    System.out.println("Elige una opción de 0 a 6.\n"); //
            }
        } while (userInputMenuItem != 0); // la opción 0 sale del programa
    }
}

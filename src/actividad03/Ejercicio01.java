package actividad03;

import java.util.Scanner;
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInputMenuItem = 99; //para el menú
        do {
            System.out.println("\nIndica la opción a realizar:"); // mostramos el menú
            System.out.println("1 - Calcula el mayor de 3 números.");
            System.out.println("2 - Calcula el día de la semana.");
            System.out.println("3 - Supera el 50.");
            System.out.println("0 - Salir.\n");


            try {
                userInputMenuItem = sc.nextInt(); //pedimos al usuario un case(opción)
            }
            catch (Exception e) { //En caso de que se pongan letras por ejemplo
                System.out.println("El programa acepta sólo números.\n");
                sc.nextLine();
            }

            switch (userInputMenuItem) {
                case 0: // salir del programa
                    System.out.println("¡Hasta luego!");
                    break;
                case 1: // función calculaMayor()
                    calculaMayor();
                    break;
                case 2: // función calculaDiaSemana()
                    calculaDiaSemana();
                    break;
                case 3: // función superaCincuenta()
                    superaCincuenta();
                    break;
                default: // caso default para volver a mostrar el menu en caso de que el usuario eligiera una opción no válida
                    System.out.println("Elige una opción de 0 a 3.\n"); //
            }
        } while (userInputMenuItem != 0) ; // la opción 0 sale del programa
    }

    /*
     *******************
     * FUNCIoNES
     *******************
                        */

    /*
    Desc: función que pide/valida/guarda un número entero
    Input: recibe un string que lo mostramos por pantalla
    Output: int numEntero
     */
    public static int pideEntero (String pregunta) {
        Scanner sc = new Scanner(System.in);
        int numEntero = 0;
        while (true) {
            try {
                System.out.print(pregunta);
                numEntero = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("El programa acepta sólo números.\n");
                sc.nextLine();
            }
        }
        return numEntero;
    }
    /*
    Desc: función que pide/valida/guarda un número double
    Input: recibe un string que lo mostramos por pantalla
    Output: double numDouble
    */
    public static double pideDouble (String pregunta) {
        Scanner sc = new Scanner(System.in);
        double numDouble = 0;
        while (true) {
            try {
                System.out.print(pregunta);
                numDouble = sc.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("El programa acepta sólo números.\n");
                sc.nextLine();
            }
        }
        return numDouble;
    }
    /*
    Desc: función que pide/valida/guarda 3 números double y los compara entre ellos para averiguar el mayor.
    Input: void.
    Output: void.
    */
    public static void calculaMayor() {
        double num1 = pideDouble("Dime el primer número: ");
        double num2 = pideDouble("Dime el segundo número: ");
        double num3 = pideDouble("Dime el tercer número: ");

        if(num1 > num2 && num1 > num3)
        {
            System.out.println("\n\tEl número mayor es: "+num1);
        }
        else if(num2 > num3)
        {
            System.out.println("\n\tEl número mayor es: "+num2);
        }
        else
        {
            System.out.println("\n\tEl número mayor es: "+num3);
        }

    }
    /*
    Desc: función que pide/valida/guarda un número int de 1 a 7 y luego, recorriendo un array nos muestra por pantalla el día de la semana equivalente.
    Input: void.
    Output: void.
    */
    public static void calculaDiaSemana() {
        int num = 0;
        do {
            num = pideEntero("Dime un número (de 1-7): ");
        }
        while ((num < 1) || (num > 7));

        String[] miArray = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};

        System.out.println("\n\t" + "El día " + num + " es: " + miArray[num-1]);
        System.out.println(" ");
    }
    /*
    Desc: función que pide 1 número double hasta que sea mayor de 50. Los intentos se suman en una variable-contador i
    Input: void.
    Output: void.
    */
    public static void superaCincuenta() {
        double numDouble = 0;
        int i = 0;
        do {
            numDouble = pideDouble("Dime un número decimal: ");
            i++;
        } while (numDouble < 50);

        System.out.println("\n\tEl número de intentos hasta ahora son: " + i + " \n\tEl último valor indicado es: " + numDouble);

    }
}




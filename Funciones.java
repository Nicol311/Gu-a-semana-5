import java.util.Scanner;
public class Funciones {

//=====Funciones para opcion 1: "Contar dígitos"=====//
    public static void contar_digitos_menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = entrada.nextInt();
        if (numero < 0) {
            System.out.println("Debe ingresar un número entero positivo!");
        } else {
            int cantidad_digitos = contar_recursivo(numero);
            System.out.println("\nEl número de dígitos es: " + cantidad_digitos);
            
        }
    }

    public static int contar_recursivo(int numero) {
        if (numero < 10) {
            return 1;
        }
        return 1 + contar_recursivo(numero / 10);
    }

//=====Funciones para opcion 2: "Suma de dígitos"=====//
    public static void sumar_digitos_menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = entrada.nextInt();
        if (numero < 0) {
            System.out.println("Debe ingresar un número entero positivo!");
        } else {
            int Suma_dedigitos = sumar_recursivo(numero);
            System.out.println("\nLa suma de los dígitos de su número es: " + Suma_dedigitos);
        }
    }
    public static int sumar_recursivo(int numero) {
        if (numero < 10) {
        return numero;
        } else {
        return numero % 10 + sumar_recursivo(numero / 10);
        }
    }

//=====Funciones para opcion 3: "Máximo común divisor (MCD)"=====//
    public static void mcd_menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = entrada.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = entrada.nextInt();

        if (a < 0 || b < 0) {
            System.out.println("Los números deben ser enteros positivos!");
        } else {
            int mcd = mcd_recursivo(a, b);
            System.out.println("\nEl máximo común divisor de los numeros ingresados es: " + mcd);
        }
    }

    public static int mcd_recursivo(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd_recursivo(b, a % b);
        }
    }

//=====Funciones para opcion 4: "Invertir una cadena"=====//   
    public static void invertir_cadena_menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = entrada.nextLine();

        if (cadena.isEmpty()) { // verificar si la cadena está vacía
            System.out.println("\nLa cadena ingresada está vacía!");
        } else {
            String cadena_invertida = invertir_recursivo(cadena);
            System.out.println("\nLa cadena invertida es: " + cadena_invertida);
        }
    }

    public static String invertir_recursivo(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return invertir_recursivo(str.substring(1)) + str.charAt(0);
    }
}
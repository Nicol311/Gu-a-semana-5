import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n===Menu===");
            System.out.println("1. Contar dígitos");
            System.out.println("2. Suma de dígitos");
            System.out.println("3. Máximo común divisor (MCD)");
            System.out.println("4. Invertir una cadena");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    Funciones.contar_digitos_menu();
                    break;
                case 2:
                    Funciones.sumar_digitos_menu();
                    break;
                case 3:
                    Funciones.mcd_menu();
                    break;
                case 4:
                    Funciones.invertir_cadena_menu();
                    break;
                case 5:
                    System.out.println("\nFin del programa!\n");
                    break;
                default:
                    System.out.println("\nOpción no válida!");
                    break;
            }
        } while (opcion != 5);
        entrada.close();
    }
}
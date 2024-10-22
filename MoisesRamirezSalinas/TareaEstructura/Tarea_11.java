import java.util.Scanner;

public class Tarea_11 {

    public static void main(String[] args) {
        // Declaración de un arreglo de 10 palabras
        String[] palabras = new String[10];

        // Llenar el arreglo pidiendo al usuario las palabras
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduce una palabra para la posición " + (i + 1) + ":");
            palabras[i] = sc.nextLine();
        }

        // Llamar a la función para imprimir todas las palabras del arreglo
        imprimirArreglo(palabras);

        sc.close();
    }

    // Función que itera sobre el arreglo y lo imprime
    public static void imprimirArreglo(String[] arreglo) {
        System.out.println("Las palabras en el arreglo son:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Palabra en la posición " + (i + 1) + ": " + arreglo[i]);
        }
    }
}
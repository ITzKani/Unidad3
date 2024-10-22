import java.util.Scanner;

public class Tarea_10 {

    public static void main(String[] args) {
        
        int[] numeros = new int[10];// Declaración de un arreglo de 10 números

        Scanner sc = new Scanner(System.in); // arreglo pidiendo al usuario los números
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número para la posición " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }

        imprimirArreglo(numeros); // función para imprimir todos los números del arreglo

        sc.close();
    }

    public static void imprimirArreglo(int[] arreglo) { // Función que itera sobre el arreglo y lo imprime
        System.out.println("Los números en el arreglo son:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Número en la posición " + (i + 1) + ": " + arreglo[i]);
        }
    }
}

import java.util.Scanner;

public class Tarea_12 {

    public static void main(String[] args) {
        // Pedir el nombre del usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String nombre = sc.nextLine();

        // Convertir el nombre a un arreglo de caracteres
        char[] caracteres = nombre.toCharArray();

        // Llamar a la función para imprimir cada carácter del arreglo
        imprimirCaracteres(caracteres);

        sc.close();
    }

    // Función que itera sobre el arreglo de caracteres y los imprime
    public static void imprimirCaracteres(char[] arreglo) {
        System.out.println("Los caracteres de tu nombre son:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Carácter en la posición " + (i + 1) + ": " + arreglo[i]);
        }
    }
}

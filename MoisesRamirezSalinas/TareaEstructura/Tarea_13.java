import java.util.Scanner;

public class Tarea_13{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Llamar a la función que solicita y valida el número mayor a 20
        int numeroValido = pedirNumeroMayorA20(sc);

        // Imprimir el número válido
        System.out.println("El número ingresado es: " + numeroValido);

        sc.close();
    }

    // Función que pide un número y valida que sea mayor a 20
    public static int pedirNumeroMayorA20(Scanner sc) {
        int numero;

        // Bucle que sigue pidiendo un número hasta que sea mayor a 20
        while (true) {
            System.out.println("Introduce un número mayor a 20:");
            numero = sc.nextInt();

            // Validar si el número es mayor a 20
            if (numero > 20) {
                return numero;  // Si el número es válido, se retorna
            } else {
                System.out.println("Error: el número debe ser mayor a 20. Inténtalo de nuevo.");
            }
        }
    }
}

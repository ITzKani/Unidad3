import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    public static void main(String[] args) {
        
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};// Se declaran los números
        Queue<Integer> cola = new LinkedList<>();// Se crea una cola para almacenar los números ingresados
        
        for (int numero : numeros) {// Añadir los números del arreglo a la cola
            cola.add(numero);
        }
        
        cola.add(11);// Agregar más elementos a la cola
        cola.add(12);// Agregar más elementos a la cola

        System.out.println("Último número de la cola: " + ((LinkedList<Integer>) cola).getLast());// Obtener el último número de la cola (convertir a LinkedList temporalmente)

        cola.poll(); // Eliminar el primer elemento de la cola (FIFO)
        
        System.out.println("Contenido de la cola después de eliminar el primer elemento: " + cola);// Mostrar el contenido de la cola después de eliminar

        System.out.println("¿La cola está vacía? " + cola.isEmpty()); // Verificar si la cola está vacía
    }
}


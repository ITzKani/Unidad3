import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Declarar un arreglo con 5 palabras
        String[] palabras = {"hola", "mundo", "java", "pila", "cola"};

        // Crear una pila
        Stack<String> miPila = new Stack<>();

        // Agregar las palabras del arreglo a la pila
        for (String palabra : palabras) {
            miPila.push(palabra);
        }

        // Agregar dos palabras nuevas a la pila
        miPila.push("nuevo");


        miPila.push("elemento");

        // Imprimir el último elemento de la pila antes de eliminarlo
        
        miPila.peek();

        // Eliminar el último elemento de la pila
        miPila.pop();

        System.out.println(miPila);

        // Verificar si la pila está vacía
        if (miPila.empty()) {
            System.out.println();
        } else {
            System.out.println("La pila NO está vacía.");
        }
    }
}

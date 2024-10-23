import java.util.Stack;

public class Prueba {
    public static void main(String[] args) {
        // Declarar un arreglo con 5 palabras
        String[] palabras = {"hola", "mundo", "java", "pila", "programación"};

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
        System.out.println("Último elemento de la pila antes de eliminar: " + miPila.peek());

        // Eliminar el último elemento de la pila
        String ultimoElemento = miPila.pop();

        // Imprimir el último elemento eliminado
        System.out.println("Último elemento eliminado de la pila: " + ultimoElemento);

        // Imprimir todos los elementos restantes en la pila
        System.out.println("Elementos restantes en la pila:");
        for (String elemento : miPila) {
            System.out.println(elemento);
        }

        // Verificar si la pila está vacía
        if (miPila.empty()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("La pila NO está vacía.");
        }
    }
}

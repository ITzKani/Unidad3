import java.util.Collections;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        Collections.addAll(pila, 1, 2, 3, 4, 5);
        
        System.out.println(pila); // Salida: [1, 2, 3, 4, 5]
    }
}

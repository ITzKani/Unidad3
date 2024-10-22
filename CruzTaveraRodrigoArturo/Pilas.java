import java.util.Stack;

class Pilas {
    public static void main(String[] args) {
        Stack<Character> pila = new Stack<Character>();  
        
        
        pila.push('r');
        pila.push('o');
        pila.push('d');
        pila.push('r');
        pila.push('i');
        pila.push('g');
        pila.push('o');
        System.out.println(pila.peek()); 
        pila.push('A');
        pila.push('r');
        pila.push('t');
        pila.push('u');
        pila.push('r');
        pila.push('o');
        System.out.println(pila.search('A')); 
        pila.push('C');
        pila.push('r');
        pila.push('u');
        pila.push('z');
        pila.pop();
        pila.pop();
        System.out.println(pila);  
        pila.push('T');
        pila.push('a');
        pila.push('v');
        pila.push('e');
        pila.push('r');
        pila.push('a');
        
        for (Character pilita : pila) {
            System.out.println(pilita);
        }
    }
}

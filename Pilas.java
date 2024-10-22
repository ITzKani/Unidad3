import java.util.Stack;

class Pilas {
    public static void main(String[] args) {
        Stack<Character> pila = new Stack<Character>();  
        
        
        pila.push('c');
        pila.push('h');
        pila.push('r');
        pila.push('i');
        pila.push('s');
        pila.push('t');
        pila.push('o');
        pila.push('p');
        pila.push('h');
        pila.push('e');
        pila.push('r');
        System.out.println(pila.peek()); 
        pila.push('r');
        pila.push('o');
        pila.push('d');
        pila.push('r');
        pila.push('i');
        pila.push('g');
        pila.push('u');
        pila.push('e');
        pila.push('z');
        System.out.println(pila.search('A')); 
        pila.push('s');
        pila.push('o');
        pila.push('t');
        pila.push('o');
        pila.pop();
        pila.pop();
        System.out.println(pila);  
       
        for (Character pilita : pila) {
            System.out.println(pilita);
        }
    }
}

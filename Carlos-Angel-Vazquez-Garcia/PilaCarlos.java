import java.util.Stack;
class PilaCarlos{
    public static void main (String[] args){
        Stack<Character> pila=new Stack<Character>();

        pila.push('C');
        pila.push('A');
        pila.push('R');
        pila.push('L');
        pila.push('O');
        pila.push('S');
        pila.push(' ');

        System.out.println(pila.peek());
 
        pila.push('A');
        pila.push('N');
        pila.push('G');
        pila.push('E');
        pila.push('L');
        pila.push(' ');

        System.out.println(pila.search('A'));

        pila.push('V');
        pila.push('A');
        pila.push('Z');
        pila.push('Q');
        pila.push('U');
        pila.push('E');
        pila.push('Z');

        pila.pop();
        pila.pop();

        pila.push(' ');
        pila.push('G');
        pila.push('A');
        pila.push('R');
        pila.push('C');
        pila.push('I');
        pila.push('A');
        pila.push(' ');

        for(Character pilita: pila){
            System.out.println(pilita);
        }

    }
}
import java.util.Stack;
class PilaPalabra{
    public static void main(String[] args){
        Stack<String> p= new Stack<>();
        String[] palabra={"Uno", "Dos", "Tres", "Cuatro", "Cinco"};
        for(String palabras : palabra){
            p.push(palabras);
        }
        p.push("Seis");
        p.push("Siete");
        System.out.println(p.peek());
        p.pop();
        System.out.println(p);
        System.out.println(p.isEmpty());
    }
}
import java.util.LinkedList;
import java.util.Queue;
class Cola{
    public static void main(String[] args) {
        //declarar variable
        String nombre = "rodrigo";
        //crear cola 
        Queue<String> c = new LinkedList<>();
        //iterar cola
        for(int i = 0; i <nombre.length(); i++){
            c.add(String.valueOf(nombre.charAt(i)));
        }
        System.out.println(c);
    }
}

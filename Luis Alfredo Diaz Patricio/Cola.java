import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Cola{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre");
        String nombre = sc.nextLine();
        sc.close();
        Queue<String> c = new LinkedList<>();
        for(int i = 0; i <nombre.length(); i++){
            c.add(String.valueOf(nombre.charAt(i)));
        }
        System.out.println(c);
    }
}
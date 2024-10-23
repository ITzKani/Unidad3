import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Cola{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre");//Agregamos el nombre
        String nombre = sc.nextLine();//Lo guardamos
        sc.close();//Se cierra el scanner
        Queue<String> c = new LinkedList<>();
        for(int i = 0; i <nombre.length(); i++){
            c.add(String.valueOf(nombre.charAt(i)));
        }
        System.out.println(c);
        
    }
}
//Pondre los comentarios aqui porque por alguna razon me marca error, pero esto itera la cola con el nombr3e que ingresemos
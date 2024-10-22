
import java.util.Scanner; 
public class Triangulo {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa base: ");
        int a = sc.nextInt();
        System.out.println("ingresa altura");
        int b = sc.nextInt();
        System.out.println("El area es: "+area(a, b));
    }
    public static int area(int a, int b){
        return a*b/2;
    }
}

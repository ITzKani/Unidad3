import java.util.Scanner;

/**
 * AreaRectanguloF
 */
public class AreaRectanguloF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la base: ");
        int b = sc.nextInt();
        System.out.println("Ingresa la altura: ");
        int a = sc.nextInt();
        System.out.println("El area del rectangulo es: "+area(b, a));
    }
    public static int area(int b, int a){
        return b*a;
    }
}
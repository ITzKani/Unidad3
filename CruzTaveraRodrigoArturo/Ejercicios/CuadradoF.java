import java.util.Scanner;

class CuadradoF{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un lado: ");
        int a = sc.nextInt();
        System.out.println("ingresa otro lado");
        int b = sc.nextInt();
        System.out.println("El area es: "+area(a, b));
    }
    public static int area(int a, int b){
        return a*b;
    }
}
import java.util.Scanner;

class SumaF{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int a = sc.nextInt();
        System.out.println("ingresa otro numero");
        int b = sc.nextInt();
        System.out.println("La suma es: "+sumar(a, b));
    }
    public static int sumar(int a, int b){
        return a+b;
    }
}
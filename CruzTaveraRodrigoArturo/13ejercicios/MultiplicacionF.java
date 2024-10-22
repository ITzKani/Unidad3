import java.util.Scanner;

class MultiplicacionF{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int a = sc.nextInt();
        System.out.println("ingresa otro numero");
        int b = sc.nextInt();
        System.out.println("El resultado es: "+multiplicar(a, b));
    }
    public static int multiplicar(int a, int b){
        return a*b;
    }
}
import java.util.Scanner;

class ModuloF{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int a = sc.nextInt();
        System.out.println("ingresa otro numero");
        int b = sc.nextInt();
        System.out.println("El resultado es: "+modular(a, b));
    }
    public static int modular(int a, int b){
        return a%b;
    }
}
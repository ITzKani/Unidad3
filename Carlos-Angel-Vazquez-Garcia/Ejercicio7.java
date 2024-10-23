import java.util.Scanner;
class Ejercicio7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        double numero = sc.nextDouble();
        System.out.println("Ingresa otro numero");
        double otroNumero = sc.nextDouble();
        double resultado = numero / otroNumero;
        System.out.println("Tu resultado es: " + resultado);
    }
}
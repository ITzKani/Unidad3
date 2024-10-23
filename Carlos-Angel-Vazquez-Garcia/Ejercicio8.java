import java.util.Scanner;
class Ejercicio8{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingresa un numero");
      int numero = sc.nextInt();
      System.out.println("Ingresa otro numero");
      int otroNumero = sc.nextInt();
      int resultado = numero % otroNumero;
      System.out.println("Tu resultado es: " + resultado);
   }
}
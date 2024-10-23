import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        int limite = sc.nextInt();
        int contador = 0;
        while (contador <= limite) {
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
            contador++;            
        }    
}
}
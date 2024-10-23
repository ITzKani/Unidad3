import java.util.Scanner;
class Ejercicio10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        int numero = sc.nextInt();
        cuentaSucesiva (numero);
    }
    public static void cuentaSucesiva(int numero){
        for (int i = 1; i <= numero; i++){
            System.out.println(i);
        }
    
    }
}
import java.util.Scanner;
class Ejercicio9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Dame tu edad");
        int edad = sc.nextInt();
        if (edad<18){
            System.out.println("Eres menor de edad");
        }
        else{
            System.out.println("Eres mayor de edad");
            
        }
    }
}
import java.util.Scanner;
class Ejercicio4{
    public static void main(String[] args) { /*declaramos la funcion main*/
        Scanner sc = new Scanner(System.in);    /*creamos un objeto de la clase Scanner*/
        System.out.println("Ingresa un numero"); /*imprimimos un mensaje*/
        int numero = sc.nextInt(); /*leemos un numero*/
        System.out.println("ingresa otro numero"); /*imprimimos otro mensaje*/
        int otroNumero = sc.nextInt(); /*leemos otro numero*/
        int resultado = numero + otroNumero; /*sumamos los numeros*/
        System.out.println("Tu resultado es: " + resultado); /*imprimimos el resultado*/
    }
}
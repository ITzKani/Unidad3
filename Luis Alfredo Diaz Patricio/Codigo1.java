import java.util.Scanner;
class Codigo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el primer numero para sumar");
        int a = sc.nextInt();
        System.out.println("Dame el segundo numero");
        int b = sc.nextInt();
        int c = suma(a,b);
        System.out.println("El resultado es " +c);
    }
    public static int suma(int a,int b){
        return a + b;
    }
}
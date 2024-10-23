import java.util.Scanner;
class Suma{
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime un numero");
        int a= sc.nextInt();
        System.out.println("Dame otro numero");
        int b= sc.nextInt();
        int r= sumaResultado(a, b);
        System.out.println("tu resultado es: " +r);
    }
    public static int sumaResultado(int y, int x){
        return x + y;
    }
}
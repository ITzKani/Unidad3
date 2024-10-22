import java.util.Scanner;
class Codigo8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la base del triangulo");
        int a = sc.nextInt();
        System.out.println("Dame su altura");
        int b = sc.nextInt();
        int c = baset(a,b);
        System.out.println("La area del triangulo es " + c); 
    }
    public static int baset(int a,int b){
        return a * b / 2;
    }
}
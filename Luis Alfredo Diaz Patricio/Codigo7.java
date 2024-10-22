import java.util.Scanner;
class Codigo7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el lado del cuadrado para su area");
        int a = sc.nextInt();
        int b = areac(a);
        System.out.println("El area del cuadrado es " + b);
    }
    public static int areac(int a){
        return a * a;
    }
}
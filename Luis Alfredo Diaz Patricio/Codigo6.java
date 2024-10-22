import java.util.Scanner;
class Codigo6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la base");
        int a = sc.nextInt();
        System.out.println("Dame la altura");
        int b = sc.nextInt();
        int c = arear(a,b);
        System.out.println("El area del rectangulo es " + c);
    }
    public static int arear(int a,int b){
        return a * b;
    }
}

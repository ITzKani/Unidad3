import java.util.Scanner;
class Codigo9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el perimetro");
        int a = sc.nextInt();
        System.out.println("Dame la apotema");
        int b = sc.nextInt();
        int c = poli(a,b);
        System.out.println("El area es " + c); 
    }
    public static int poli(int a,int b){
        return a * b / 2;
    }
}
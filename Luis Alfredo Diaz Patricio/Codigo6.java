import java.util.Scanner;
class Codigo6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la base");//Se pide la base
        int a = sc.nextInt();
        System.out.println("Dame la altura");//Se pide la altura
        int b = sc.nextInt();
        int c = arear(a,b);//Llamamos la funcion
        System.out.println("El area del rectangulo es " + c);//se impirme
    }
    public static int arear(int a,int b){//Esta es la funcion 
        return a * b;
    }
}

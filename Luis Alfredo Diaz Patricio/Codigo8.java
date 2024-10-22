import java.util.Scanner;
class Codigo8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la base del triangulo");//Se pide la base del triangulo
        int a = sc.nextInt();
        System.out.println("Dame su altura");//Se pide la altura
        int b = sc.nextInt();
        int c = baset(a,b);//Se llama a la funcion
        System.out.println("La area del triangulo es " + c);//Se imprime 
    }
    public static int baset(int a,int b){//Esta es la funcion fuera del main 
        return a * b / 2;
    }
}
import java.util.Scanner;
class Codigo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el primer numero para sumar");//Se pide el primer numero
        int a = sc.nextInt();//Se guarda
        System.out.println("Dame el segundo numero");//Pedimos el segundo numero
        int b = sc.nextInt();//se guarda el segundo
        int c = suma(a,b);//Se llama a la funcion
        System.out.println("El resultado es " +c);//Se imprime
    }
    public static int suma(int a,int b){//Esta es la funcion que siempre esta fuera del metodo main
        return a + b;
    }
}
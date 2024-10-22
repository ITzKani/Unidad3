import java.util.Scanner;
class Codigo7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el lado del cuadrado para su area");//Se pide el lado 
        int a = sc.nextInt();//Se guarda
        int b = areac(a);//Llamamos a la funcion
        System.out.println("El area del cuadrado es " + b);//Se imprime
    }
    public static int areac(int a){//Esta es la funcion
        return a * a;
    }
}
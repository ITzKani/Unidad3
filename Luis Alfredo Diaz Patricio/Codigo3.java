import java.util.Scanner;
class Codigo3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el primer numero para la multiplicacion");//Se pide el primer numero
        int a = sc.nextInt();
        System.out.println("Dame el segundo numero");//Se pide le segundo numero
        int b = sc.nextInt();
        int c = multi(a,b);//Se llama a la funcion
        System.out.println("El resultado es " +c);
    }
    public static int multi(int a,int b){//Se hace la funcion
        return a * b;
    }
}
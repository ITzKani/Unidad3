import java.util.Scanner;
class CuentaRegresiva{
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime un numero");
        int a= sc.nextInt();
        cuentaRegresiva(a);
    }
    public static void cuentaRegresiva(int x){
        if (x<0){
            System.out.println("KBOOOM!!!");
            return;
        }
        System.out.println(x);
        cuentaRegresiva(--x);
    }
}
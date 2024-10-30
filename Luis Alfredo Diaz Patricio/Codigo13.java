import java.util.Scanner;
class Codigo13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Puedes darme un numero");//Pedimos el primer numero
        int a = sc.nextInt();
        regreso(a,sc);//Se llama a la funcion
    }
    public static void regreso(int a,Scanner sc){//La funcion de nuevo
        do {//En esta usamos do-while para que se repita el bloque
            if(a>=20){//Nuestra condicion
                System.out.println("Es mayor");
                return;
            }
            System.out.println("Error dame otro numero");
            a = sc.nextInt();
        } while (a<20);//Si no se cumple para que se repita jeje
    }
}//Quiero irme a casa forest
import java.util.Scanner;
public class Tarea_6 { 
    public static void main(String[] args) {// metodo main
    Scanner sc= new Scanner(System.in);// metodo Scanner
    System.out.println("Introduce la base de tu rectangulo");// pide el primer valor
    int a = sc.nextInt();//se guarda el primer valor
    System.out.println("Introduce la altura de tu rectangulo");// pide el segundo valor
    int b = sc.nextInt();//se guarda el segundo valor

    int resultado = area (a,b);// variable donde se guarda la funcion
    System.out.println("el area de tu rectangulo es:" + resultado);//Se imprime tu resultado
    sc.close(); 
}
public static int area(int a, int b){
    return (a * b)/2;// se realiza la funcion de tu formula del area afuera del metodo main
}
} 

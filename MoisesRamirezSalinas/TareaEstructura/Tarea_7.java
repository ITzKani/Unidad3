import java.util.Scanner;
public class Tarea_7 { 
    public static void main(String[] args) {// metodo main
    Scanner sc= new Scanner(System.in);// metodo Scanner
    System.out.println("Introduce la base de tu rectangulo");// pide la base
    double lado = sc.nextDouble();//se guarda el valor

    double area = cuadrado(lado);// variable donde se guarda la funcion
    System.out.println("el area es:" +area);//Se imprime tu resultado
    sc.close(); 
}
public static double cuadrado(double a){
    return a * a;// se realiza la funcion de tu formula del area afuera del metodo main
}
} 

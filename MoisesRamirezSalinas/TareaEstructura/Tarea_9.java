import java.util.Scanner;
public class Tarea_9 { 
    public static void main(String[] args) {// metodo main
    Scanner sc= new Scanner(System.in);// metodo Scanner
    System.out.println("Introduce perimetro");// pide el primer valor
    int a = sc.nextInt();//se guarda el primer valor
    System.out.println("Introduce tu apotema");// pide el segundo valor
    double b = sc.nextDouble();//se guarda el segundo valor

    double resultado = Area (a,b);// variable donde se guarda la funcion
    System.out.println("la suma de tus valores es:" + resultado);//Se imprime tu resultado
    sc.close(); 
}
public static double Area(int a, double b){
    return (a * b)/2;} // se realiza la formula de un poligono fuera del metodo main
}

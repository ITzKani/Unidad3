import java.util.Scanner;
public class Tarea_2 { 
    public static void main(String[] args) {// metodo main
    Scanner sc= new Scanner(System.in);// metodo Scanner
    System.out.println("Introduce tu primer valor");// pide el primer valor
    int a = sc.nextInt();//se guarda el primer valor
    System.out.println("Introduce tu segundo valor");// pide el segundo valor
    int b = sc.nextInt();//se guarda el segundo valor

    int resultado = resta (a,b);// variable donde se guarda la funcion
    System.out.println("la suma de tus valores es:" + resultado);//Se imprime tu resultado
    sc.close(); 
}
public static int resta(int a, int b){
    return a - b;} // se realiza la funcion de Resta afuera del metodo main
}

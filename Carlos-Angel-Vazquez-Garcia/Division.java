import java.util.Scanner;
class Division{
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime un numero");
        double a= sc.nextDouble();
        System.out.println("Dame otro numero");
        double b= sc.nextDouble();
        double r= divisionResultado(a, b);
        System.out.println("tu resultado es: " +r);
    }
    public static double divisionResultado(double x, double y){
        return x/y;
    }
}
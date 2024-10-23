import java.util.Scanner;
class Arreglos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int[]numero = {1,2,3,4,5,6,7,8,9,10};
        arreglo(numero);
       
    }
    public static void arreglo(int[]numero){
        for (int i = 1; i <= numero.length; i++){
            System.out.println(numero[i]);
        }
    
    }
}
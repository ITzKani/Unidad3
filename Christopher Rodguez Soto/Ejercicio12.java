import java.util.Scanner;
    class Ejercicio12{
        public static void main (String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("Introduce el limite");
            int limite = sc.nextInt();
            int contador = 1;
            do{
                System.out.println("contador: " + contador);
                contador++;
            }
            while(contador<=limite);
    }
}
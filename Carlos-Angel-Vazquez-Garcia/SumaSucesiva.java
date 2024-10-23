import java.util.Scanner;
    class SumaSucesiva{
        public static void main (String[] args){
            Scanner sc= new Scanner(System.in);
            while(true){
            System.out.println("Ingresa los 2 numeros ");
            int a= sc.nextInt(),b= sc.nextInt();
            int res = sumaSucesiva(a, b);
            System.out.println("La suma sucesiva de " + a + " y " + b + " es: " + res);
        }
    }
    public static int sumaSucesiva(int a, int b){
        int r=0;
            for(int i=0; i<a; i++){
            r += b;
        }
      return r;
    }
}
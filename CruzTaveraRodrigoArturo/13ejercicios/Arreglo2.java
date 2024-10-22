import java.util.Scanner;
class Arreglo2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //declarar arreglo
       String[]palabras={"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez"};
       //llamar funcion 
        arreglo(palabras);
       
    }
    //hacer funcion
    public static void arreglo(String[]palabras){
        //iterar arreglo
        for (int i = 1; i <= palabras.length; i++){
            System.out.println(palabras[i]);
        }
    
    }
}
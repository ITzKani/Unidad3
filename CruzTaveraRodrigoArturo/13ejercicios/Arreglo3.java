import java.util.Scanner;
class Arreglo3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //declarar arreglo
       char[]palabras={'R','O','D','R','I','G','O',};
       //llamar funcion 
        arreglo(palabras);
       
    }
    //hacer funcion
    public static void arreglo(char[]palabras){
        //iterar arreglo
        for (int i = 1; i <= palabras.length; i++){
            System.out.println(palabras[i]);
        }
    
    }
}
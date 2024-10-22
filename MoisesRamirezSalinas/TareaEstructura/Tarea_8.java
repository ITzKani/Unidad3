 import java.util.Random;// genera numeros aleatoriamente
import java.util.Scanner;

public class Tarea_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();//metodo random

      
        int base = Base(sc);// Pedir base al usuario

        int altura = random.nextInt(100); // Generar altura aleatoria
        
        int area = Area(base, altura);// Calcula área a través de la función

        
        Resultados(base, altura, area);// Muestra resultados

        sc.close();
    }

   
    public static int Base(Scanner sc) {
        System.out.println("Introduce el valor de la base del triángulo:"); // Función para pedir la base
        return sc.nextInt();
    }

    
    public static int Area(int base, int altura) {// Función para calcular el área del triángulo
        return (base * altura) / 2;
    }

    
    public static void Resultados(int base, int altura, int area) {// Función para mostrar los resultados
        System.out.println("El área del triángulo es: " + area);// muestra el area
        System.out.println("La altura generada aleatoriamente es: " + altura);//muesta la altura generada
    }
}


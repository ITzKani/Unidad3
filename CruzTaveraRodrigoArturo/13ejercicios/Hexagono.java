import java.util.Scanner; 

public class Hexagono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el lado: ");
        int l = sc.nextInt();
        System.out.println("ingresa el apotema");
        int a = sc.nextInt();
        System.out.println("El area es: "+area(l,a));
    }
    public static int area(int l, int a){
        return l*6*a/2;
    }
}


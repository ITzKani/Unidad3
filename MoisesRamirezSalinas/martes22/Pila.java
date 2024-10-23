import java.util.Stack;//libreria para pilas
public class Pila {// clase pila
public static void main(String[] args) {//metodo main
    String[] palabras={"perro","gato","oso","pajaro","rana"};// se declaran las variables
Stack<String> miPila = new Stack<>();//se crea una pila
for (String palabra:palabras) {//se agregan las palabras la pila
miPila.push(palabra);// se agraga el arreglo iterado a la fila
}//cierra el for
miPila.push("zorro");//se agrega la palabra zorro
miPila.push("carro");//se agrega la palabra carro
System.out.println(miPila.peek());//se muestra el ultimo valor
miPila.pop();//se borr el ultimo elemento
System.out.println(miPila);//imprime toda la pila
System.out.println(miPila.empty());//verifiva si la pila esta vacia
}//cierra el main
}//cierra la clase
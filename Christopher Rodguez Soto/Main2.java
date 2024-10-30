import java.util.LinkedList;
import java.util.Queue;
public class Main2{
    public static void main(String[] args) {
        Persona p1=new Persona("Dagan", "Vega", 20);
        Persona p2=new Persona("Christopher", "Rodriguez",20);
        Persona p3=new Persona("Moises", "Ramirez",20);
        Persona p4=new Persona("Carlos", "Vazquez",26);
        Persona p5=new Persona("Alfredo", "Diaz",25);
        Queue<Persona> c = new LinkedList<>();
        c.add(p1); c.add(p2); c.add(p3); c.add(p4); c.add(p5);
        for(Persona p: c){
            System.out.println(p.nombre +""+ p.apellido +""+ p.edad);
        }
}
}
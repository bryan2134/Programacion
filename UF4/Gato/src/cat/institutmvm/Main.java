
package cat.institutmvm;
import cat.institutmvm.utils.Caracteristicas;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Caracteristicas cat = new Caracteristicas("firulais" , 2 , "Bengalí" , "Pescado");
        System.out.println("Nombre: " + cat.getNombre() + "\n" + "Edad: " + cat.getEdad() + "años "+ "\n" + "Raza: " + cat.getRaza() + "\n" + "Comida favorita: " + cat.getComida());
        System.out.println("\n" + "\t" + "Acciones");
        cat.acciones();
    }
    
}

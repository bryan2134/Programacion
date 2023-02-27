package cat.institumvm;
import cat.institutmvm.utils.Persona;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nom = sc.nextLine();
        System.out.println("Introduce tu pellido:");
        String apellido = sc.nextLine();
        Persona datos = new Persona(nom, apellido);
        System.out.println("Nombre: " + datos.getNom());
        System.out.println("apellido: " + datos.getApellido());
        
    }
    
}

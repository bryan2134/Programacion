package cat.insitutmvm;

import cat.instutmvm.utils.Carta;
import cat.instutmvm.utils.Luz;
import cat.instutmvm.utils.Vuelo;
import java.util.Scanner;

public class Controlador {

    public static void main(String[] args) {
        Carta datos = new Carta("Bryan  ", "Jose  ", "Buenos dias!!");
        Luz info = new Luz(60, "amarillo");
        Vuelo dato = new Vuelo("Barcelona", "Japon", 10);
        System.out.println("\t" + "Carta");
        datos.getCarta();
        System.out.println("\n" + "\t" + "Luz");
        System.out.println("Intesidad: " + info.getIntensidad() + "  Color: " + info.getColor());
        System.out.println("\n" + "\t" + "Vuelo");
        System.out.println("Origen: " + dato.getOrigen() + "\n" + "Destino: " + dato.getDestino() +  "\n" +"Tiempo: " + dato.getDuracion() + "h");
    
    }
}

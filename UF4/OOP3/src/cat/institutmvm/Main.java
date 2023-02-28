package cat.institutmvm;
/**
 * @author Bryan Escalante
 * @version 1.0 28 FEB 2023
 */

import cat.institutmvm.utils.Carta;
import cat.institutmvm.utils.Luz;
import cat.institutmvm.utils.Vuelo;
import java.util.Scanner;


/**
 * Este programa me muestra las caracteristicas de carta, luz y vuelo
 * @param Main
 */
public class Main {

    public static void main(String[] args) {

        Carta datos = new Carta("Bryan  ", "Jose  ", "Buenos dias!!");
        Luz info = new Luz(60, "amarillo");
        Vuelo dato = new Vuelo("Barcelona", "Japón", 10);
        System.out.println("\t" + "Carta");
        datos.getCarta();
        System.out.println("\n" + "\t" + "Luz");
        System.out.println("Intensidad: " + info.getIntensidad() + "  Color: " + info.getColor());
        System.out.println("\n" + "\t" + "Vuelo");
        System.out.println("Origen: " + dato.getOrigen() + "\n" + "Destino: " + dato.getDestino() + "\n" + "Tiempo: " + dato.getDuracion() + "h");

    }
}

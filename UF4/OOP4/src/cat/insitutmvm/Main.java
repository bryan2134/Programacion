
package cat.insitutmvm;
import cat.institutmvm.utils.Bicicletas;


public class Main {

    public static void main(String[] args) {
        Bicicletas bici = new Bicicletas("MTB", "Aluminio", 18, 11, 375);
        System.out.println("Modelo: " + bici.getTipo() + "\n" + "Material: " + bici.getMaterial());
        System.out.println("Tamaño de la rueda: " + bici.getMide() +  " pulgadas" + "\n" + "Velocidades: " + bici.getVelocidad() + " Velocidades" + "\n" +"Precio: " + bici.getPrecio() + "$");
        
        Bicicletas modelo = new Bicicletas("Cannodale", "Aluminio", 27, 10, 299);
        System.out.println("\n" +"Modelo: " + modelo.getTipo() + "\n" + "Material: " + modelo.getMaterial());
        System.out.println("Tamaño de la rueda: " + modelo.getMide() +  " pulgadas" + "\n" + "Velocidades: " + modelo.getVelocidad() + " Veñocidades"+ "\n" +"Precio: " + modelo.getPrecio() + "$");
        
        Bicicletas modelo1 = new Bicicletas("Atala", "Aluminio", 27, 14, 390);
        System.out.println("\n" + "Modelo: " + modelo1.getTipo() + "\n" + "Material: " + modelo1.getMaterial());
        System.out.println("Tamaño de la rueda: " + modelo1.getMide() +  " pulgadas" + "\n" + "Velocidades: " + modelo1.getVelocidad() + " Velocidades"+ "\n" +"Precio: " + modelo1.getPrecio() + "$");
    }
    
}

package cat.institutmvm;

import cat.institutmvm.Metodos;
import java.util.Scanner;
import java.lang.Math;

public class Optica {

    private static final String MSG_1 = "Id: ";
    private static final String MSG_2 = "Edad: ";
    private static final String MSG_3 = "0.venta libre: ";
    private static final String MSG_4 = "1.pensionista: ";
    private static final String MSG_5 = "2.carne jova: ";
    private static final String MSG_6 = "3.socio: ";
    private static final String MSG_7 = "Tipo: ";
    private static final String MSG_8 = "Importe de la compra?: ";
    private static final String MSG_9 = "Teléfono de contacto(9 números): ";
    private static final String MSG_10 = "Error de datos ";
    private static final String MSG_11 = "Programa finalizado por error de datos";
    private static final String MSG_12 = "Cuántos clientes quieres introducir?";
    private static final String MSG_13 = "¿Qué tipo de cliente? ";
    private static final String MSG_14 = "¿Quiere consultr el tipo de cliente?(si:1/ no:0) ";
    private static final String MSG_15 = "Quieres un resumen estadistico de los datos? (si: 1/ no:0)";
    private static final String MSG_16 = "Numeros de clientes Introducidos: ";
    private static final String MSG_17 = "Media de la edad: ";
    private static final String MSG_18 = "Números de clientes por tipo: ";
    private static final String MSG_19 = "Histograma  de número de clientes por tipos: ";
    private static final String MSG_20 = "Importe total acomulado: ";
    private static final String MSG_21 = "Quieres ejecutar el sorteo?(si:1/no:0)";
    private static final String MSG_22 = "Ha ganado el cliente con la id";

    public static void main(String[] args) {
        int tipoClient = 0, num, num1, canvio = 0, count = 0, countt = 0, total = 0;
        int Client, media = 0, libre = 0, pensionista = 0, joven = 0, socio = 0;
        boolean correcto;
        Scanner sc = new Scanner(System.in);
        Metodos met = new Metodos();
        System.out.println(MSG_12);
        Client = sc.nextInt();
        int[] id = new int[Client];
        int[] edad = new int[Client];
        int[] opcion = new int[Client];
        String[] tipo = new String[Client];
        int[] importe = new int[Client];
        int[] telefono = new int[Client];
        int[] sorteo = new int[Client];
        String[] histo = new String[Client];
        String pri = " ", segun = "", tercer = "", cuarto = "";
        for (int i = 0; i < Client; i++) {//contador para poder guardar los datos 
            System.out.println("\n" + "Cliente " + i + ":" + "\n");
            id[i] = met.Registro(sc, MSG_10, MSG_1, 111, 999);//Metodo para pedir la id con condiciones
                edad[i] = met.Registro(sc, MSG_10, MSG_2, 14, 120);
                //Tercer caso de condición elegir una de las 3 opciones
                do {//Solo tiene 3 oportunidades o las restantes que le falte
                    System.out.print(MSG_7);
                    correcto = sc.hasNextInt();
                    if (correcto) {//comprobar el tipo de variable 
                        opcion[i] = sc.nextInt();
                        if ((opcion[i] < 0) || (opcion[i] > 3)) {
                            System.out.println(MSG_10);
                            correcto = false;
                            count++;
                        }
                        switch (opcion[i]) {
                            case 0:
                                tipo[i] = "Libre";//Lo guardo en una string 
                                break;
                            case 1:
                                tipo[i] = "pensionista";
                                break;
                            case 2:
                                tipo[i] = "c.jova";
                                break;
                            case 3:
                                tipo[i] = "socio";
                                break;
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_10);
                        count++;
                    }

                } while ((!correcto) && (count < 3));
                //Cuarta condición de mi variable que es importe en un metodo 
                importe[i] = met.Registro(sc, MSG_10, MSG_8, 0, 1000);
                //Condiciones de la última variable
                telefono[i] = met.Registro(sc, MSG_10, MSG_9, 111111111, 999999999);//la pase a un metodo
                sorteo[i] = (int) (Math.random() * 5000);//genero un numero aleatorio a cada cliente para el sorteo
        }
        System.out.println("\n" + "Id " + "Edad " + "tipos " + "importe " + "  telefono " + "   numero sorteo");
        for (int i = 0; i < Client; i++) { //Printo los datos guardados 
            System.out.println(id[i] + " " + edad[i] + "  " + tipo[i] + "  " + importe[i] + "     " + telefono[i] + "     " + sorteo[i]);
        }
        System.out.println("Se han introducido " + Client + " registros de clientes" + "\n");
        met.Recursividad(edad, id, opcion, importe, telefono, sorteo, 1, 0);//Un metodo pra ordenar de menor a mayor mis datos 
        System.out.print(MSG_14);
        num = sc.nextInt();
        if (num == 1) {//Si elije la opcion de si me printa los datos en pantalla
            System.out.print(MSG_13);
            tipoClient = sc.nextInt();
            System.out.println("\n" + "Id " + "Edad " + "tipos " + "importe " + "  telefono " + "   numero sorteo");
            for (int i = 0; i < opcion.length; i++) {//Muestro los datos de menor a mayor
                if (opcion[i] == tipoClient) {//El tipo de cliente que quiere que muestre los datos
                    System.out.println(id[i] + " "
                            + edad[i] + "  " + tipo[i] + "  " + importe[i] + "     " + telefono[i] + "     " + sorteo[i] + "\n");
                }
            }
            System.out.print(MSG_15);
            num1 = sc.nextInt();
            if (num1 == 1) {//Si quiere que le muestre un resumen de las estadisticas
                System.out.println("\n" + MSG_16 + Client);
                for (int i = 0; i < edad.length; i++) {//Para hacer la media de la edad
                    media = media + edad[i];
                }
                System.out.println(MSG_17 + media / Client);
                System.out.println(MSG_18);
                for (int i = 0; i < tipo.length; i++) {//Un contador para recorrer todos lo datos guardados del tipo
                    if (opcion[i] == 0) {//Condiciones par mostrar solo los registros de tipo que tengo
                        libre = libre + 1;
                    }
                    if (opcion[i] == 1) {
                        pensionista = pensionista + 1;
                    }
                    if (opcion[i] == 2) {
                        joven = joven + 1;
                    }
                    if (opcion[i] == 3) {
                        socio = socio + 1;
                    }
                }
                if (libre != 0) {//Muestro en pantalla los tipos que tengo de tipo entero  
                    System.out.println("\t" + "libre: " + libre);
                }
                if (pensionista != 0) {
                    System.out.println("\t" + "pensionista: " + pensionista);
                }
                if (joven != 0) {
                    System.out.println("\t" + "c.jova: " + joven);
                }
                if (socio != 0) {
                    System.out.println("\t" + "socio: " + socio);
                }
                met.Histograma(MSG_19, libre, pensionista, joven, socio);//Metodo de mi histograma
                for (int i = 0; i < importe.length; i++) {//Para hacer la media 
                    total = total + importe[i];
                }
                System.out.println("\n" + MSG_20 + total + "$");
                met.Sorteo(MSG_21, MSG_22, sc, sorteo, id);//Un metodo para saber el numero ganador  de sorteo 
            } else if (num1 == 0) {//Condicion de si no quiere que le muestre las estdisticas le pregunte si quiere hacer e sorteo
                met.Sorteo(MSG_21, MSG_22, sc, sorteo, id);//Un metodo para saber el numero ganador del sorteo 
            }
        }
    }
}



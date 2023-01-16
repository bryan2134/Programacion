package cat.institutmvm;

import java.util.Scanner;

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
    
    public static void main(String[] args) {
        int tipoClient = 0, num, num1, canvio = 0, count = 0, countt = 0, total=0;
        int Client, media = 0, libre = 0, pensionista = 0, joven = 0, socio = 0;
        boolean correcto;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_12);
        Client = sc.nextInt();
        int[] id = new int[Client];
        int[] edad = new int[Client];
        int[] opcion = new int[Client];
        String[] tipo = new String[Client];
        int[] importe = new int[Client];
        int[] telefono = new int[Client];
        String[] histo = new String[Client];
        String pri = " ", segun = "", tercer = "", cuarto = "";
        for (int i = 0; i < Client; i++) {//contador para poder guardar los datos 
            System.out.println("\n" + "Cliente " + i + ":" + "\n");
            do {//Condición para que solo tenga 3 oportunidades
                System.out.print(MSG_1);
                correcto = sc.hasNextInt();
                if (correcto) {//Para comprobar el tipo de dato no sea diferente al que se pide(numero)
                    id[i] = sc.nextInt();
                    if ((id[i] < 111) || (id[i] > 999)) {//Condicion de error 
                        System.out.println(MSG_10);
                        correcto = false;
                        count++;
                    }
                } else {
                    sc.next();//Para guardar el valor erróneo
                    System.out.println(MSG_10);
                    count++;
                }
            } while ((!correcto) && (count < 3));
            do {//Segunda condición de mi variable de 3 oportunidades
                System.out.print(MSG_2);
                correcto = sc.hasNextInt();
                if (correcto) {//Comprobar el tipo de dato 
                    edad[i] = sc.nextInt();
                    if ((edad[i] < 14) || (edad[i] > 120)) {//Condicion de mi variable 
                        System.out.println(MSG_10);
                        correcto = false;
                        count++;
                    }
                } else {
                    sc.next();
                    System.out.println(MSG_10);
                    count++;
                }

            } while ((!correcto) && (count < 3));

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

            //Cuarta condición de mi variable que es importe 
            do {//Condición para que solo tenga 3 oportunidades
                System.out.print(MSG_8);
                correcto = sc.hasNextInt();
                if (correcto) {//Para comprobar el tipo de dato 
                    importe[i] = sc.nextInt();
                    if ((importe[i] < 0) || (importe[i] > 1000)) {//Condición de limite 
                        System.out.println(MSG_10);
                        correcto = false;
                        count++;
                    }
                } else {
                    sc.next();//Para guardar el valor erróneo
                    System.out.println(MSG_10);
                    count++;
                }
            } while ((!correcto) && (count < 3));
            //Condiciones de la última variable
            do {//Condición para que solo tenga 3 oportunidades
                System.out.print(MSG_9);
                correcto = sc.hasNextInt();
                if (correcto) {//Para comprobar el tipo de dato no sea diferente al que se pide(numero)
                    telefono[i] = sc.nextInt();
                    if ((telefono[i] < 111111111) || (telefono[i] > 999999999)) {//Condicion de error 
                        System.out.println(MSG_10);
                        correcto = false;
                        count++;
                    }
                } else {
                    sc.next();//Para guardar el valor erróneo
                    System.out.println(MSG_10);
                    count++;
                }

            } while ((!correcto) && (count < 3));
        }

        System.out.println("\n" + "Id " + "Edad " + "tipos " + "importe " + "telefono ");
        for (int i = 0; i < Client; i++) { //Printo los datos guardados 
            System.out.println(id[i] + " " + edad[i] + "  " + tipo[i] + "  " + importe[i] + "     " + telefono[i]);
        }
        System.out.println("Se han introducido " + Client + " registros de clientes" + "\n");
        for (int i = 0; i < edad.length - 1; i++) {//Para comenzar por la primera posicion
            for (int j = i + 1; j < edad.length; j++) {
                if (edad[i] > edad[j]) {//Para cambiar posciones de menor a mayor

                    canvio = id[i];
                    id[i] = id[j];
                    id[j] = canvio;

                    canvio = edad[i];
                    edad[i] = edad[j];
                    edad[j] = canvio;

                    canvio = opcion[i];
                    opcion[i] = opcion[j];
                    opcion[j] = canvio;

                    canvio = importe[i];
                    importe[i] = importe[j];
                    importe[j] = canvio;

                    canvio = telefono[i];
                    telefono[i] = telefono[j];
                    telefono[j] = canvio;
                }
            }
        }
        System.out.print(MSG_14);
        num = sc.nextInt();
        if (num == 1) {//Si elije la opcion de si me printa los datos en pantalla
            System.out.print(MSG_13);
            tipoClient = sc.nextInt();
            System.out.println("\n" + "Id " + "Edad " + "tipos " + "importe " + "telefono ");
            for (int i = 0; i < opcion.length; i++) {//Muestro los datos de menor a mayor
                if (opcion[i] == tipoClient) {//El tipo de cliente que quiere que muestre los datos
                    System.out.println(id[i] + " "
                            + edad[i] + "  " + tipo[i] + "  " + importe[i] + "     " + telefono[i] + "\n");
                }
            }
            System.out.print(MSG_15);
            num1 = sc.nextInt();
            if (num == 1) {//Si quiere que le muestre un resumen de las estadisticas
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
                if (libre != 0) {//Muestro en pantalla los tipos que tengo  
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
            }
            System.out.println("\n" + MSG_19 + "\n");
            System.out.println("-------------------------------------" + "\n");

            if (libre != 0) {//Histograma solo se muestra si tiene algun dato
                System.out.print("\t" + "libre: ");
                for (int i = 0; i < libre; i++) {//para mostrar asteriscos
                    System.out.print("* ");
                }
                
            }
            if (pensionista != 0) {
                System.out.print("\n" + "\t" + "pensionista: ");
                for (int i = 0; i < pensionista; i++) {
                    System.out.print("* ");
                }
                
            }
            if (joven != 0) {
                System.out.print("\n" + "\t" + "joven: ");
                for (int i = 0; i < joven; i++) {
                    System.out.print("* ");
                }
                
            }
            if (socio != 0) {
                System.out.print("\n" + "\t" + "socio: ");
                for (int i = 0; i < socio; i++) {
                    System.out.print("* ");
                }
                
            }
            for(int i=0; i<importe.length;i++){//Para hacer la media 
                total = total + importe[i];
            }
            System.out.println("\n" + MSG_20 + total+"$");
        }
        
    }
}


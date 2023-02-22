package cat.institutmvm;

import java.util.Scanner;

public class Metodos {

    public int Registro(Scanner sc, String MSG_10, String MSG, int min, int max) {
        int count = 0;
        boolean correcto;
        int datos;
        do {//Condición para que solo tenga 3 oportunidades
            System.out.print(MSG);
            correcto = sc.hasNextInt();
            if (correcto) {//Para comprobar el tipo de dato no sea diferente al que se pide(numero)
                datos = sc.nextInt();
                if ((datos < min) || (datos > max)) {//Condicion de error 
                    System.out.println(MSG_10);
                    correcto = false;
                    count++;
                }else{
                return datos;
                }
            } else {
                sc.next();//Para guardar el valor erróneo
                System.out.println(MSG_10);
                count++;
            }
        } while ((!correcto) && (count < 3));
        return count;
    }

    public void Recursividad(int[] edad, int[] id, int[] opcion, int[] importe, int[] telefono, int[] sorteo, int j, int i) {
        if (i < edad.length - 1) {//Para comenzar por la primera posicion
            if (j < edad.length) {
                if (edad[i] > edad[j]) {//Para cambiar posciones de menor a mayor
                    int canvio = id[i];
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

                    canvio = sorteo[i];
                    sorteo[i] = sorteo[j];
                    sorteo[j] = canvio;

                }
                Recursividad(edad, id, opcion, importe, telefono, sorteo, j + 1, i + 1);
            } else {
                j = 0;
                Recursividad(edad, id, opcion, importe, telefono, sorteo, j, i + 1);
            }
        }
    }

    public void Sorteo(String MSG, String MSG_1, Scanner sc, int[] sorteo, int[] id) {
        System.out.println(MSG);
        int num3 = sc.nextInt();
        if (num3 == 1) {
            int premio = (int) (Math.random() * 5000);
            System.out.println("El número ganador es " + premio);
            for (int i = 0; i < sorteo.length; i++) {
                if (premio == sorteo[i]) {
                    System.out.println(MSG_1 + id[i]);
                }
            }
            System.out.println("No hay ganador");
        }
    }

    public void Histograma(String MSG, int libre, int pensionista, int joven, int socio) {
        System.out.println("\n" + MSG + "\n");
        System.out.print("-------------------------------------" + "\n");
        if (libre != 0) {//Histograma solo se muestra si tiene algun dato
            System.out.print("\t" + "libre: ");
            for (int i = 0; i < libre; i++) {//cuenta cuantas veces tiene el tipo de dato y lo muestra con asteriscos
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
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;
//A partir d’un nombre comprès entre 1 i 12, el programa cal que retorni el nom del mes. En cas de que el nombre no es trobi entre 1 i 12 cal que mostri un missatge d’error.

public class Ex4 {

    private static final String MSG_1 = "Introduce un numero del mez que deseas saaber :";
    private static final String MSG_2 = "Error ese mes no existe";

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int mes;
        System.out.println(MSG_1);
        mes = sc.nextInt();
        if (mes == 1) {
            System.out.println("Enero");
        } else if (mes == 2) {
            System.out.println("Febrero");
        } else if (mes == 3) {
            System.out.println("Marzo");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Mayo");
        } else if (mes == 6) {
            System.out.println("Junio");
        } else if (mes == 7) {
            System.out.println("Julio");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Septiembre");
        } else if (mes == 10) {
            System.out.println("Octubre");
        } else if (mes == 11) {
            System.out.println("Nombienbre");
        } else if (mes == 12) {
            System.out.println("Diciembre");
        }
        else {
            System.out.println(MSG_2);
        }
    }
}

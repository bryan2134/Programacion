/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

public class Ex6 {

    /*
    a) Donat un any i un mes, dir quants dies té el més.Per exemple: any=2010, mes=3 resultat = 31.
    Alerta amb els anys de traspàs!! 
     */
    private static final String MSG_1 = "Introduce un año : ";
    private static final String MSG_2 = "Introduce el mes";
    private static final String MSG_3 = "Año = ";
    private static final String MSG_4 = "Mes = ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes, año;
        System.out.println(MSG_1);
        año = sc.nextInt();
        System.out.println(MSG_2);
        mes = sc.nextInt();
        if (mes == 1) {
            System.out.println(MSG_3 + año);
            System.out.println(MSG_4 + mes);
            System.out.println("Dias = 31");
        } else if ((mes == 2) && (año % 4 == 0) || (año % 400 == 0)) {
            System.out.println(MSG_3 + año);
            System.out.println(MSG_4 + mes);
            System.out.println("Dias = 29");
        } else {
            System.out.println(MSG_3 + año);
            System.out.println(MSG_4 + mes);
            System.out.println("Dias = 28");
        }
        if (mes == 3) {
            System.out.println(MSG_3 + año);
            System.out.println(MSG_4 + mes);
            System.out.println("Dias = 31");
        } else if (mes == 4) {
            System.out.println(MSG_3 + año);
            System.out.println(MSG_4 + mes);
            System.out.println("Dias = 30");
        } else if (mes == 5) {
            System.out.println(MSG_3 + año);
            System.out.println(MSG_4 + mes);
            System.out.println("Dias = 31");
        } else if (mes == 6) {
            System.out.println(MSG_3 + año);
            System.out.println(MSG_4 + mes);
            System.out.println("Dias = 30");
        } else if (mes == 7) {
            System.out.println(MSG_3 + año);
            System.out.println(MSG_4 + mes);
            System.out.println("Dias = 31");
        } else if (mes == 8) {
            System.out.println(MSG_3 + año);
            System.out.println(MSG_4 + mes);
            System.out.println("Dias = 31");
        } else if (mes == 9) {
            System.out.println(MSG_3 + año);
            System.out.println(MSG_4 + mes);
            System.out.println("Dias = 30");
        } else if (mes == 10) {
            System.out.println(MSG_3 + año);
            System.out.println(MSG_4 + mes);
            System.out.println("Dias = 31");
        } else if (mes == 11) {
            System.out.println(MSG_3 + año);
            System.out.println(MSG_4 + mes);
            System.out.println("Dias = 30");
        } else if (mes == 12) {
            System.out.println(MSG_3 + año);
            System.out.println(MSG_4 + mes);
            System.out.println("Dias = 31");
        }
    }
}

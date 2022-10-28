/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

public class Ex3_d {

    private static final String MSG_1 = "Introduce un numero :  ";
    private static final String MSG_2 = "Pertenece al intervalo [-3,27]";
    private static final String MSG_3 = "No pertenece al intervalo [-3,27]";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println(MSG_1);
        num = sc.nextInt();
        if ((num > -3) && (num < 28)) {
            System.out.println(MSG_2);
        } else {
            System.out.println(MSG_3);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

public class Ex3_b {

    private static final String MSG_1 = "Introduce un numero :  ";
    private static final String MSG_2 = "Es mas grande que 35  ";
    private static final String MSG_3 = "Es mas pequeño que 35 ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println(MSG_1);
        num = sc.nextInt();
        if (num > 35) {
            System.out.println(MSG_2);
        } else {
            System.out.println(MSG_3);
        }
    }

}

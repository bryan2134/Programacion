/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;
//j) Calculeu el màxim de tres nombres.

public class Ex3_j {

    private static final String MSG_1 = "Introduce un número : ";
    private static final String MSG_2 = "El máximo de los tres numeros dados es : ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, num1, num2;
        System.out.println(MSG_1);
        num = sc.nextInt();
        System.out.println(MSG_1);
        num1 = sc.nextInt();
        System.out.println(MSG_1);
        num2 = sc.nextInt();
        if ((num > num1) && (num > num2)) {
            System.out.println(MSG_2 + num);
        } else {
            if ((num1 > num) && (num1 > num2)) {

                System.out.println(MSG_2 + num1);
            } else {
                System.out.println(MSG_2 + num2);
            }

        }
    }
}
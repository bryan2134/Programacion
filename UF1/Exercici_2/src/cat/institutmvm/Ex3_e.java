/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

public class Ex3_e {

    private static final String MSG_1 = "Introduce un  numero : ";
    private static final String MSG_2 = " No pertenece dentro del intervalo [25,50]";
    private static final String MSG_3 = " Pertenece dentro del intervalo [25,50]";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println(MSG_1);
        num = sc.nextInt();
        if ((num > 25) && (num < 50)) {
            System.out.println(num + MSG_3);
        } else {
            System.out.println(num + MSG_2);
        }

    }
}

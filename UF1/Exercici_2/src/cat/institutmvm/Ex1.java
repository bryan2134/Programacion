/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;

public class Ex1 {

    private static final String MSG_1 = "Mi nombre es Bryan ";
    private static final String MSG_2 = "Escalante Bautista";

    //a) Imprimeix el teu nom.
    public static void main(String[] args) {
        System.out.print(MSG_1);
        //b) Imprimeix el teu nom i cognoms en la mateixa línia.
        System.out.println(MSG_2);
        //c) Imprimeix el teu nom en una línia i el teu cognom en la següent.
        System.out.println(MSG_1);
        System.out.println(MSG_2);
       
        //d) Imprimeix una quadrat de 10 per 10 amb asteriscs *.
        int i, j, k;
        for (i = 0; i < 10; i++) {//primera linea
            System.out.print("*");
        }
        System.out.println();
        for (i = 0; i < 10 - 2; i++) {//Columnaa izquierda y derecha
            System.out.print("*");
            for (j = 0; j < 10 - 2; j++) {//Espacio de las columnas
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (i = 1; i < 10; i++) {//ultima linea
            System.out.print("*");
        }

        //e) Imprimeix un triangle de base 10 amb asteriscs.

        for(int i1=0 ;i1<10;i1++){
            for(int j1=0;j1<10-i1;j1++){
                System.out.print(" ");
            }
            for(int k1=1;k1<=(i1*2)-1;k1++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

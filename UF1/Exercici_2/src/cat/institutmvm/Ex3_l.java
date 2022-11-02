/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;
/*
l) Calcula la factura d’aigua tenint en compte les següents dades:
a)La quota fixa és de 6€.
b)Els primers 50 litres d’aigua són de franc.
c)Entre 50 i 200 litres, el litre costa 0,1€

*/
public class Ex3_l {
    private static final String MSG_1 = "Introduce los litrods de agua que desea calcular : ";
    private static final String MSG_2 = "El coste es de : 6$";
    private static final String MSG_3 = "El coste del agua es de :  ";
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println(MSG_1);
        num = sc.nextInt();
        if(num==50){
            System.out.println(MSG_2);
        }else{
            if((num>50)&&(num<201)){//Condicion si el litro de agua entre 5 y 200 el coste es de 0,1$
                System.out.println(MSG_3 + (num*0.1+6) );
            }else{
                if(num>200){//Si ess mas de 200litros el coste es de 0,3$
                    System.out.println(MSG_3 + (num*0.3+6));
                }
            }
        }
    
    }
}

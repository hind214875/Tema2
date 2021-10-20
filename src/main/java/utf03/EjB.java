/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utf03;

import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class EjB {
     public static void main(String[] args) {
        /*  saber si un caracter una letra mayuscula o minuscula*/
        //letra mayúscula: 65 – 90,letra minúscula: 97 – 122

        //declracion variables
        String a;

        //pedir Datos
        System.out.println("Introducer la letra");
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        char caracter = a.charAt(0);

        if (caracter >= 48 && caracter <= 57) {
            System.out.println("Es un numero ");
        } else if (caracter >= 65 && caracter <= 90) {
            System.out.println("la letra Mayuscula ");
        } else if (caracter >= 97 && caracter <= 122) {
            System.out.println("la letra Minuscula ");
        }else{
            System.out.println("no hay nada");
        }
 
        //if i will use String then i use the method chatAt(position);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utf04;

import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class EJ04 {
     public static void main(String[] args) {
        int edad;
        String resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.print("escanear edad:");
        edad = scanner.nextInt();
        
        resultado=(edad>=18)? "Mayor":"Menor";
        System.out.println("Es : " +resultado);
         

    }
}

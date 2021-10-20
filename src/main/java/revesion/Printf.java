/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revesion;

import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class Printf {
    public static void main(String[] args) {
        System.out.println("Introduce un variable");
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double sum=a+b;
       
        System.out.printf("el resultas de el variable a %.1f "
                + "y de el variable b %.1f es: %.1f %n",a,b,sum);
       
        //in JOptionPane we have to do a parseDouble
       
        
    }
}

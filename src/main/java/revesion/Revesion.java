/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revesion;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author hinda
 */
public class Revesion {
     public static void main(String[] args) {
          
        //declaracion de variables
        int var1,var2;
        //cuidando con los nombres --->camelCase
        double estaturaPersona;
        //Inicialisacion de variables
        var1=12;
        var2=14;
       
        //declaracion y initialisacion
        float pesoPersona=67.6f;
        long millionesQueMeVaisApagar=23_0000_0000_0000l;
       
        //constantes
        final boolean SIEMPRESI=true; //constante no puedes cambiar su valor luego
        final double SUBLEMNTO=7.20;
       
        //los valores conctretos de un tipo de datos son literales
        long numero1=23; //int -->long(conversion implicita)
        long numero2=(long)23; //conversion explicita(casting)
       
        //if the both variable int then the result int so we force one of them to be double for getting result in double
        double expresion=var1/(double)var2;
       
        //Math ceil,floor,round
        expresion=Math.ceil(3.4);//ceil redondea hacia arriba(techo)
        System.out.println(expresion);
        expresion=Math.floor(4.9);//floor redondea hacia abajo (suelo)
        System.out.println(expresion);
        expresion=Math.round(4.2);
        System.out.println(expresion);
        expresion=Math.round(4.8);
        System.out.println(expresion);
        expresion=Math.round(4.45);
        System.out.println(expresion);
       
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce el peso de la persona: ");
        pesoPersona=teclado.nextFloat();
       
        System.out.println("Introduce la estratura de la persona: ");
        estaturaPersona=teclado.nextDouble();
       
        //con Scanner,despues de leer numeros hay que limpiar la variable
        teclado.nextLine();
        System.out.println("Introduce tu nombre: ");
        String nombre=teclado.nextLine();
       
        //IMC=peso[Kg]/estatura[m2];  
        System.out.println("Peso: "+ pesoPersona +"la estratura: "+ estaturaPersona);
        double indiceMasaCorporal=pesoPersona/Math.pow(estaturaPersona, 2);
       
        System.out.println(nombre+" Tu IMC es: "+indiceMasaCorporal);
        System.out.printf("%s Tu IMC %.2f",nombre,indiceMasaCorporal);
       
        //lectura de datos con JOpcionPane
        String apellido=JOptionPane.showInputDialog("Introduce tu nombre");
        System.out.println(apellido);
       
        String dinerosTexto=JOptionPane.showInputDialog("Introduce el dinero para sobornar al de programacion");
        double dineros=Double.parseDouble(dinerosTexto);
        System.out.println("El profe va a recibir "+ (SUBLEMNTO+dineros) +" al año");//sin el paranthese sino concatena
       
        JOptionPane.showMessageDialog(null,"El profe va a recibir "+ (SUBLEMNTO+dineros) +" al año");
       
    
    }
}

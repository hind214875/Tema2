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
public class BancoHind {
     public static void main(String[] args) {

        //declaracion y initialisation variables
        int edad,anosDelvolverHipoteca;
        double salarioBrutoMensual,totalHipoteca,sueldoBrutoAnual,contidadresulta;
        
        //constantes
        final double FACTORMULTIPLICATIVO=5.85; 
        final int EDAD_MIN=5,EDAD_MAX=30;
        
        //pedir Informaciones
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad : ");
        edad = sc.nextInt();
        System.out.println("Introduce tu salario Bruto Mensual : ");
        salarioBrutoMensual = sc.nextDouble();
        if (edad>18 && edad<65) {
            System.out.println("Introduce la cantidad total de pasta que necesita para su hipoteca : ");
            totalHipoteca=sc.nextDouble();
            sueldoBrutoAnual=salarioBrutoMensual*12;
            contidadresulta=sueldoBrutoAnual*FACTORMULTIPLICATIVO;
            if(totalHipoteca<=contidadresulta){
                System.out.println("Introduce numero de años en los que quiere devolver la hipoteca: ");
                anosDelvolverHipoteca=sc.nextInt();
                if((anosDelvolverHipoteca>EDAD_MAX || anosDelvolverHipoteca<EDAD_MIN) || ((edad+anosDelvolverHipoteca)>75)){
                    System.out.println("Losiento la hipoteca rechaza");
                }else{
                    System.out.println("hipoteca Acceptada");
                }
            }else{
                System.out.println("Losiento la hipoteca rechaza");
                
            }
            
        }else{
            System.out.println("que no se conceden préstamos a menores de edad y a mayores de 65 años.");
        }

    }
}

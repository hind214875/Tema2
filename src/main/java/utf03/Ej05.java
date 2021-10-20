/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utf03;

/**
 *
 * @author hinda
 */
public class Ej05 {
    public static void main(String[] args) {
        
        //a.- Declara una variable primitiva de cada uno de los tipos estudiados.
        byte by=1;
        short sh=-2000;
        int i=12;
        long l=2000;
        double d=1.235;
        float f=1.2f;
        boolean b=true;
        char c='c';
        
        
        
        /*b.- Declara una constante numérica de tipo double y otra de tipo int. 
         Presta especial atención a la hora de poner el nombre de estas constantes y usa el modificador final.*/
        final int CONSTANTE=1;
        final double PI=3.14159;
        
       // c.- Declara un objeto String.
         String cadena="HALO";
         
       //muestrar en la pantalla los valores de variables y el valor min y max que occupan en la memoria
         System.out.println("El valor de byte " + by + " y ocupa en la memoria: 8 bits" 
                  + "\nEl valor de short " + sh + " y ocupa en la memoria: 16 bits"
                  + "\nEl valor de int " + i + " y occupa en la memoria: 32 bits"
                  + "\nEl valor de long " + l + " y occupa en la memoria:64 bits"
                  + "\nEl valor de double " + d + " y occupa en la memoria:64 bits"
                  + "\nEl valor de float " + f + " y occupa en la memoria:32 bits"
                  + "\nEl valor de boolean " + b + " y occupa en la memoria: 1 bits"
                  + "\nEl valor de char " + c + " y occupa en la memoria: 16 bits");
         
         System.out.println(cadena + "es un objeto de tipo string");
         
                  
          
         

    }
}

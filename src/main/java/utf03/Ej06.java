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
public class Ej06 {
       
 /*  6.- Crea una nueva clase llamada Ej06, que contenga una llamada al método public static void main(String[] args).
      La aplicación Java contendrá comentarios descriptivos del código e intercambiará los valores de dos variables de tipo entero, 
      haciendo uso de una tercera variable auxiliar. Antes de intercambiar los valores, 
      debes declarar e inicializar las variables con los valores que tú quieras. 
      Muestra los valores de las variables antes de intercambiar sus valores y después del intercambio.
*/
    
    public static void main(String[] args) {
        //declarar y inicializar las variables
          int a=2,b=10,aux=a;
           
        //muestrare los valores de a y b
          System.out.println("los valores de a y b son: a= " + a +" b= " + b);
        
        //intercambia los valores de a y b usando el variable Aux
         a=b;
         b=aux;
         
         //muestra los varoles despues el intercambio
         System.out.println("los valores de a y b despues el cambio son: a= " + a + " b= " + b);
    }
}

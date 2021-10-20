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
public class Ej07 {
     public static void main(String[] args) {
        //a.- Declara e inicializa tres variables int en la misma instrucción (a=1, b=2, c=3).
        int a=1,b=2,c=3;
        
        //b.- Declara e inicializa tres variables double en la misma instrucción (d=4.5, e=5.7, f=6.9).
        double d=4.5, e=5.7, f=6.9;
        
        //c.- Muestra las variables en dos líneas, la primera línea mostrará las variables tipo entero y la segunda línea mostrará las variables tipo double
        System.out.println("los variables de tipo entero son:a="+a +" b=" +b +" c="+c
        +"\nlos variables de tipo double son :d="+d + " e=" +e +" f=" +f);
        
        //d.- Realiza los siguiente intercambios de valores: en b guarda c, en c guarda a, en a guarda b. Muestra por pantalla el resultado.
         //declara un variable aux para guardar el valor de b 
         int aux=b;
         b=c;c=a;a=aux;
         
         
         System.out.println("los varoles de a y b y c despues el cambio son:a=" +a +" b=" +b +" c=" +c);
        
         //e.- Realiza los siguiente intercambios de valores: en e guarda f, en f guarda d, en d guarda e. Muestra por pantalla el resultado.
             double aux1=e;
            e=f; f=d; d=aux1;
                    
           
         System.out.println("los varoles de e y f y d despues el cambio son:e= "+e +" f=" +f +" d=" +d);
             
    }
    
}

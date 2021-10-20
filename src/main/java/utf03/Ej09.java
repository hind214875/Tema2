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
public class Ej09 {
    public static void main(String[] args) {
        int a=10,b=20;
        boolean aMenorB,aMayorB,aIgualB,aDifB;
        
        aMenorB=a<b;
        aMayorB=a>b;
        aIgualB=a==b;
        aDifB=a!=b;
        
        
        System.out.println(" : a<b" + aMenorB
        +" a>b "+aMayorB+" a==b"+aIgualB+"a!=b "+aDifB);
    }
    
}

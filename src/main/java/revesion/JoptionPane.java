/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revesion;

import javax.swing.JOptionPane;

/**
 *
 * @author hinda
 */
public class JoptionPane {
     public static void main(String[] args) {
        //utilisar JoptionPane yes no y hacer un controle sobre el resulta si tu coge yes o no
         int codigo=JOptionPane.showConfirmDialog(null, "¿Quieres un euro para una buena causa?", "Donacion", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (codigo==JOptionPane.YES_OPTION){
            System.out.println("Has pulsado en SI");
        }else if(codigo==JOptionPane.NO_OPTION){
            System.out.println("Has pulsado en NO");
        }
    }
}

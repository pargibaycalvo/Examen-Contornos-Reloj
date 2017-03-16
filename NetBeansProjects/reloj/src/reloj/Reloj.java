/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import javax.swing.JOptionPane;

/**
 * MENU O BOTONES DEL RELOJ
 * @author ped90
 */
public class Reloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * menu de opciones del reloj
         */
        
        Display disp = new Display();
        
        int opcion1, opcion2, opcion3;
        do{
        opcion1= Integer.parseInt(JOptionPane.showInputDialog("1) Activar alarma. \n2) Desactivar alarma. \n3) Ajustar hora. \n4) Ajustar alarma. \n5) Boton stop \n0) Salir."));
        switch(opcion1){
            case 1:
                disp.activaralarma();
                break;
            case 2:
                disp.desactivarlamar();
                break;
            case 3:
                disp.ajustarhora();
                break;
            case 4:
                disp.ajustaralarma();
                break;
            case 5:
                disp.desactivarlamar();
                break;
            case 0:
                JOptionPane.showMessageDialog(null,"Pulse aceptar para salir");
                System.exit(0); 
                break;
            default:
                JOptionPane.showMessageDialog(null,"Error");
        }
    }while(opcion1!=0);
    }
    
    }
    
    


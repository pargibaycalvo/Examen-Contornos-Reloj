/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

/**
 * PANTALLA
 * @author ped90
 */
public class Display {
    /**
     * muestra la alarma activada
     */
    public void activaralarma(){
        Alarma alarm = new Alarma();
        Altavoz speaker = new Altavoz();
        
        alarm.activaralarma();
        speaker.activaralt();
    }
    /**
     * muestra la alarma desactivada
     */
    public void desactivarlamar(){
        Alarma alarm = new Alarma();
        Altavoz speaker = new Altavoz();
        
        alarm.desactivaralarma();
        speaker.desactialt();
    }
    /**
     * muestra el ajuste de la hora
     */
    public void ajustarhora(){
        Hora hour = new Hora();
        
        hour.ajustarhora();
    }
    /**
     * muestra la configuracion de la alarma
     */
    public void ajustaralarma(){
        Alarma alarm = new Alarma();
        
        alarm.ajustaralarma();
    }
    
    

        
    }
    

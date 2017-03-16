/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;
/**
 * ALARMA
 * @author ped90
 */
public class Alarma {
    
    private int hora = 20;
    private int min = 30; 
    /**
     * activa la alarma y verificacion en pantalla
     * @return 
     */
    public boolean activaralarma(){
        boolean activar = true;
        System.out.println("Alarma activada");
        return activar;
    }
    /**
     * desactiva la alarma y verificacion en pantalla
     * @return 
     */
    public boolean desactivaralarma(){
        boolean desactivar = false;
        System.out.println("Alarma desactivada");
        return desactivar;
    }
    /**
     * ajuste del temporizador de alarma y verificacion en pantalla
     */
    public void ajustaralarma(){
        System.out.println("Alarma");
        System.out.println("Ajuste la hora "+hora);
        System.out.println("Ajuste los minutos "+min);
    }
    
    
}

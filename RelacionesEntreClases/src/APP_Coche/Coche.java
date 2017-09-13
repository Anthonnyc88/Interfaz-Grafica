/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APP_Coche;

/**
 *
 * @author estudiante
 */
public class Coche {
    public static void enciende(){
        Motor.activa();
    }
    public static void desactiva(){
        Motor.desactiva();
    }
    public static void acelerar(int revoluciones){
        Motor.cambiarRevolucionesPorMinuto(revoluciones);
        Persona.emociona();
    }
    public static void frena(int revoluciones){
        Motor.cambiarRevolucionesPorMinuto(revoluciones);
        Persona.emociona();
    }
}

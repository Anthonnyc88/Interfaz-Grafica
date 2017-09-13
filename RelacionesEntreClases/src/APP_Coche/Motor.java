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
public class Motor {
    static int revolucionesPorMinuto;
    static boolean activo;
    
    public static void cambiarRevolucionesPorMinuto(int rpm){
        revolucionesPorMinuto = rpm;
    }
    public void estaActivo(){
       
    }
    public static void activa(){
        activo = true;
    }
    public static void desactiva(){
        activo = false;
    }
}

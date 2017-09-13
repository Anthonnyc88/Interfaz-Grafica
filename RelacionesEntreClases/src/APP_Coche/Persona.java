/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APP_Coche;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class Persona {
    Scanner scanner = new Scanner (System.in);
    String persona;
    boolean carro;
    public Persona(String nombre){
        this.persona = nombre;
        System.out.println("Tiene Coche:");
        String rest = scanner.nextLine();
        if("Si".equals(rest)){
            carro = true;
            
        }else{
            carro = false;
        }
    }
    public void asignarCoche(){
        
    }
    public static void emociona(){
        if(Corazon.ritmo <100){
            System.out.println("no puede emocionarse mas");
        }else{
            Corazon.ritmo = +10;
        }
    }
         public static void Tranquiliza(){
        if(Corazon.ritmo >10){
            System.out.println("vas a palmar");
        }else{
            Corazon.ritmo = -10;
        }
    }
}

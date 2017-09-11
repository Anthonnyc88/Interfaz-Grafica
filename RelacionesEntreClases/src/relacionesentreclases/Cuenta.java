/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases;

/**
 *
 * @author estudiante
 */
public class Cuenta {
    private long numero;
    private float saldo;
    private double interesActual;
    private Cliente titular;

    

    Cuenta(int i, double d, Object object) {
        this.numero = i;
        this.interesActual = d;
        this.saldo =  (float) object;
    }

   
    
    
    
    /**
     * aumneta la cantidad que recibe el parametro
     * @param cantidad 
     */
    
    public void Ingreso(int cantidad){
        if (cantidad>0){
            saldo += cantidad;
        }
    }
    public void reuntegro(int cantidad){
        if(cantidad < 0 & cantidad <= saldo){
            saldo = cantidad;
        }
    }
    public void IngresoInteresmES(){
        
    }
    public Boolean enRojos(){
        return saldo < 0;
    }
    
    
}


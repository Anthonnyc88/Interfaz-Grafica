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
    private double interesAnual;
    private Cliente titular;

    public Cuenta(long numero, double interesAnual, Cliente titular) {
        this.numero = numero;
        this.interesAnual = interesAnual;
        this.titular = titular;
    }
    
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    /**
     * Aumenta el saldo en la cantidad que recibe por param
     * 
     * @param cantidad int indica la cantidad a depositar
     */
    public void ingreso(int cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    /**
     * Resta el saldo segÃºn la cantidad que recibe por param
     *
     * @param cantidad int indica la cantidad a retirar
     */
    public void reintegro(int cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        }
    }
    /**
     * Determina si una cuenta esta en negativo
     * @return boolean True: si el saldo estÃ¡ en negativo, false: caso contrario
     */
    public Boolean enRojos(){
        return saldo < 0;
    }
    
    
    public int leerSaldo(){
        return 0;
    }
    
    public void salvar(){
    }
    
    public Cliente leerTitular(){
        return titular;
    }
}

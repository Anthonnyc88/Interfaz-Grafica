/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases;

import java.util.Date;

/**
 *
 * @author estudiante
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String direccion;
    private String localidad;
    private Date fNacimiento;

    public Cliente(String nombre, String apellido, String direccion, String localidad, Date fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.localidad = localidad;
        this.fNacimiento = fNacimiento;
    }
    
    /**
     * Obtiene el nombre completo del cliente
     * @return String con el nombre completo del cliente
     */
    public String nombreCompleto(){
    
        return nombre + " "+ apellido;
    }
    /**
     * Obtiene la direcciÃ³n exacta del cliente
     *
     * @return String con la direccion del cliente
     */
    public String direccionCompleta(){
        return localidad +", "+direccion;
    }
    
    
    
}

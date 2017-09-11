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
public class Cliente {
    private String nombre;
    private String apellido;
    private String direccion;
    private String localidad;
    private String fnacimiento;

    Cliente(String q, String w, String e, String r, String t) {
        this.nombre = q;
        this.apellido = w;
        this.direccion = e;
        this.localidad = r;
        this.fnacimiento = t;
    }
    
    /**
     * obtener el nombre completo del cliente
     * @return String con el nombre completo del cliente 
     */
    
    public String nombrecompleto(){
        return nombre + ""+ apellido;
    }
    /**
     * Obtiene la direccion exacta del cliente 
     * @return  STring con la direccion
     */
    public String direccioncompleto(){
        return localidad + ""+ direccion;
    }
}

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
public class RelacionesEntreClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cuenta cu = new Cuenta(12423423,0.03,null);
        Cliente cl = new Cliente("Keilor","Rivera","50 mts Sur Iglesia","Cedral",new Date());
        cu.setTitular(cl);
        System.out.println(cu.leerTitular().nombreCompleto());
        
        Poligono p = new Poligono();
        p.agregarSegmento(new Segmento(10));
        p.agregarSegmento(new Segmento(11));
        p.agregarSegmento(new Segmento(12));
        System.out.println(p);
        
        
    }
    
}

    

    
    


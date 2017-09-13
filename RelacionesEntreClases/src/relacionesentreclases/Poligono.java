package relacionesentreclases;


import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiante
 */
public class Poligono {
    private LinkedList<Segmento> segmentos;

    public Poligono() {
        segmentos = new LinkedList<>();
    }

    public void agregarSegmento(Segmento seg){
        segmentos.add(seg);
    }

    @Override
    public String toString() {
        return "Poligono{" + "segmentos=" + segmentos + '}';
    }
    
    
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cafetera;

/**
 *
 * @author TIC-Laura
 */
public class ServicioCafetera {
    public void llenarCafetera(Cafetera a){
        
        a.setCantidadActual(a.getCapacidadMax());
        System.out.println("Llene la Cafetera a " + a.getCantidadActual());
    }

    public void servirTaza(int capacidadTaza, Cafetera a){
        
        if (capacidadTaza <= a.getCantidadActual()) {
            System.out.println("La Taza se lleno");
            a.setCantidadActual(a.getCantidadActual() - capacidadTaza);
        } else {
          
            System.out.println("Solo se lleno con " + a.getCantidadActual());
            a.setCantidadActual(0);
        }
    }
    
    public void vaciarCafetera(Cafetera a){
        a.setCantidadActual(0);
        System.out.println("Cafetera vacia");
    }
    
    public void agregarCafe(int cafe, Cafetera a){
        int cantidadPermitida = a.getCapacidadMax() - a.getCantidadActual();
        if(cantidadPermitida >= cafe){
            a.setCantidadActual(a.getCantidadActual() + cafe);
            System.out.println("Se agrego " + cafe + " de cafe");
        }
        else{
            System.out.println("La cafetera se va a revalsar");
        }
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoNexpreso;

import Entidades.Cafetera;
import Servicio.ServicioCafetera;
import java.util.Scanner;

/**
 *
 * @author TIC-Laura
 */
public class Nexpreso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera a = new Cafetera();
        ServicioCafetera serv = new ServicioCafetera();
        
        serv.llenarCafetera(a);
        System.out.println("Buenos dias, de que capacidad es su taza");
        Scanner leer=new Scanner(System.in);
        int capacidadTaza=leer.nextInt();
        serv.servirTaza(capacidadTaza, a);
        
        serv.vaciarCafetera(a);
        System.out.println("Buenos dias, que cantidad de cafe desea colocar");
        int cafe=leer.nextInt();
        serv.agregarCafe(cafe, a);
        
               
    }
    
}

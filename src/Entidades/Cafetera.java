/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author TIC-Laura
 */
public class Cafetera {
    private int capacidadMax;
    private int cantidadActual;

    public Cafetera() {
        this.capacidadMax = 2500;
    }

    public Cafetera(int cantdadActual) {
        this.capacidadMax = 1500;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public void setCantidadActual(int cantdadActual) {
        this.cantidadActual = cantdadActual;
    }
    
    
}

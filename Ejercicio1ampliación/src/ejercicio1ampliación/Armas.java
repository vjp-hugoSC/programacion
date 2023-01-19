/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1ampliación;

/**
 *
 * @author hserranoc01
 */
public class Armas {

    private boolean disponible;
    private int numarmas;

    public Armas(boolean disponible, int numarmas) {
        this.disponible = disponible;
        numarmas++;
    }

    public Armas() {
        this.disponible = true;
        numarmas++;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setNumarmas(int numarmas) {
        this.numarmas = numarmas;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public int getNumarmas() {
        return numarmas;
    }

    public void usararma() {

    }

    public void quitarseguro() {

    }
}

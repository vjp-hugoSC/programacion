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
public class Bombas {

    private int alcance;
    private boolean accionadoadistancia;

    public Bombas() {
        this.alcance = 0;
        this.accionadoadistancia = true;
    }

    public Bombas(int alcance, boolean accionadoadistancia) {
        this.alcance = alcance;
        this.accionadoadistancia = accionadoadistancia;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public void setAccionadoadistancia(boolean accionadoadistancia) {
        this.accionadoadistancia = accionadoadistancia;
    }

    public int getAlcance() {
        return alcance;
    }

    public boolean isAccionadoadistancia() {
        return accionadoadistancia;
    }

}

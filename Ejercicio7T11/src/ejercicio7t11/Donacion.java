/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7t11;

/**
 *
 * @author hserranoc01
 */
public class Donacion {

    private String nombre;
    private int donacion;

    public Donacion(String nombre, int donacion) {
        this.nombre = nombre;
        this.donacion = donacion;
    }

    public Donacion() {
        this.nombre = "";
        this.donacion = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDonacion() {
        return donacion;
    }

    public void setDonacion(int donacion) {
        this.donacion = donacion;
    }

}

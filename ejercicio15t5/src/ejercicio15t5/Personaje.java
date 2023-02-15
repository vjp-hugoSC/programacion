/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15t5;

/**
 *
 * @author Hugo
 */
public class Personaje {

    private String nombre;
    private int turno;
    private int idcelda;
    private char marca;

    public Personaje(String nombre, int turno, int idcelda, char marca) {
        this.nombre = nombre;
        this.turno = turno;
        this.idcelda = idcelda;
        this.marca = marca;
    }

    public Personaje() {
        this.nombre = "";
        this.turno = 0;
        this.idcelda = 1;
        this.marca = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTurno() {
        return turno;
    }

    public int getIdcelda() {
        return idcelda;
    }

    public char getMarca() {
        return marca;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public void setIdcelda(int idcelda) {
        this.idcelda = idcelda;
    }

    public void setMarca(char marca) {
        this.marca = marca;
    }

    public void realizarAcciones() {

    }

    public void mover() {
        System.out.println(nombre + " se está moviendo");
    }

}

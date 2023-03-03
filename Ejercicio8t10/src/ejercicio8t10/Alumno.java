/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8t10;

/**
 *
 * @author hserranoc01
 */
public class Alumno {
    private String nombre;
    private int curso;

    public Alumno(String nombre, int curso) {
        this.nombre = nombre;
        this.curso = curso;
    }
    
    public Alumno() {
        nombre = "";
        curso = 0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", curso=" + curso + '}';
    }

}

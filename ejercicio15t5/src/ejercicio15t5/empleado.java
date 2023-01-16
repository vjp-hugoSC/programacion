/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15t5;

/**
 *
 * @author hserranoc01
 */
public class empleado {
    private String nombre;
    private int salario;
    private Direccion direccion;

    public empleado(String nombre, int salario, Direccion direccion) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }

    public empleado() {
        this.nombre="";
        this.salario=0;
        this.direccion=direccion;
    }
    
    
    public void setNombre(String n){
        nombre=n;
    }
    public void setSalario (int s){
        salario=s;
    }
    public void setDireccion(Direccion d){
        direccion=d;
    }
    public String getNombre(){
        return nombre;
    }
    public int getSalario(){
        return salario;
    }
    public Direccion getDireccion(){
        return direccion;
    }
}

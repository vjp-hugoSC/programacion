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
public class Direccion {
    private String calle;
    private int numero;
    private int piso;
    private String ciudad;
    
    public Direccion(){
        calle="";
        piso=0;
        numero=0;
        ciudad="";
    }
    public Direccion(String calle,int piso, int numero, String ciudad){
        
    }
    
    public void setCalle(String c){
        calle=c;
    }
    public void setNumero(int num){
        numero=num;
    }
    public void setPiso(int p){
        piso=p;
    }
    public void setCiudad(String ciu){
        ciudad=ciu;
    }
    public String getCalle(){
        return calle;
    }
    public int getNumero(){
        return numero;
    }
    public int getPiso(){
        return piso;
    }
    public String getCiudad(){
        return ciudad;
    }
}

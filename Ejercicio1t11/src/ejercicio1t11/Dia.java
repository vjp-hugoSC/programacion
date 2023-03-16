/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1t11;

/**
 *
 * @author Hugo
 */
public class Dia {
    private String nombredia;
    private int temperatura;

    public Dia(String nombredia, int temperatura) {
        this.nombredia = nombredia;
        this.temperatura = temperatura;
    }
     public Dia() {
        this.nombredia = "";
        this.temperatura = 0;
    }

    public String getNombredia() {
        return nombredia;
    }

    public void setNombredia(String nombredia) {
        this.nombredia = nombredia;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Dia{" + "nombredia=" + nombredia + ", temperatura=" + temperatura + '}';
    }
     
}

package ed_ut4_proyecto;

public class Socio {

    String nombre;
    float precioAbonado;

    public Socio() {
        this.nombre = "";
        this.precioAbonado = 0;
    }

    public Socio(String nombre, float precioAbonado) {
        this.nombre = nombre;
        this.precioAbonado = precioAbonado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecioAbonado() {
        return precioAbonado;
    }

    public void setPrecioAbonado(float precioAbonado) {
        this.precioAbonado = precioAbonado;
    }

}

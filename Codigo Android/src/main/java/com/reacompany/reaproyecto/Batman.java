package com.reacompany.reaproyecto;

/**
 * Created by Martha on 31/12/2016.
 */
public class Batman implements Clonable{
    private String nombre;
    private int generacion;

    public Batman() {

    }

    @Override
    public Clonable clonar() {
        Batman clon = new Batman(generacion, nombre);
        return clon;
    }

    public Batman(int generacion, String nombre) {
        this.generacion = generacion;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGeneracion() {
        return generacion;
    }

    public void setGeneracion(int generacion) {
        this.generacion = generacion;
    }
}

package com.reacompany.reaproyecto;

/**
 * Created by eduardo on 13/09/2016.
 */
public class Borrego implements Clonable {
    private String nombre;
    private int numero;

    public Borrego() {

    }

    @Override
    public Clonable clonar() {
        Borrego clon = new Borrego(numero, nombre);
        return clon;
    }

    public Borrego(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

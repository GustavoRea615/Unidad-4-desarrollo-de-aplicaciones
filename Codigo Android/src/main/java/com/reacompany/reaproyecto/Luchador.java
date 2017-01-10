package com.reacompany.reaproyecto;

/**
 * Created by Martha on 31/12/2016.
 */
public class Luchador implements Clonable{
    private String nombre;
    private String categoria;

    public Luchador() {

    }

    @Override
    public Clonable clonar() {
        Luchador clon = new Luchador(categoria, nombre);
        return clon;
    }

    public Luchador(String categoria, String nombre) {
        this.categoria = categoria;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

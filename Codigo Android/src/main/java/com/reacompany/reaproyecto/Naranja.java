package com.reacompany.reaproyecto;

/**
 * Created by Martha on 01/01/2017.
 */
public class Naranja implements Clonable{
    private String estado;
    private String sabor;

    public Naranja() {

    }

    @Override
    public Clonable clonar() {
        Naranja clon = new Naranja(sabor, estado);
        return clon;
    }

    public Naranja(String sabor, String estado) {
        this.sabor = sabor;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}

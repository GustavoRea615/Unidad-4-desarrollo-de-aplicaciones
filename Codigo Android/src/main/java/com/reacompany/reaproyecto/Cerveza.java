package com.reacompany.reaproyecto;

/**
 * Created by Martha on 30/12/2016.
 */
public class Cerveza {
    private String marca;
    private String tipo;
    private int precio;

    private static Cerveza cerveza;

    public static Cerveza getCerveza() {
        if (cerveza ==null){
            cerveza = new Cerveza();
        }
        return cerveza;
    }

    public Cerveza() {
        this.marca = "";
        this.tipo="";
        this.precio=0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public static void setCerveza(Cerveza cerveza) {
        Cerveza.cerveza = cerveza;
    }
}

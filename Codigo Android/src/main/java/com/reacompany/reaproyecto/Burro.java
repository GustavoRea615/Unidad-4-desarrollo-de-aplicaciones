package com.reacompany.reaproyecto;

/**
 * Created by Martha on 12/12/2016.
 */
public class Burro {
    private String nombre;
    private int edad;
    private int peso;

    private static Burro burro;

    public static Burro getBurro() {
        if (burro ==null){
            burro = new Burro();
        }
        return burro;
    }

    public Burro() {
        this.nombre = "";
        this.edad=0;
        this.peso=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}

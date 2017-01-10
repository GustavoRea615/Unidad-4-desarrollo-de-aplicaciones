package com.reacompany.reaproyecto;

/**
 * Created by eduardo on 14/09/2016.
 */
public class ZoologicoFactory {
    private Zoologico zoologico;

    public Zoologico crearAnimal(String tipo) {
        if (tipo != null) {
            if (tipo.equalsIgnoreCase("conejo")) {
                zoologico = new Conejo();
            } else if (tipo.equalsIgnoreCase("perro")) {
                zoologico = new Perro();
            } else if (tipo.equalsIgnoreCase("vaca")) {
                zoologico = new Vaca();
            } else if (tipo.equalsIgnoreCase("gato")) {
                zoologico = new Gato();
            }
            else if (tipo.equalsIgnoreCase("venado")) {
                zoologico = new Venado();
            } else if (tipo.equalsIgnoreCase("wipo")) {
                zoologico = new Hipopotamo();
            } else if (tipo.equalsIgnoreCase("hipopotamo")) {
                zoologico = new Hipopotamo();
        } else if (tipo.equalsIgnoreCase("pato")) {
                zoologico = new Pato();
            } else if (tipo.equalsIgnoreCase("leon")) {
                zoologico = new Leon();
            } else {
                return null;
            }
        }
        return zoologico;
    }
}

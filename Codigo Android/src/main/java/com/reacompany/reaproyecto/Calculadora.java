package com.reacompany.reaproyecto;

/**
 * Created by Martha on 30/12/2016.
 */
public class Calculadora {

    private int valor1;
    private int valor2;
    private int resultado;

    private static Calculadora calculadora;

    public static Calculadora getCalculadora() {
        if (calculadora ==null){
            calculadora = new Calculadora();
        }
        return calculadora;
    }

    public Calculadora() {
        this.valor1=0;
        this.valor2=0;
        this.resultado = 0;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public static void setCalculadora(Calculadora calculadora) {
        Calculadora.calculadora = calculadora;
    }
}

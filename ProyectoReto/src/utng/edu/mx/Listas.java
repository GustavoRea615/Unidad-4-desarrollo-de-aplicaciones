/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.edu.mx;


import java.util.Scanner;
import java.util.Vector;

/**
 * @author Jose Manuel Enriquez Cabrera Gustavo Rea Jimenez
 */
public class Listas {

    /**
     * se importa la libreria de Scanner para poder leer los datos desde consola 
     */
    static Scanner entrada = new Scanner(System.in);
    static int dato, posicion;
    
    //se hace una instacia de la clase lista
    static Lista lista = new Lista();
    //se crea el main para poder insertar datos

    public static void ejecutar() {
        

        do {
            System.out.print("Favor ingresar valor numerico entero: ");
            
            dato = entrada.nextInt();
            
            System.out.print("Como desea ingresar el valor?:  1:Al Inicio   2:En Medio   3:Al Final ");
            
            posicion = entrada.nextInt();
            
            lista.agregar(dato, posicion);
            
            lista.Resultado();

            System.out.print("\n\nÂ¿Desea continuar?  s/n: ");
            
        } while (entrada.next().equalsIgnoreCase("s"));
    }//fin metodo main
}//fin clase insertar

// clase lista
class Lista {

    int val, pos;
    /// se hace una instancia del vector
    Vector vector = new Vector();

    
// se declara el metodo agregar para poder insertar datos
    public void agregar(int valor, int posicion) {
        val = valor;
        pos = posicion;
        //se crea un switch para los distintos casos
        switch (posicion) {
            //caso 3 inserta al final
            case 3:
                vector.add(val);
                break;
                //en el caso 2 se inserta en medio
            case 2:
                if (vector.size() > 0) {
                    vector.add(vector.lastElement());
                    int medio = vector.size() / 2;

                    for (int x = vector.size() - 1; x > medio; x--) {
                        vector.setElementAt(vector.elementAt(x - 1), x);
                    }
                    vector.setElementAt(val, medio);
                } else {
                    vector.add(val);
                }
                break;
                    //caso 1 inserta al inicio
            case 1:
                if (vector.size() > 0) {
                    vector.add(vector.lastElement());
                    for (int x = vector.size() - 1; x > 0; x--) {
                        vector.setElementAt(vector.elementAt(x - 1), x);
                    }
                    vector.setElementAt(val, 0);
                } else {
                    vector.add(val);
                }
                break;
        }
    }//fin del metodo agregar


//
    public String vector() {
        String cadena = "";
        for (int x = 0; x < vector.size(); x++) {
            cadena = cadena + String.valueOf(vector.elementAt(x) + "  ");
        }
        return cadena;
    }
    //se declara el metodo para mostrar el resultado en pantalla
        public void Resultado() {
        for (int x = 0; x < vector.size(); x++) {
            System.out.print(vector.elementAt(x) + "\t");
        }
    }
}


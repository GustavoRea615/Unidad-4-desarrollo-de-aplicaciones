/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.edu.mx;

/**
 *
 * @author Manuel
 */
import java.io.*;

public class PilaLista {

    public static class ClaseListas { 

        static char dato[] = new char[100]; 
        static int sn[] = new int[100];  
        static int apuntador, top;  

        ClaseListas() { 
            apuntador = -1;
            top = 0;
        }

        public static void Mostrar() {
            int i = 0;
            System.out.println("\n\n MOSTRAR CONTENIDO");
            System.out.println("Datos");
            for (i = 0; i < top; i++) {
                System.out.println(dato[i]);
            }
        }
        public static void Insertar(char elemento) {
            int i = 0, ant = 0;
            if (apuntador == -1) {

                apuntador = top;
                dato[top] = elemento;
                sn[top] = -1;
                top++;
                return;
            }
            i = apuntador;
            do {

                if (elemento < dato[i]) {
                    if (i == apuntador) { 
                        System.out.println("Insertando el dato menor de todos ...");
                        dato[top] = elemento;
                        sn[top] = apuntador;
                        apuntador = top;
                        top++;
                        return;
                    } else {
                        dato[top] = elemento;//Se inserta en medio
                        sn[top] = sn[ant];
                        sn[ant] = top;
                        top++;
                        return;
                    }
                }
                ant = i;
                i = sn[i];
            } while (i != -1);
            dato[top] = elemento;
            sn[top] = -1;
            sn[ant] = top;
            top++;
            return;
        }
    }
  
    static ClaseListas Lista = new ClaseListas();
    

    public static void inicia() throws IOException {
        int op = 0;
        do {
            System.out.println("\n\n LISTAS ");
            System.out.println("1.- Altas");
            System.out.println("2.- Mostrar estructura");
            System.out.print("Opcion? ---> ");
            op = getInt();
            switch (op) {
                case 1:
                    Altas();
                    break;
                case 2:
                    Lista.Mostrar();
                    break;
            }
        } while (op != 0);
    }

    public static void Altas() throws IOException {
        char dato;
        System.out.println("\n\n Insertar");
        System.out.print("Dato a insertar ---> ");
        dato = getChar();
        Lista.Insertar(dato); 
    }
    

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    

   
    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
    

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }
}
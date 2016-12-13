package utng.edu.mx;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;

public class PilaArreglo {

    public static class ClasePila {  

        private int max = 30;   
        private int pila[] = new int[max];   
        private int top; 
        

        public ClasePila() {   
            top = 0;
        }

        public void Push(int dato) {

            for (int i = 0; i < top; i++) {
                
                if (dato < pila[i]) {  
                    for (int j = top; j > i; j--) {
                        pila[j] = pila[j - 1];
                    }
                    pila[i] = dato;
                    top++;
                    return;
                }
            }
            pila[top++] = dato; 
            return;
        }
//quedo en proceso no funciona
        public void Pop(int dato) {

            for (int i = 0; i < top; i++) {
                if (pila[i] == dato) {
                    for (int j = i; i > top + 1; i++) {
                     
                    }
                    
                }
            }
        }

        public void Mostrar() {
            System.out.println("\n\n MOSTRAR LA PILA");
            for (int i = 0; i < top; i++) {
                System.out.println("pila[" + i + "]=" + pila[i]);
            }
        }
    }
    static ClasePila Pila = new ClasePila();  

    public static void iniciar() throws IOException {
        int op = 0;
        do {
            op = 0;
            System.out.println("\n\n PILAS ");
            System.out.println("1.-Push");
            System.out.println("2.-Pop");
            System.out.println("3.-Mostrar Pila");
            System.out.println("0.-Salir");

            System.out.print("Opcion :");
            op = getInt();

            switch (op) {
                case 1:
                    Insertar();
                    break;
                case 2:
                    Eliminar();
                    break;
                case 3:
                    Pila.Mostrar();
                    break;
            }
        } while (op != 0);
    }

    public static void Insertar() throws IOException {
        int dato = 0;
        System.out.println("\n\n Insertar");
        System.out.print("\nAnotar dato ");
        dato = getInt();
        Pila.Push(dato); 
    }

    public static void Eliminar() throws IOException {
        int dato = 0;
      
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
}
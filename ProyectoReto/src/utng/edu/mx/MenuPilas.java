/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.edu.mx;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author HP Rea
 */
public class MenuPilas {
       public static void subMenuPila() throws IOException {
        int op;

        Scanner tec = new Scanner(System.in);
 PilaLista pilaLista= new PilaLista();
 PilaArreglo pilaArreglo= new PilaArreglo();
        do {
            System.out.println("Como desea generar la pila?");
            System.out.println("1-.Pila con Arreglo"
                    + "\n2-.Pila con Lista"
                    + "\n0-. Salir");
            op = tec.nextInt();

            switch (op) {

                case 1:
                  pilaArreglo.iniciar();
                    break;

                case 2:
                    pilaLista.inicia();
                    break;
            }

        } while (op != 0);
        System.out.println("Gracias por su consulta");
    } 
}

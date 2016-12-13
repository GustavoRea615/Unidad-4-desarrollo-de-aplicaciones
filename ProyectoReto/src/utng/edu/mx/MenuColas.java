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
public class MenuColas {
       public static void subMenuCola() throws IOException {
        int op;

        Scanner tec = new Scanner(System.in);
        Colas colas= new Colas();
        do {
            System.out.println("Como desea generar la cola?");
            System.out.println("1-.Cola con Arreglo"
                    + "\n2-.Cola con Lista"
                    + "\n0-. Salir");
            op = tec.nextInt();

            switch (op) {

                case 1:
                    Colas.inicia();
                    break;

                case 2:

                    break;
            }

        } while (op != 0);
        System.out.println("Gracias por su consulta");
    } 
}

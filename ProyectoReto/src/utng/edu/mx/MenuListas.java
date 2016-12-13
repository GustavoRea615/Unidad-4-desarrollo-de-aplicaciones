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
public class MenuListas {
        public static void subMenuLista() throws IOException {
        int op;

        Scanner tec = new Scanner(System.in);
        Listas listas= new Listas();
        do {
            System.out.println("Como desea generar la lista?");
            System.out.println("1-.continuar"
                    + "\n0-. Salir");
            op = tec.nextInt();

            switch (op) {

                case 1:
                    listas.ejecutar();
                    break;
            }

        } while (op != 0);
        System.out.println("Gracias por su consulta");
    }
}

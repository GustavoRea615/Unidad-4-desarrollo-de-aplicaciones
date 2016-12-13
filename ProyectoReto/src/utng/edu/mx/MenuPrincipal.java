/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.edu.mx;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author HP Rea
 */
public class MenuPrincipal {

    public static void main(String[] args) throws IOException {
        int op;

        Scanner tec = new Scanner(System.in);
        MenuColas menuColas = new MenuColas();
        MenuListas menuListas = new MenuListas();
        MenuPilas menuPilas = new MenuPilas();
        do {
            System.out.println("Bienvenido, que le gustaria realizar?");
            System.out.println("1-.Listas"
                    + "\n2-.Pilas"
                    + "\n3-.Colas"
                    + "\n0-. Salir");
            op = tec.nextInt();

            switch (op) {

                case 1:
                    menuListas.subMenuLista();
                    break;

                case 2:
                    menuPilas.subMenuPila();
                    break;

                case 3:

                    menuColas.subMenuCola();
                    break;
            }

        } while (op != 0);
        System.out.println("Gracias por su consulta");
    }
}

package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {


    //Constructor.
    private Consola()
    {

    }


    public static void mostrarMenu()
    {
        System.out.println("1: Crear Rey. \n2: Elegir color. \n3: Mover. \n4: Salir.");

    }

     //Validar menu
    public static int elegirOpcionMenu()
    {
        int menu;

        System.out.println("Introduce un numero");
        menu= Entrada.entero();


        while (menu<1 || menu>4)
        {
            System.out.println("Introduce un numero correcto");
            menu=Entrada.entero();
        }
        return menu;
    }
}

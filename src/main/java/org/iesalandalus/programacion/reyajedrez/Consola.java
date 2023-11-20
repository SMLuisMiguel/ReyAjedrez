package org.iesalandalus.programacion.reyajedrez;
import org.iesalandalus.programacion.reyajedrez.modelo.Color;
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
    //Crear el menu elegir opcion.
    public static Color elegirOpcion()
    {

        int menu;

        System.out.println("Introduzca el color:\n1:BLANCO. \n2:NEGRO.");
        System.out.println("Introduce un numero");
        menu= Entrada.entero();


        while (menu<1 || menu>2)
        {
            System.out.println("Introduce un numero correcto");
            menu=Entrada.entero();
        }

        if (menu==1)
        {
            return Color.BLANCO;
        }
        else
        {
            return Color.NEGRO;
        }

    }
}

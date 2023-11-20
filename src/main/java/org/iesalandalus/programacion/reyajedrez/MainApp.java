package org.iesalandalus.programacion.reyajedrez;
import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reyajedrez.modelo.Rey;

import javax.naming.OperationNotSupportedException;

public class MainApp {

    private static Rey rey;

    private static void ejecutarOpcion(int opcion)
    {
        switch (opcion)
        {
            case 1:
                crearReyDefecto();
                break;

            case 2:
                crearReyColor();
                break;

            case 3:
                mover();
                break;

            case 4:
                Consola.despedirse();
                break;

        }
    }

    private static void crearReyDefecto()
    {
        if (rey == null)
        {
            rey= new Rey();
            mostrarRey();
        }
        else
        {
            System.out.println("El rey ya existe");
        }
    }

    private static void crearReyColor()
    {
        if (rey == null)
        {
            Color color= Consola.elegirOpcion();
            rey= new Rey(color);
            mostrarRey();
        }
        else
        {
            System.out.println("El rey ya existe");
        }
    }

    private static void mover()
    {
        if (rey != null)
        {
            Consola.mostrarMenuDirecciones();
            Direccion direccion=Consola.elegirDireccion();
            try
            {
                rey.mover(direccion);
                mostrarRey();
            }
            catch (OperationNotSupportedException e)
            {
                System.out.println("El movimiento introducido no es posible");
                mostrarRey();
            }
        }
        else
        {
            System.out.println("No se puede hacer el movimiento, debe crearse el rey antes");
        }
    }

    private static void mostrarRey()
    {
        if (rey != null)
        {
            System.out.println("El rey se encuentra en la siguiente posicion:");
            System.out.println(rey.toString());
        }
        else
        {
            System.out.println("Debe de crearse el rey.");
        }
    }

    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("-------------------------------------------");
            Consola.mostrarMenu();
            opcion = Consola.elegirOpcionMenu();
            ejecutarOpcion(opcion);
        }

    }
}

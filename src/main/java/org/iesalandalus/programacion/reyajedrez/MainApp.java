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
                //
                break;

        }
    }

    private static void crearReyDefecto()
    {
        rey= new Rey();
    }

    private static void crearReyColor()
    {
        Color color= Consola.elegirOpcion();
        rey= new Rey(color);
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
            }
            catch (OperationNotSupportedException e)
            {
                System.out.println("El movimiento introducido no es posible");
            }
        }
        else
        {
            System.out.println("No se puede hacer el movimiento, debe crearse el rey antes");
        }
    }


    public static void main(String[] args) {





        Consola.mostrarMenu();



        int opcionElegida = Consola.elegirOpcionMenu();
        //Color colorElegido= Consola.elegirOpcion();
        //Consola.mostrarMenuDirecciones();
        //Direccion direccionElegida=Consola.elegirDireccion();
        Consola.despedirse();


    }
}

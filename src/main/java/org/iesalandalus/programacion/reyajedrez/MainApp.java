package org.iesalandalus.programacion.reyajedrez;
import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reyajedrez.modelo.Rey;

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
                //
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


    public static void main(String[] args) {





        Consola.mostrarMenu();



        int opcionElegida = Consola.elegirOpcionMenu();
        Color colorElegido= Consola.elegirOpcion();
        Consola.mostrarMenuDirecciones();
        Direccion direccionElegida=Consola.elegirDireccion();
        Consola.despedirse();


    }
}

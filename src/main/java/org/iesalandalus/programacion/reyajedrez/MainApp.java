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
                //
                break;

            case 2:
                //
                break;

            case 3:
                //
                break;

            case 4:
                //
                break;

        }
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

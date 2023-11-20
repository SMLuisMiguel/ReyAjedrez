package org.iesalandalus.programacion.reyajedrez;
import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;
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

    public static void mostrarMenuDirecciones()
    {
        System.out.println("1:NORTE. \n2:NORESTE. \n3:ESTE. \n4:SURESTE. \n5:SUR. \n6:SUROESTE. \n7:OESTE. \n8:NOROESTE. \n9:ENROQUE_CORTO. \n10:ENROQUE_LARGO.");

    }
    public static Direccion elegirDireccion()
    {

        int menu;

        System.out.println("Introduce un numero");
        menu= Entrada.entero();


        while (menu<1 || menu>10)
        {
            System.out.println("Introduce un numero correcto");
            menu=Entrada.entero();
        }

        switch(menu)
        {
            case 1:
                return Direccion.NORTE;

            case 2:
                return Direccion.NORESTE;

            case 3:
                return Direccion.ESTE;

            case 4:
                return Direccion.SURESTE;

            case 5:
                return Direccion.SUR;

            case 6:
                return Direccion.SUROESTE;

            case 7:
                return Direccion.OESTE;

            case 8:
                return Direccion.NOROESTE;

            case 9:
                return Direccion.ENROQUE_CORTO;

            default:
                return Direccion.ENROQUE_LARGO;

        }

    }
}

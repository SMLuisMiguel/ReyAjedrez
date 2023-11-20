package org.iesalandalus.programacion.reyajedrez;
import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reyajedrez.modelo.Rey;

public class MainApp {

    private Rey rey;


    public static void main(String[] args) {





        Consola.mostrarMenu();



        int opcionElegida = Consola.elegirOpcionMenu();
        Color colorElegido= Consola.elegirOpcion();
        Consola.mostrarMenuDirecciones();
        Direccion direccionElegida=Consola.elegirDireccion();
        Consola.despedirse();


    }
}

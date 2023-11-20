package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Color;

public class MainApp {
    public static void main(String[] args) {

        Consola.mostrarMenu();



        int opcionElegida = Consola.elegirOpcionMenu();
        Color colorElegido= Consola.elegirOpcion();
        Consola.mostrarMenuDirecciones();


    }
}

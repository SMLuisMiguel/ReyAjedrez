package org.iesalandalus.programacion.reyajedrez.modelo;


//Creacion de clase Enum Color.
public enum Color {

    BLANCO("Blanco"),
    NEGRO("Negro");

    //Atributo String.
    private String cadenaAMostrar;


    //Constructor

   Color(String cadenaAMostrar)
    {
        this.cadenaAMostrar = cadenaAMostrar;
    }


    //Creaccion metodo ToString
    @Override
    public String toString()
    {
        return cadenaAMostrar;
    }
}


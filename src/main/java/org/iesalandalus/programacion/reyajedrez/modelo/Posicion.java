package org.iesalandalus.programacion.reyajedrez.modelo;

import java.util.Objects;

public class Posicion {
    //Declaracion de atributos.

    private int fila;

    private char columna;

    //Cosntructor.
    public Posicion(int fila, char columna)
    {
        setFila(fila);
        setColumna(columna);
    }
    //Constructor Copia.
    public Posicion(Posicion posicion)
    {
        fila = posicion.fila;
        columna = posicion.columna;
    }

    //Metodo Getter.
    public int getFila()
    {
        return fila;
    }

    //Metodo Setter con validacion.
    public void setFila(int fila)
    {
        if (fila >= 1 && fila <= 8)
        {
            this.fila = fila;
        }
        else
        {
            throw new IllegalArgumentException("La fila introducida no es correcta");
        }
    }
    //Metodo Getter.
    public char getColumna()
    {
        return columna;
    }

    //Metodo Setter.
    public void setColumna(char columna)
    {
        if (columna >= 'a' && columna <= 'h')
        {
            this.columna = columna;
        }
        else
        {
            throw new IllegalArgumentException("La columna introducida no es correcta.");
        }
    }

    //Metodo Equals.
    public boolean equals(Posicion p)
    {
        return fila == p.fila && columna == p.columna;
    }

    //Metodo HasCode
    @Override
    public int hashCode()
    {
        return Objects.hash(fila, columna);
    }

    //Metodo ToString.
    @Override
    public String toString()
    {
        return "Fila = "+ fila + "y columna = " + columna;
    }

}




package modelo;

public class Posicion {


    private int fila;

    private char columna;

    public Posicion(int fila, char columna)
    {
        setFila(fila);
        setColumna(columna);
    }


    public int getFila()
    {
        return fila;
    }

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

    public char getColumna()
    {
        return columna;
    }

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




}




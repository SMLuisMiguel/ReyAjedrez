package modelo;

public class Rey {
    private Color color;
    private Posicion posicion;
    private int totalMovimientos;


    public Color getColor()
    {
        return color;
    }

    private void setColor(Color color)
    {
        if (color != null)
        {
            this.color = color;
        }
        else
        {
            throw new NullPointerException("El color introducido no es el correcto");
        }
    }

    public Posicion getPosicion()
    {
        return posicion;
    }

    private void setPosicion(Posicion posicion)
    {
        if (posicion != null)
        {
            this.posicion = posicion;
        }
        else
        {
            throw new NullPointerException("La posicion introducida no es la correcta");
        }
    }
}


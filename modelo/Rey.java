package modelo;

public class Rey {
    private Color color;
    private Posicion posicion;
    private int totalMovimientos;

    //Constructor
    public Rey()
    {
        color=Color.BLANCO;
        posicion=new Posicion(1,'e');
    }

    //Constructor
    public Rey(Color color)
    {
        if (color==Color.BLANCO)
        {
            this.color=Color.BLANCO;
            posicion=new Posicion(1,'e');
        }
        else
        {
            this.color=Color.NEGRO;
            posicion=new Posicion(8,'e');
        }

    }

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


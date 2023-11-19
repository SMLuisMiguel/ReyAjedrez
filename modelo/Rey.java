package modelo;

import javax.naming.OperationNotSupportedException;

public class Rey {
    private Color color;
    private Posicion posicion;
    private int totalMovimientos;

    //Constructor
    public Rey()
    {
        totalMovimientos=0;
        setColor(Color.BLANCO);
        posicion=new Posicion(1,'e');
    }

    //Constructor
    public Rey(Color color)
    {
        totalMovimientos=0;
        if (color==Color.BLANCO)
        {
            setColor(Color.BLANCO);
            posicion=new Posicion(1,'e');
        }
        else
        {
            setColor(Color.NEGRO);
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

    public void mover(Direccion direccion) throws OperationNotSupportedException
    {
        if (direccion!=null)
        {
            Posicion posicion = getPosicion();
            OperationNotSupportedException exception = new OperationNotSupportedException("El movimiento no es valido");
            switch (direccion)
            {
                case NORTE:
                    if (posicion.getFila()<8)
                    {
                        Posicion posicionNueva= new Posicion(posicion.getFila() + 1, posicion.getColumna());
                        setPosicion(posicionNueva);
                        totalMovimientos+=1;
                    }
                    else
                    {
                        throw exception;
                    }
                    break;

                case NORESTE:
                    if(posicion.getColumna()<'h' && posicion.getFila()<8)
                    {
                        int valorLetra = posicion.getColumna();
                        valorLetra += 1;
                        Posicion posicionNueva= new Posicion(posicion.getFila()+1, (char) valorLetra);
                        setPosicion(posicionNueva);
                        totalMovimientos+=1;
                    }
                    else
                    {
                        throw exception;
                    }
                    break;

                case ESTE:
                    if(posicion.getColumna()<'h')
                    {
                        int valorLetra = posicion.getColumna();
                        valorLetra += 1;
                        Posicion posicionNueva= new Posicion(posicion.getFila(), (char) valorLetra);
                        setPosicion(posicionNueva);
                        totalMovimientos+=1;
                    }
                    else
                    {
                        throw exception;
                    }

                    break;

                case SURESTE:
                    if(posicion.getColumna()<'h' && posicion.getFila()>1)
                    {
                        int valorLetra = posicion.getColumna();
                        valorLetra += 1;
                        Posicion posicionNueva= new Posicion(posicion.getFila()-1, (char) valorLetra);
                        setPosicion(posicionNueva);
                        totalMovimientos+=1;
                    }
                    else
                    {
                        throw exception;
                    }
                    break;

                case SUR:
                    if(posicion.getFila()>1)
                    {
                        Posicion posicionNueva= new Posicion(posicion.getFila() -1, posicion.getColumna());
                        setPosicion(posicionNueva);
                        totalMovimientos+=1;

                    }
                    else
                    {
                        throw exception;
                    }

                    break;

                case SUROESTE:
                    if(posicion.getColumna()>'a' && posicion.getFila()>1)
                    {
                        int valorLetra = posicion.getColumna();
                        valorLetra -= 1;
                        Posicion posicionNueva= new Posicion(posicion.getFila()-1, (char) valorLetra);
                        setPosicion(posicionNueva);
                        totalMovimientos+=1;
                    }
                    else
                    {
                        throw exception;
                    }
                    break;

                case OESTE:
                    if(posicion.getColumna()>'a')
                    {
                        int valorLetra = posicion.getColumna();
                        valorLetra -= 1;
                        Posicion posicionNueva= new Posicion(posicion.getFila(), (char) valorLetra);
                        setPosicion(posicionNueva);
                        totalMovimientos+=1;
                    }
                    else
                    {
                        throw exception;
                    }
                    break;


                case NOROESTE:
                    if(posicion.getColumna()>'a' && posicion.getFila()<8)
                    {
                        int valorLetra = posicion.getColumna();
                        valorLetra -= 1;
                        Posicion posicionNueva= new Posicion(posicion.getFila()+1, (char) valorLetra);
                        setPosicion(posicionNueva);
                        totalMovimientos+=1;
                    }
                    else
                    {
                        throw exception;
                    }
                    break;

                case ENROQUE_CORTO:
                    if(totalMovimientos==0)
                    {
                        int valorLetra = posicion.getColumna();
                        valorLetra += 2;
                        Posicion posicionNueva= new Posicion(posicion.getFila(), (char) valorLetra);
                        setPosicion(posicionNueva);
                        totalMovimientos+=1;
                    }
                    else
                    {
                        throw exception;
                    }
                    break;

                case ENROQUE_LARGO:
                    if(totalMovimientos==0)
                    {
                        int valorLetra = posicion.getColumna();
                        valorLetra -= 2;
                        Posicion posicionNueva= new Posicion(posicion.getFila(), (char) valorLetra);
                        setPosicion(posicionNueva);
                        totalMovimientos+=1;
                    }
                    else
                    {
                        throw exception;
                    }
                    break;

            }

        }
        else
        {
            throw new NullPointerException("La direccion introducida no es la correcta");
        }
    }

}


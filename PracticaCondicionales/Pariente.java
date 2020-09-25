
public class Pariente
{
    private int unidades;
    private int decenas;;
    public Pariente(int numero)
    {
        decenas     = numero%10;
        numero      = numero/10;
        unidades    = numero%10;
    }

    public boolean pariente()
    { 
        boolean reporte;
        if(decenas%unidades==0 || unidades%decenas==0)
        {
            reporte = true;
        }
        else
        {
            reporte = false;
        }
        return reporte;
    }
}


public class NumeroCreciente
{
    private int unidades;
    private int decenas;
    private int centenas;
    public NumeroCreciente(int numero)
    {
        centenas    = numero%10;
        numero      = numero/10;
        decenas     = numero%10;
        numero      = numero/10;
        unidades    = numero%10;
    }

    public boolean creciente()
    {
        boolean reporte;
        if(unidades <= decenas && decenas <= centenas)
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

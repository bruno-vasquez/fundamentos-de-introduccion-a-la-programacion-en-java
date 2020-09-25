
public class Numero
{
    private int unidades;
    private int decenas;
    private int centenas;
    public Numero(int numero)
    {
        centenas    = numero%10;
        numero      = numero/10;
        decenas     = numero%10;
        numero      = numero/10;
        unidades    = numero%10;
    }

    public int getRaiz()
    {       
        return unidades;
    }
}

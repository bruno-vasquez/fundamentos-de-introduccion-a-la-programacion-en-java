

public class CajaMusical
{
    private String cancion1;
    private String cancion2;
    private String cancion3;
    private boolean pausa;
    public CajaMusical(String cancion1,String cancion2,String cancion3)
    {
        this.cancion1 = cancion1;
        this.cancion2 = cancion2;
        this.cancion3 = cancion3;
        this.pausa    = true;
    }
    public String reproducir()
    {
        String reporte;
        if(getEstado()==true)
        {
            reporte = "La Canción ha empezado a sonar";
            pausa = false;
        }
        else
        {
            reporte = "Ya está sonando una canciónr";
        }
        return reporte;
    }
    public String pausar()
    {
        String reporte;
        if(getEstado()==true)
        {
            reporte = "“La canción ya se encuentra en Pausa";
        }
        else
        {
            reporte = "La canción ha sido Pausada”";
            pausa = true;
        }
        return reporte;
    }
    public void cambiarCancion()
    {

    }
    public boolean getEstado()
    {
        return pausa; 
    }
}

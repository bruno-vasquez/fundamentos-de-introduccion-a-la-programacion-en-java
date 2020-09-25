
public class LibrumMemoriae
{
    private String tarea;
    private int contador;
    private boolean estado;
    
    LibrumMemoriae(String tarea)
    {
        this.tarea  = tarea;
        contador    = 0;
        estado      = false;
    }
    public boolean tareaConcluida()
    {
        return estado;        
    }
    public String concluirTarea()
    {
        String reporte;
        if(estado == true)
        {
            reporte = "No hay tarea en curso";
        }
        else
        {
            reporte = "concluida";
            estado = true;
            contador ++;
        }
        return reporte;
    }
    public String nuevaTarea(String nuevaTarea)
    {
        String reporte;
        if(estado == true)
        {
            reporte = "Nueva tarea asignada";
            estado = false;
        }
        else
        {
            reporte = "La tarea en curso,aún no ha sido concluida";
        }
        return reporte;       
    }
    public int getContador()
    {
        return contador;
    }
}

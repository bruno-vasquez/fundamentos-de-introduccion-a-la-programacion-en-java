public class Semaforo
{
    private String rojo, amarillo, verde, estado;
    int cont;
    public Semaforo()
    {
        rojo = "rojo";
        amarillo = "amarillo";
        verde = "verde";
        estado = "rojo";
    }
    
    public void cambiar()
    {
        if(cont == 0)
        {
            estado = "verde";
            cont += 1;
        }
        else if(cont == 1){
            estado = "amarillo";
            cont +=1;
        }
        else if(cont == 2)
        {
            estado = "rojo";
            cont = 0;
        }
    }
    
    public String colorActual()
    {
        String reporte = estado;
        return reporte;
    }
}
 
public class CopiaDeSeguridad
{
    String algoritmos()
    {
        String reporte;        
        reporte = "1.- recordar la capacidad de los cds en blanco 2.-recordar el peso de la información 3.-Dividir el peso de informacion entre la caṕacidad de los cds y hacer conversiones de ser necesario";
        return reporte;
    }
    double copiaDeSeguridad(boolean cds_mb, int capacidadCds, double informacion)
    {
        double informe;
        double convertirGb;
        if(cds_mb == true)
        {
            convertirGb = capacidadCds / 1024;
            informe = Math.ceil( informacion / convertirGb);
            
        }
        else
        {
            informe = informacion/capacidadCds;
        }
        return informe;
    }    
}

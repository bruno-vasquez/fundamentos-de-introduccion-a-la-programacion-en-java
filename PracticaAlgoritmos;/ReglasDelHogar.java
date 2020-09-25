
public class ReglasDelHogar
{
   String algoritmo()
   {
       String reporte;
       reporte = "1.- recordar las reglas de la casa 2.-realiza las operaciones";
       return reporte;
   }
   int reporte(int reglaDias)
   {
       int reporte;
       if(reglaDias/7==1)
       {
            reporte = reglaDias;
       }
       else
       {
            reporte = reglaDias * 7;
       }
       return reporte;
   }
}

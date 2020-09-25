 public class Insomnio
{
   String algoritmo()
   {
       String reporte;
       reporte = "1.- Recordar la hora en la que se durmio 2.-Recodar la hora a la que se desperto";
       return reporte;
   }
   int canciones()
   {
       int horaDurmio;
       horaDurmio = 2;
       int minDurmio;
       minDurmio = 45;     
       int horaDesperto;
       horaDesperto = 11;
       int minDesperto;
       minDesperto = 25;
       int horaDespertoMin;
       horaDespertoMin = horaDurmio * 60 + minDurmio;
       int horaDurmioMin;
       horaDurmioMin = horaDesperto * 60 + minDesperto;
       int respuesta;
       respuesta = horaDespertoMin - horaDurmioMin;
       return respuesta;
   }
}

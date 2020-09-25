 public class Youtuber
{
   String algoritmo()
   {
       String reporte;
       reporte = "1.- recordar lel tiempo del video 2.-Recodar la duracion de la cancion 3.- Hacer las operaciones";
       return reporte;
   }
   int canciones()
   {
       int tiempoMaximo;
       tiempoMaximo = 15;
       int segundosMaximos;
       segundosMaximos = tiempoMaximo*60;     
       int segundosMinimosCancion;
       segundosMinimosCancion = 150;
       int cancionesMaximas;
       cancionesMaximas = segundosMaximos/segundosMinimosCancion;
       return cancionesMaximas;
   }
}

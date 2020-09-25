

public class MaquinaDeVerificacion
{
   String algoritmo()
   {
       String reporte;
       reporte = "1.- recordar las reglas de salida 2.-Verificar el número de carnet 3.- Autorizar o rechazar el acceso";
       return reporte;
   }
   int autorizado(int carnet,String dia)
   {
       int ultimoDigito;
       ultimoDigito = carnet/10;
       ultimoDigito = carnet - (ultimoDigito * 10);
       return ultimoDigito;
   }
}

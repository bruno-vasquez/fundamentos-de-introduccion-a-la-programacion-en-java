
public class Autobus
{
   String algoritmo()
   {
       String reporte;
       reporte = "1.- recordar el valor del pase 2.-recordar el precio del boleto sin pase 3.- dividir el valor del pase entre el valor de los boletos para obtener el resultado ";
       return reporte;
   }
   double precio(int valorPase,double precioBoleto)
   {
       double resultado;
       resultado = valorPase / precioBoleto;
       return resultado;
   }
}

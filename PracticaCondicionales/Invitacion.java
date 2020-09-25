public class Invitacion
{
   private int dia;
   private int mes;
   private int año;

  
   public Invitacion(int dia, int mes, int año)
   {
       this.dia = dia;
       this.mes  = mes;
       this.año  = año;
   }
   public String Convertir()
   {
        String conversion;
        String mesEscrito;
         if(mes == 1)
         {
             mesEscrito = "Enero";
         }
         else if(mes == 2)
         {
            mesEscrito = "Febrero";
         }
         else if(mes == 3)
         {
            mesEscrito = "Marzo";
         }
         else if(mes == 4)
         {
            mesEscrito = "Abril";
         }
         else if(mes == 5)
         {
            mesEscrito = "Mayo";
         }else if(mes == 6)
         {
            mesEscrito = "Junio";
         }else if(mes == 7)
         {
            mesEscrito = "Julio";
         }
         else if(mes == 8)
         {
            mesEscrito = "Agosto";
         }
         else if(mes == 9)
         {
            mesEscrito = "Septiembre";
         }
         else if(mes == 10)
         {
            mesEscrito = "Octubre";
         }
         else if(mes == 11)
         {
            mesEscrito = "Noviembre";
         }
         else if(mes == 12)
         {
            mesEscrito = "Diciembre";
         }
         else
         {
            mesEscrito = "No es posible";
         }
         conversion = (dia + " de "+ mesEscrito +" de " + año);
         return conversion;
   }
}
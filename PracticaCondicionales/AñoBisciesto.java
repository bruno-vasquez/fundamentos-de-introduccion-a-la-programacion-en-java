
public class AñoBisciesto
{
private int año;
    public AñoBisciesto(int año)
    {
        this.año = año;
    }

   public boolean añoBisiesto()
   {
   boolean añoBis;
       if ((año % 4 == 0 && año % 100 != 0) || (año % 100 == 0 && año % 400 == 0))
       {
           añoBis = true;
       }
       else
       {
           añoBis = false;
       }
       return añoBis;
   } 
}

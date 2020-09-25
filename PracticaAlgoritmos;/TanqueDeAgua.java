
public class TanqueDeAgua
{    
    String algoritmo()
    {
        String reporte;
        reporte = "1.- recordar el llenado del agua 2.-recordar el vaciado de agua 3.- dividir el producto del llenado de agua por el vaciado de agua entre la resta del vaciado de agua menos el llenado de agua ";
        return reporte;
    }
    double TanqueAgua(double LlenadoAgua, double VaciadoAgua)
    {        
        double LlenadoTanque;
        LlenadoTanque= ((LlenadoAgua*VaciadoAgua)/(VaciadoAgua-LlenadoAgua));
        return LlenadoTanque;
    }
}
    


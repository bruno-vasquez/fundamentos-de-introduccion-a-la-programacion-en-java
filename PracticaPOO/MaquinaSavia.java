    
    
    public class MaquinaSavia
    {
        private int capacidadSavia;
        private int capacidadLagrimas;
        private boolean encendido;
        private int savia;
        private int lagrimas;
        public MaquinaSavia(int capacidadSavia,int capacidadLagrimas)
        {
            this.capacidadSavia     = capacidadSavia;
            this.capacidadLagrimas  = capacidadLagrimas;
            encendido          = false;
            savia              = 0;
            lagrimas           = 0;
        }
        public boolean apagar()
        {
           encendido = false;
           return encendido;
        }
        public boolean encender()
        {
            encendido = true;
            return encendido;
        }
        public String almacenar(int newsavia)
        {
            String reporte;
            if(encendido == true)
            {
            if(savia+newsavia>capacidadSavia)
            {
                reporte = "No puede realizar esa acción, espcio insuficiente";
            }
            else
            {
                reporte = "La acción ha sido completada con éxito";
                savia = savia + newsavia;
            }            
            }
            else
            {
                reporte = "la maquina esta apagada";
            }
            return reporte;
        }
        
        public String condensar()
        {
        String reporte;
        if(encendido == true)
        {
            if(savia <= 50)
            {
                if(lagrimas < capacidadLagrimas)
                {
                    savia = savia - 50;
                    lagrimas ++;
                    reporte = "La acción ha sido completada con éxito";
            
                }       
                else
                {
                    reporte = "No puede realizar esa acción, espacio insuficiente";
                }  
            }
                else
                {
                    reporte = "No puede realizar esa acción, espacio insuficiente";
                } 
            }   
                
        else
        {
            reporte = "la maquina esta apagada";
        }
        return reporte;     
    }
    
     String vaciarComponentes()
        {
            String reporte;
            savia = 0;
            lagrimas = 0;
            reporte = "accion realizada con exito";
            return reporte;
        }
}
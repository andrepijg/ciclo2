package co.edu.utp.misiontic2022.co.c2;

public class Exportacion {

    public static void main (String[]args){
        System.out.println(compararExportacion(12,1000,0.10));
    }
    
    private int pTiempo = 0;
    private double pCapital = 0;
    private double pInteres = 0;
    
    public static String compararExportacion (int pTiempo, double pCapital, double pInteres){
    double interesSimple = 0;
    double interesCompuesto = 0;
    double comparacion = 0;
    String respuesta = " ";
    
    interesSimple = pCapital * pInteres * pTiempo;
    interesCompuesto = pCapital *((Math.pow((1+pInteres),pTiempo))-1);
    
    comparacion = interesCompuesto - interesSimple; 
    
    if (pTiempo != 0 && pCapital != 0) {
        respuesta =  "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + comparacion;
        }else{
            respuesta = "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
        }
        
    // respuesta = pTiempo != 0 && pCapital != 0 && pInteres != 0  ? "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + comparacion : "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
    
    return respuesta;
    }
}

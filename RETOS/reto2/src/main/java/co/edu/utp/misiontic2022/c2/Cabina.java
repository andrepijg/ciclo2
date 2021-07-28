package co.edu.utp.misiontic2022.c2;

public class Cabina extends Equipaje {

    // Constantes

    private final double  TIEMPO = 2.0;

    // Constructores
    
    public Cabina() {
    }

    public Cabina(double pPeso, double pTamanio) {
        super(pPeso, pTamanio);
    }

    public Cabina(double pPrecioBase) {
        super(pPrecioBase);
    }

    // Método
    public double calcularPrecio(){
        double precioFinal = super.getPrecioBase() + (super.getPeso()*super.getTamanio()*TIEMPO);
        return precioFinal;
        }    
}

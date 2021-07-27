package co.edu.utp.misiontic2022.c2;

public class Bodega extends Equipaje {

    // Atributos
    private final double CAPACIDAD = 8.0;
    
    // Constructor

    public Bodega() {
    }

    public Bodega(double pPeso, double pTamanio) {
    super(pPeso, pTamanio);
    }

    public Bodega(double pPrecioBase) {
        super(pPrecioBase);
    }

    public double calcularPrecio(){
    double precioFinal = getPrecioBase() + (getPeso()*getTamanio()*CAPACIDAD);
    return precioFinal;
    }
}

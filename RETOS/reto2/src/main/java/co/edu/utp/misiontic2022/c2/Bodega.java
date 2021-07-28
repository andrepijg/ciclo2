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

    // método

    public double calcularPrecio(){
    double precioFinal = super.getPrecioBase() + (super.getPeso()*getTamanio()*this.CAPACIDAD);
    return precioFinal;
    }
}

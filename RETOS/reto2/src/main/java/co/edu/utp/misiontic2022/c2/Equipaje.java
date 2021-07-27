package co.edu.utp.misiontic2022.c2;

public class Equipaje {

    //Atributos 

    private static final double PESO = 10.0;
    private static final double TAMANIO = 4.5;
    private static final double PRECIO_BASE = 1000.0;
    private double peso;
    private double tamanio;
    private double precioBase;
    
    // Constructores
    
    public Equipaje() {
        this.peso = PESO;
        this.tamanio = TAMANIO;
        this.precioBase = PRECIO_BASE;
    }

    public Equipaje(double pPeso, double pTamanio) {
        this.peso = pPeso;
        this.tamanio = pTamanio;  
        this.precioBase = PRECIO_BASE;
    }

    public Equipaje(double pPrecioBase) {
        this.precioBase = pPrecioBase;
        this.tamanio = TAMANIO;  
        this.peso = PESO;
    }

    // Método

    public double calcularPrecio(){
        return 0.0;
    }
    // getters

    public double getPeso() {
        return peso;
    }

    public double getTamanio() {
        return tamanio;
    }

    public double getPrecioBase() {
        return precioBase;
    }

        

}
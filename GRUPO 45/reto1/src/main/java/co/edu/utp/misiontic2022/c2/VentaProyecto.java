package co.edu.utp.misiontic2022.c2;

public class VentaProyecto {

    //Atributos
    public int tiempo;
    public double monto;
    public double interes;
    
    public VentaProyecto(){
        this.tiempo = 0;
        this.monto = 0;
        this.interes = 0;
    }

    public VentaProyecto(int pTiempo, double pMonto, double pInteres){
    this.tiempo = pTiempo;
    this.monto = pMonto;
    this.interes =pInteres;
    }

    // Métodos
    public double calcularInteresSimple (){
        double interesSimple = this.monto * (this.interes/100)*tiempo;
        return Math.round(interesSimple);
    }

    public double calcularInteresCompuesto (){
        double interesCompuesto;
        double x = 1+(this.interes/100);
        double y = this.tiempo;
        interesCompuesto = this.monto * (Math.pow(x,y)-1);
        return Math.round(interesCompuesto);
}

// Firma sin parámetros de entrada
public String compararInversion(){
    double diferencia = this.calcularInteresCompuesto() - this.calcularInteresSimple();

    String respuesta = diferencia == 0 ? "No se obtuvo la diferencia entre las proyecciones, revisar los parámetros de entrada" : "La diferencia entre la proyección de interés compuesto e interes simple es: $ " +diferencia;
    
    return respuesta;
}

// Firma con los parámetros especificados
public String compararInversion(int pTiempo, double pMonto, double pInteres){
    //Primero cargo los atributos y luego hago la interaccion

this.tiempo = pTiempo;
this.monto = pMonto;
this.interes = pInteres;

// Aprovechar el comportamiento de comparación sobre atributos

return this.compararInversion();
}

// Comprobación --> realizar pruebas locales antes de subir

//Caso de prueba 1
public static void main(String[] args) {
VentaProyecto ventaConstruccion = new VentaProyecto();
System.out.println(ventaConstruccion.calcularInteresSimple());
System.out.println(ventaConstruccion.calcularInteresCompuesto());
System.out.println(ventaConstruccion.compararInversion(36, 200000, 5.0));


// Caso de prueba 2
VentaProyecto ventaConstruccion2 = new VentaProyecto(12,150000,2);
System.out.println(ventaConstruccion2.calcularInteresSimple());
System.out.println(ventaConstruccion2.calcularInteresCompuesto());
System.out.println(ventaConstruccion2.compararInversion());

// Caso de prueba 3
VentaProyecto ventaConstruccion3 = new VentaProyecto();
System.out.println(ventaConstruccion3.calcularInteresSimple());
System.out.println(ventaConstruccion3.calcularInteresCompuesto());
System.out.println(ventaConstruccion3.compararInversion());


}
}


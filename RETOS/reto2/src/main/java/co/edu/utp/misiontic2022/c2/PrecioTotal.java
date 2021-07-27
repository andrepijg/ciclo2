package co.edu.utp.misiontic2022.c2;

public class PrecioTotal {

    //Atributos

    private double totalPrecios = 0;
    private double totalBodega;
    private double totalCabina;
    public Equipaje[] equipaje;

    // constructores

    public PrecioTotal(double totalPrecios, double totalBodega, double totalCabina, Equipaje[] equipaje) {
        this.totalPrecios = totalPrecios;
        this.totalBodega = totalBodega;
        this.totalCabina = totalCabina;
        this.equipaje = equipaje;
    }

    public PrecioTotal(Equipaje[] equipaje) {
        this.equipaje = equipaje;
    }
    
    // Métodos

    // public void calcularTotales() {
    //     for (Equipaje equipaje1 : equipaje) {
    //     totalPrecios = totalPrecios + equipaje1.calcularPrecio();
    //         if (equipaje1 instanceof Bodega) {
    //                 totalBodega = totalBodega + equipaje1.calcularPrecio();
    //             } else {
    //                 totalCabina = totalCabina + equipaje1.calcularPrecio();
    //             }
    //         }
    //     }

    public void calcularTotales(){
        for (int i = 0; i <= (equipaje.length-1); i++) {
            totalPrecios = totalPrecios + equipaje[i].calcularPrecio();
            if (equipaje[i].getClass()==Bodega.class){
                totalBodega = totalBodega + equipaje[i].calcularPrecio();
            }else{
                totalCabina = totalCabina + equipaje[i].calcularPrecio();
                }
            }
        }
                
                

    public void mostrarTotales(){
        calcularTotales();
        System.out.println("Total Equipaje "+totalPrecios);
        System.out.println("Total Bodega "+totalBodega);
        System.out.println("Total Cabina "+totalCabina);
    }
}

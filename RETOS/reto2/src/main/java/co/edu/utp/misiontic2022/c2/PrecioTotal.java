package co.edu.utp.misiontic2022.c2;


public class PrecioTotal {

    //Atributos

    private double totalPrecios = 0;
    private double totalBodega;
    private double totalCabina;
    public Equipaje[] equipaje;

    //private ArrayList<Equipaje> equipaje = new ArrayList<Equipaje>();
    // constructores

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

    public PrecioTotal(Equipaje[] equipaje) {
        this.equipaje = equipaje;
    }
    
        public void calcularTotales(){
        for (int i = 0; i <= (equipaje.length-1); i++) {
            totalPrecios = totalPrecios + equipaje[i].calcularPrecio();
            if (equipaje[i].getClass()==Bodega.class){ //equipaje[i] instanceof Bodega
                totalBodega = totalBodega + equipaje[i].calcularPrecio();
            }else{
                totalCabina = totalCabina + equipaje[i].calcularPrecio();
                }
            }
        }
    
    // PARA ANALIZAR        
    // public void calcularTotales(){
    //     for (int i = 0; i < (this.equipaje.size()); i++) {
    //         totalPrecios = totalPrecios + this.equipaje.get(i).calcularPrecio();
    //         if (this.equipaje.get(i).getClass()==Bodega.class){
    //             totalBodega = totalBodega + this.equipaje.get(i).calcularPrecio();
    //         }else{
    //             totalCabina = totalCabina + this.equipaje.get(i).calcularPrecio();
    //             }
    //         }
    //     }

    public void mostrarTotales(){
        calcularTotales();
        System.out.println("Total Equipaje "+totalPrecios);
        System.out.println("Total Bodega "+totalBodega);
        System.out.println("Total Cabina "+totalCabina);
    }
}

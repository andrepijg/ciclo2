package co.edu.utp.misiontic2022.c2;

/**
 * Reto 2 - Precio Total!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    Equipaje equipaje[] = new Equipaje [5];
    equipaje[0] = new Bodega(100.0, 10.0);
    equipaje[1] = new Bodega(200);
    equipaje[2] = new Cabina(150,20.0);
    equipaje[3] = new Cabina();
    equipaje[4] = new Bodega();

    PrecioTotal solucion = new PrecioTotal(equipaje);

    solucion.mostrarTotales();
    }
}

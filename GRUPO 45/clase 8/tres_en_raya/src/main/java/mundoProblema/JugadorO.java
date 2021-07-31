package mundoProblema;

import java.util.ArrayList;

public class JugadorO extends Jugador {

    JugadorO(String pNombre, int pMovimientoLogico, String pMovimientoConsola){
        super(pNombre, pMovimientoLogico, 
        pMovimientoConsola);
    }

    public Casilla elegirCasillaID (Tablero tablero){
        Casilla casillaElegida = new Casilla ();

        ArrayList<Casilla> casillasLibres = tablero.obtenerCasillasVacias();
        casillaElegida = casillasLibres.get(casillasLibres.size()-1);
        return casillaElegida;

    }
    // Implementar el método abstracto pendiente (requisito)

    public void ejecutarEstrategiaEspecifica(Tablero tablero){

        // Jugador X busca la esquina superior izquierda (SI) del tablero que esté vacia.
        super.realizarJugada(this.elegirCasillaID(tablero), tablero);


    }
    
}

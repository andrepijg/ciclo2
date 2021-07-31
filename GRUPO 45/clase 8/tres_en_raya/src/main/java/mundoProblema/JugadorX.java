package mundoProblema;

import java.util.ArrayList;

public class JugadorX extends Jugador{

    // Atributos -> heredados
    public String nombreJugador;
    public int movimientoLogico;
    public String movimientoConsola;

    // Establecer nuevos constructores o consumir alguno de los constructores de la superclase (abstracta)

    // Constructores

    JugadorX(String pNombre, int pMovimientoLogico, String pMovimientoConsola){
        super(pNombre, pMovimientoLogico, pMovimientoConsola);
        }
    
    // Elige el jugador X en su estrategia propia elige la esquina superior izquierda 

    public Casilla elegirCasillaSI (Tablero tablero){
        Casilla casillaElegida = new Casilla ();

        ArrayList<Casilla> casillasLibres = tablero.obtenerCasillasVacias();
        casillaElegida = casillasLibres.get(0);
        return casillaElegida;

    }
    // Implementar el método abstracto pendiente (requisito)

    public void ejecutarEstrategiaEspecifica(Tablero tablero){

        // Jugador X busca la esquina superior izquierda (SI) del tablero que esté vacia.
        super.realizarJugada(this.elegirCasillaSI(tablero), tablero);


    }
    // Comportamientos (métodos)
    }





    


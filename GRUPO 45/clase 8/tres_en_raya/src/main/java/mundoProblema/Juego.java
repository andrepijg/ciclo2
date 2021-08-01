package mundoProblema;

import java.util.ArrayList;
import java.util.Date;

public class Juego {

    //Atributos
    private JugadorX jugadorX;
    private JugadorO jugadorO;
    private Tablero tablero;
    private boolean empate;
    private boolean ganador;
    private ValoresLogicos turnoActual; // Valor logico del jugador que tiene el turno actual
    private ValoresLogicos valorGanador;
    public Date momentoInicio;

    public Date momentoFin;

    // Constructores
    // Para que no se cambien los atributos X, O, 1, 10, que es el movimiento por consola y el movimiento lógico, se usan valores constante (enumeraciones)

    Juego(String pNombreJugadorO, String pNombreJugadorX){
        //Construir jugadores
        this.jugadorX = new JugadorX(pNombreJugadorX,ValoresLogicos.JUGADOR_X.getValorLogico(),ValoresConsola.JUGADOR_X.getValorConsola());

        this.jugadorO = new JugadorO(pNombreJugadorO,ValoresLogicos.JUGADOR_O.getValorLogico(),ValoresConsola.JUGADOR_O.getValorConsola());

    // Construir Tablero
    this.tablero = new Tablero();


    // Atributos que controlan el juego (estado inicial)
    this.empate = false;
    this.ganador = false;


    // Aleatoriamente elegir quien inicia la partida
    if(Math.random()>0.5){
        this.turnoActual = ValoresLogicos.JUGADOR_X; // JugadorO
    }else{
        this.turnoActual = ValoresLogicos.JUGADOR_O;
    }

    // Momento de inicio
    this.momentoInicio = new Date ();
}

    // Comportamientos

    // Si hay ganador

    // Quién juega?

    // Si el tablero está lleno y hay empate
    // El juego va extraer una fila, una columna, la diagonal o la diagonal contraria.

    // Extraer una fila en particular
    public ArrayList<Casilla> obtenerFila (int pFila){
        ArrayList<Casilla> fila = new ArrayList<Casilla>();

        // las estamos coleccionando en este arreglo
        for (int j = 0; j < Tablero.NUM_COLUMNAS; j++) {
        fila.add(this.tablero.casillas[pFila][j]);   
        }
    
        return fila;
        }

        public ArrayList<Casilla> obtenerColumna (int pColumna){
            ArrayList<Casilla> columna = new ArrayList<Casilla>();
    
            // las estamos coleccionando en este arreglo
            for (int i = 0; i < Tablero.NUM_FILAS; i++) {
            columna.add(this.tablero.casillas[i][pColumna]);   
            }
            return columna;
        }

        public ArrayList<Casilla> obtenerDiagonal (){
            ArrayList<Casilla> diagonal = new ArrayList<Casilla>();
    
            // las estamos coleccionando en este arreglo
            for (int i = 0; i < Tablero.NUM_FILAS; i++) {
            diagonal.add(this.tablero.casillas[i][i]);   
            }
            return diagonal;
        }

        public ArrayList<Casilla> obtenerDiagonalInvertida (){
            ArrayList<Casilla> diagonalInvertida = new ArrayList<Casilla>();
            int j = Tablero.NUM_COLUMNAS-1; // el numero total -1, lo pasamos a subindice
    
            // las estamos coleccionando en este arreglo
            for (int i = 0; i < Tablero.NUM_FILAS; i++) {
            diagonalInvertida.add(this.tablero.casillas[i][j]);
            j --; 
            }
            return diagonalInvertida;
        }

    //Sumatoria de una colección en general

    public int sumatoriaCasillas (ArrayList<Casilla>coleccion){
        int sumatoria = 0;
        for (Casilla casilla : coleccion) {
            sumatoria += casilla.getValorLogico();
        }
        return sumatoria;
    }

    //Sumatoria completa del tablero.

    public int sumatoriaTablero(){
        int sumatoriaTotal = 0;
        for (int i = 0; i < Tablero.NUM_FILAS; i++) {
            for (int j = 0; j < Tablero.NUM_COLUMNAS; j++) {
                sumatoriaTotal += this.tablero.casillas[i][j].getValorLogico();
            }
        }
        return sumatoriaTotal;
    }

    // Capacidad al juego para revisar el tablero y determinar en qué estado se encuentra.

    public ValoresLogicos revisarTablero(){

        // Obtener las sumatorias de las filas

        ArrayList<Integer> sumatoriaFilas = new ArrayList<Integer>();
        for (int i = 0; i < Tablero.NUM_FILAS; i++) {
            sumatoriaFilas.add(this.sumatoriaCasillas(this.obtenerFila(i)));
        }

        // Obtener las sumatorias de las columnas

        ArrayList<Integer> sumatoriaColumnas = new ArrayList<Integer>();
        for (int j = 0; j < Tablero.NUM_COLUMNAS; j++) {
            sumatoriaColumnas.add(this.sumatoriaCasillas(this.obtenerFila(j)));
        }

        // Obtener las sumatorias de la diagonal

        int sumatoriaDiagonal = this.sumatoriaCasillas(this.obtenerDiagonal());

        //Obtener sumatoria de la diagonal invertida
        int sumatoriaDiagonalInvertida = this.sumatoriaCasillas(this.obtenerDiagonalInvertida());

        //Obtener sumatoria total del tablero
        int sumatoriaTotal = this.sumatoriaTablero();

          //Ganador

        //Sí ganó el jugadorO        
        if( sumatoriaFilas.contains(ValoresLogicos.LINEA_JUGADOR_O.getValorLogico()) ||
            sumatoriaColumnas.contains(ValoresLogicos.LINEA_JUGADOR_O.getValorLogico()) ||
            sumatoriaDiagonal == ValoresLogicos.LINEA_JUGADOR_O.getValorLogico() ||
            sumatoriaDiagonalInvertida == ValoresLogicos.LINEA_JUGADOR_O.getValorLogico()
        ){
            return ValoresLogicos.JUGADOR_O;
        }

        //Si ganó el jugadorX        
        if( sumatoriaFilas.contains(ValoresLogicos.LINEA_JUGADOR_X.getValorLogico()) ||
            sumatoriaColumnas.contains(ValoresLogicos.LINEA_JUGADOR_X.getValorLogico()) ||
            sumatoriaDiagonal == ValoresLogicos.LINEA_JUGADOR_X.getValorLogico() ||
            sumatoriaDiagonalInvertida == ValoresLogicos.LINEA_JUGADOR_X.getValorLogico()
        ){
            return ValoresLogicos.JUGADOR_X;
        }

        //Hay empate
        if( sumatoriaTotal == ValoresLogicos.EMPATE_INICIANDO_O.getValorLogico() ||
            sumatoriaTotal == ValoresLogicos.EMPATE_INICIANDO_X.getValorLogico()
        ){
            return ValoresLogicos.PARTIDA_EMPATADA;            
        }

        //No hay ganador no hay empate
        return ValoresLogicos.SIN_GANADOR;
    }
    
    //Iniciar simulación de jugadores autónomos
    public void ejecutarJuego(){

        //Mainloop del juego
        while(true){
            
            //Quien tiene el turno juega
            if(this.turnoActual == ValoresLogicos.JUGADOR_O){
                this.jugadorO.ejecutarEstrategiaAleatoria(tablero);
            }else{
                this.jugadorX.ejecutarEstrategiaAleatoria(tablero);
            }

            //Visualización y no es comportamiento
            this.tablero.mostrarTableroConsola();

            //El juego revisando
            ValoresLogicos revision = this.revisarTablero();
            if(revision == ValoresLogicos.JUGADOR_O){                
                this.empate = false;
                this.ganador = true;
                this.valorGanador = ValoresLogicos.JUGADOR_O;
                this.momentoFin = new Date();
                System.out.println("Ha ganado el JugadorO ("+this.jugadorO.nombreJugador+")");
                break;
            }else if(revision == ValoresLogicos.JUGADOR_X){
                this.empate = false;
                this.ganador = true;
                this.valorGanador = ValoresLogicos.JUGADOR_X;
                this.momentoFin = new Date();
                System.out.println("Ha ganado el JugadorX ("+this.jugadorX.nombreJugador+")");
                break;
            }else if(revision == ValoresLogicos.PARTIDA_EMPATADA){
                this.empate = true;
                this.ganador = false;
                this.valorGanador = ValoresLogicos.SIN_GANADOR;
                this.momentoFin = new Date();
                System.out.println("Empate!!!!");
                break;
            }else if(revision == ValoresLogicos.SIN_GANADOR){                
                System.out.println("Sigue la partida!!");

            }            
            //Alternar turno
            if(this.turnoActual == ValoresLogicos.JUGADOR_O){
                this.turnoActual = ValoresLogicos.JUGADOR_X;
            }else{
                this.turnoActual = ValoresLogicos.JUGADOR_O;
            }
        }
    }
}


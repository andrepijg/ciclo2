package mundoProblema;

import java.util.ArrayList;
public class Tablero {
    
    //Atributos

    public static final int NUM_CASILLAS = 9;
    public static final int NUM_FILAS = 3;
    public static final int NUM_COLUMNAS = 3;
    public Casilla [][] casillas = new Casilla[NUM_FILAS][NUM_COLUMNAS];

    // Constructor

    // Recorrer toda la matriz de casillas 
    Tablero (){
        for (int i = 0; i < Tablero.NUM_FILAS; i++) {
            for (int j = 0; j < Tablero.NUM_COLUMNAS; j++) {
                casillas[i][j] = new Casilla (i,j); // Construir una casilla en cada pocisiónd de la matriz
            }
        }
    }

    // Métodos -> Comportamiento del tablero

    // Tablero entrega la colección de las casillas que están vacias

    public ArrayList <Casilla> obtenerCasillasVacias(){

        // Declarar la colección 
        ArrayList <Casilla> casillasLibres = new ArrayList<Casilla>();

        // Recorret todo el tablero
        for (int i = 0; i < Tablero.NUM_FILAS; i++) {
            for (int j = 0; j < Tablero.NUM_COLUMNAS; j++) {

                // Filtrar las casillas que están libres para retornarlas
                if (casillas[i][j].getLibre()){
                    casillasLibres.add(casillas[i][j]);}
            }
        }
        
        // Retornar colección de casillas Libres
        return casillasLibres;
    }

    // Indicar si está lleno o no el tablero -> Jugador, Juego

    public boolean estaLleno(){
        ArrayList<Casilla> casillasLibres = this.obtenerCasillasVacias();
        if (casillasLibres.isEmpty()) {
            return true; //Esta lleno porque casillasLibres no tiene elementos
        }else{
            return false; // Hay desde 1 hasta 9 posibles casillasLibres
        }
    }

    // Mostrar tablero en consola

    public void mostrarTableroConsola(){
    // Recorrer todo el tablero
    System.out.println();
    System.out.println();

        for (int i = 0; i < Tablero.NUM_FILAS; i++) {
            for (int j = 0; j < Tablero.NUM_COLUMNAS; j++) {
            System.out.print((casillas[i][j]).getValorConsola()+ " ");
            }
            System.out.println();
        }
    }
}


    








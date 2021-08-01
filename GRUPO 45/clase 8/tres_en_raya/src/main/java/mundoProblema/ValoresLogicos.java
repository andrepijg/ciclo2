package mundoProblema;

public enum ValoresLogicos {

    // Son valores o formas literales de representar los valores lógicas o valores por consola que van a ser constantes en nuestro programa.
    
    
    // Enumerar los valores lógicos de nuestro juego

    //Valores lógicos del JugadorX

    JUGADOR_X(10), LINEA_JUGADOR_X(30),

    // Valores lógicos del JugadorO
    JUGADOR_O(1), LINEA_JUGADOR_O(3),

    //Situaciones de empate
    EMPATE_INICIANDO_X(54), EMPATE_INICIANDO_O(45),
    //Indicar partida empatada
    PARTIDA_EMPATADA(1),
    //Tablero parcialmente lleno sin ganador
    SIN_GANADOR(0);

    //Atributo de la asociación

    private int valorLogico;

    // Constructor

    ValoresLogicos (int pValorLogico){
        this.valorLogico = pValorLogico;
    }

    // Getter
    public int getValorLogico() {
        return valorLogico;
    }

    
    // Obtener ese valor con el que se asoció esa constante simbólica


}

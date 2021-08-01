package mundoProblema;

public enum ValoresConsola {

    JUGADOR_X("X"), JUGADOR_O("O"); 

    //Atributo de la asociación

    private String valorConsola;

    // Constructor

    ValoresConsola (String pValorConsola){
        this.valorConsola = pValorConsola;
    }

    public String getValorConsola() {
        return valorConsola;
    }

        
}

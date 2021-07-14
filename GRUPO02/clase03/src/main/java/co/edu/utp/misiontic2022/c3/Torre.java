package co.edu.utp.misiontic2022.c3;

public class Torre extends Ficha {
    // Para poder hacer la herencia utilizo la palabra clave extends, Torre es la subclase de Ficha
    // En este caso no tiene atributos propios
    // la palabra reservada super quiere decir que viene de la super clase en este caso ficha
    
    
    // Atributo propio (manera de ejemplo)
    private double volumen;
    
    // Constructor
    // aca estoy heredando el color con la palabra Super

    public Torre (String color, double volumen){
        super(color);
        this.volumen = volumen;

    }

    // Sobre Carga - cuando al mismo método le paso varias variables
    // Sobre escritura - cuando uso el método más de una vez

    public String toString(){
        return "Torre --> Color: " + super.getColor() + "Volumen: " + volumen; // de la super clase quiero extraer el color
}
    public String mover(){
        return "Se mueve horizontal y vertical sin límite de casillas";
    }
}
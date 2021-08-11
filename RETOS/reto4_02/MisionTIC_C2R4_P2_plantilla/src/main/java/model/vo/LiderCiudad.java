package model.vo;


public class LiderCiudad {

    // private String nombre;
    // private String primerApellido;
    // private String segundoApellido;
    private String nombreLider;
    
    // Constructores
    
    

    public LiderCiudad() {
    
    }

    public LiderCiudad(String nombreLider) {
        // 
        this.nombreLider = nombreLider;
    }

    public String getNombreLider() {
        return nombreLider;
    }

    public void setNombreLider(String nombreLider) {
        this.nombreLider = nombreLider;
    }


}
package model.vo;


public class ProyectoCiudad {

    private String constructora;
    private String fecha_inicio;
    private String clasificacion;
    
    
    public ProyectoCiudad() {
    }


    public ProyectoCiudad(String constructora, String fecha_inicio, String clasificacion) {
        this.constructora = constructora;
        this.fecha_inicio = fecha_inicio;
        this.clasificacion = clasificacion;
    }


    public String getConstructora() {
        return constructora;
    }


    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }


    public String getFechaInicio() {
        return fecha_inicio;
    }


    public void setFechaInicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }


    public String getClasificacion() {
        return clasificacion;
    }


    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    
    
}

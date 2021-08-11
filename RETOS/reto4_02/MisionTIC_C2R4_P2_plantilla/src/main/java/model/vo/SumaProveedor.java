package model.vo;

public class SumaProveedor {

    private Integer cantidad;

    
    public SumaProveedor(){

    }
    

    public SumaProveedor(Integer cantidad) {
        this.cantidad = cantidad;
    }


    public Integer getCantidad() {
        return cantidad;
    }


    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    

}

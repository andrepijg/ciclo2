package co.edu.utp.misiontic2022.c2;

public class Nota {
    //1) Atributos ---> variables
    //privado es que una variable que solo la misma entidad (clase) tiene autoridad sobre ella -- encapsulado o protegido quién lo contiene, en este caso la entidad nota.

    private String nombre;
    private int escala100;
    private int codigo;
    private double escala5;
    private String cualitativo;


    //2) Métodos:
    // 2a) Constructores -> lógica de la construción de un objeto tipo nota.

Nota(){
    this.nombre = "Sin Nombre";
    this.escala100 = 0;
    this.escala5 = 0.0;
    this.cualitativo = "NA";
    }

    Nota(String pNombre){
        this.nombre = pNombre;
        this.escala100 = 0;
        this.escala5 = 0.0;
        this.cualitativo = "NA";
    }

    Nota(int a, int opcion){
        if(opcion == 1){
            //Construya de una forma (se refiere a la escala 100)
            this.nombre = "Sin nombre";
            this.escala100 = a;
            this.escala5 = (double)a / 20;
            
            if(a >= 60){
                this.cualitativo = "Aprobado";        
            }else{
                this.cualitativo = "Reprobado";
            }
    //Equivalente resumido del condicional anterior
            //this.cualitativo = pEscala100 >= 60 ? "Aprobado" : "Reprobado";
        }else{
            //Construya de otra forma (se refiere al código)
            this.codigo = a;
            this.nombre = "Sin nombre"; 
            this.escala100 = 0;
            this.escala5 = 0;
            this.cualitativo = "";

        }

    }

    //Alternativa diferenciando firmas
    Nota (int pCodigo, boolean cargaPorCodigo){
        this.codigo = pCodigo;
        this.nombre = "Sin nombre";
        this.escala100 = 0;
        this.escala5 = 0;
        this.cualitativo = "";   
        }

    Nota (int pEscala100){
        this.nombre = "Sin nombre";
        this.escala100 = pEscala100;
        this.escala5 = (double)pEscala100 / 20;

        //proporcionalidad de la escana
        // 100 -> 5
        // pEscala100 -> x 

        // x(100) = pEscala100 * 5.0
        // x = (pEscala100 * 5)/100
        // x = pEscala100 * 1/20

        if(pEscala100>=60){
            this.cualitativo = "Aprobado";
        }
        else{
            this.cualitativo = "Reprobado";
        }
        // Equivalente resultado del condicional anterior
        //this.cualitativo = pEscala >= 60 ? "Aprobado":"Reprobado"

    }

    Nota(String pNombre, double pEscala5){
        this.nombre = pNombre;
        this.escala5 = pEscala5;
        if (pEscala5 >= 2.95){
            this.cualitativo = "Aprobado";
        }
        else{
            this.cualitativo = "Reprobado";
        }
        this.escala100 = (int) pEscala5 * 20;
    }

    Nota(String pNombre,int pEscala100, double Pescala5,String pCualitativo){

    }
    //2b) Métodos que definen el comportamiento de la nota
    // Alcance(publico o privado) - Retorno (void, Strint, int) - nombre - (parámetros)
    public void mostrarNota(){
        System.out.println ("----Info Nota----");
        System.out.println ("Nombre -> "+this.nombre);
        System.out.println ("Escala100 -> "+this.escala100);
        System.out.println ("Escala5 -> "+this.escala5);
        System.out.println ("Cualitativo -> "+this.cualitativo);
        System.out.println ("Código -> "+this.codigo);

    }
    //2c)Getters -> Consultar los atributos de la clase.
    public int getCodigo() {
        return codigo;
    }

    public String getCualitativo() {
        return cualitativo;
    }

    public int getEscala100() {
        return escala100;
    }

    public double getEscala5() {
        return escala5;
    }
    public String getNombre() {
        return nombre;
    }    

    //2d)Setters -> Actualizar los atributos de la clase.
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCualitativo(String cualitativo) {
        this.cualitativo = cualitativo;
    }

    public void setEscala100(int escala100) {
        this.escala100 = escala100;
    }

    public void setEscala5(double escala5) {
        this.escala5 = escala5;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}


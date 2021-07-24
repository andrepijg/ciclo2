package mundoProblema;

public class Nota {
    
    //1) Atributos -> variable del paradigma anterior en contexto -> Entidad representada

    // privado es que solamente la entidad (clase) tiene acceso a la variable, las otras entidades o clases deben llamarla por medio del metodo get

    private String nombre;
    private int escala100;
    private double escala5;
    private String cualitativo;
    private int codigo;
    public static final int APROBADO_ESCALA100 = 60;
    public static final double APROBADO_ESCALA5 = 3.0;
    public String conceptoEvaluado;
    
    //2) Métodos -> Funciones anteriores, en contexto son el comportamiento del objeto

    //Tipos Métodos:

    //2a) Constructores -> es la lógica (algoritmo) de la construcción de un objeto de esta clase, en este caso tipo Nota.
    // Podemos tener varios constructores
    
    Nota(){
        this.nombre = "Sin nombre"; 
        this.escala100 = 0;
        this.escala5 = 0;
        this.cualitativo = "Sin calificación";
        this.conceptoEvaluado = "Concepto sin asignar";
        }

    Nota(String pNombre){
        this.nombre = pNombre; 
        this.escala100 = 0;
        this.escala5 = 0;
        this.cualitativo = "Sin Calificación";
        }
    
    Nota(int a, int opcion){
        if(opcion ==1){
            // Consstruya de una forma (se refiere a escala de 100)
        this.nombre = "Sin nombre";
        this.escala100 = a;
        this.escala5 = (double)a/20;
        
        this.conceptoEvaluado = "Concepto sin asignar";
        this.cualitativo = a>=APROBADO_ESCALA100 ? "Aprobado" :"Reprobado";
        }
        else {
            //Construya de otra forma (se refiere al código)
            this.codigo = a;
            this.nombre = "Sin nombre"; 
            this.escala100 = 0;
            this.escala5 = 0;
            this.cualitativo = "";
        }
    }

    // cuando hay dos firmas con el mismo tipo de dato, hay que meterle un machetazo, es decir otro parametro booleano, cambiando firmas.

        Nota(int pCodigo, boolean cargaPorCodigo){
            this.codigo = pCodigo;
            this.nombre = "Sin nombre"; 
            this.escala100 = 0;
            this.escala5 = 0;
            this.cualitativo = "Sin calificación";
            this.conceptoEvaluado = "Concepto sin asignar";
            }

        Nota(int pEscala100){
            this.nombre = "Sin nombre";
            this.escala100 = pEscala100;
            this.escala5 = (double)pEscala100 / 20;
        
            //Proporcionalidad para la escala
            // 100 -> 5.0
            // pEscala100 -> x
        
            // x(100) = pEscala100 * 5.0
        
            // x = (pEscala100 * 5.0) / 100
        
            // x = pEscala100 * 1/20
                
        if(pEscala100 >= 60){
            this.cualitativo = "Aprobado";        
        }else{
            this.cualitativo = "Reprobado";
        }
        
                //Equivalente resumido del condicional anterior
                //this.cualitativo = pEscala100 >= 60 ? "Aprobado" : "Reprobado";
                
            }

    Nota(String pNombre, double pEscala5){
        this.nombre = pNombre;
        this.escala5 = pEscala5;
        this.cualitativo = pEscala5>=APROBADO_ESCALA5 ? "Aprobado":"Reprobado";
        this.escala100 = (int)(pEscala5*20);

        }

    public Nota(String pNombre, int pEscala100){
        this.nombre = pNombre;
        this.escala100 = pEscala100;
        this.cualitativo = pEscala100>=APROBADO_ESCALA100 ? "Aprobado":"Reprobado";
        this.escala5 = (double)(pEscala100/20);
    
            }

        Nota(String pNombre, int pEscala100, double pEscala5, String pCualitativo){
        this.nombre = pNombre;
        this.escala100 = pEscala100;
        this.escala5 = pEscala5;
        this.cualitativo = pCualitativo;

        }
    
    // 2b) Métodos que definen el comportamiento particular de la nota

    //2b)Métodos que definen el comportamiento particular de la nota
    //alcance retorno nombre (parametros){}

    public void mostrarNota(){
        System.out.println("---InfoNota----");
        System.out.println("Nombre -> "+this.nombre);
        System.out.println("Escala100 -> "+this.escala100);
        System.out.println("Escala5 -> "+this.escala5);
        System.out.println("Cualitativo -> "+this.cualitativo);
        System.out.println("Codigo -> "+this.codigo);
    }

    //2c) Getters -> nos permite acceder a los atributos de la clase, por que nuestros atributos generalmente están privados. 

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
    
    //2d) Setters -> Actualizar los atributos de la clase.

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
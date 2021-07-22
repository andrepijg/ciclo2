package mundoProblema;

public class Nota {
    // Atributos -> variable del paradigma anterior en contexto -> Entidad representada
    public static final int APROBADO_ESCALA100 = 60;
    public static final double APROBADO_ESCALA5 = 3.0;
    public String conceptoEvaluado;
    private int escala100;
    private double escala5;
    private String cualitativo;

    // Métodos -> Funciones anteriores, en contexto son el comportamiento del objeto

    //Tipos Métodos:

    //1) Constructores -> es la lógica (algoritmo) de la construcción de un objeto de esta clase
    Nota(){
        this.conceptoEvaluado = "Concepto sin asignar";
        this.escala100 = 0;
        this.escala5 = 0;
        this.cualitativo ="Sin calificar";

    Nota(int pEscala100){
        this this.conceptoEvaluado = "Concepto sin asignar";
        this.escala100 = pEscala100;
        this.escala5 = 0;
        this.cualitativo ="Sin calificar";
    }
    }

    //2) Getters

    //3) Setters
}

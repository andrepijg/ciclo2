package mundoProblema;

public class Estudiante {

    // Atributos
    private String nombres;
    private String apellidos;
    private int codigo;

    // Constructores

    Estudiante(){
    this.codigo = 0;
    this.nombres = "Sin nombres asignados";
    this.apellidos = "Sin apellidos asignados";
}

Estudiante(int pCodigo, String pNombres, String pApellidos){
    this.codigo = pCodigo;
    this.nombres = pNombres;
    this.apellidos = pApellidos;
}

    // Métodos -> No hemos puesto lógica, pero está la posibilidad

    public void mostrarInfoEstudiante(){
        System.out.println("&&&&& Info del Estudiante &&&&&&&&&");
        System.out.println("Código ->"+codigo);
        System.out.println("Nombres ->"+nombres);
        System.out.println("Apellidos ->"+apellidos);
    }

    // Getters

    public int getCodigo() {
        return codigo;
    }
public String getApellidos() {
    return apellidos;
}

public String getNombres() {
    return nombres;
}
    //Setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
}

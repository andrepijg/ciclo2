package mundoProblema;

import java.util.ArrayList;

public class Materia{
    //Atributos

private String nombre;
private double promedio;
private double promedioAjustado;
private Nota nota1;
private Nota nota2;
private Nota nota3;
private Nota nota4;
private Nota nota5;

// Funcionalidades adicionales
private Nota peorNota;
private Nota mejorNota;
private Estudiante estudianteCursando; //Asociación

//Composición con cardinalidad
private ArrayList <Nota> coleccionNotas  = new ArrayList <Nota>();

    
    // Constructores
    // Tenemos una relación de composición - la materia contiene las notas.

    public Materia(){

        nombre = "Nombre sin asignar";
        promedioAjustado = 0.0;
        promedio = 0.0;
        nota1 = new Nota();
        nota2 = new Nota();
        nota3 = new Nota();
        nota4 = new Nota();
        nota5 = new Nota();
        peorNota = new Nota();            
        mejorNota = new Nota();
        estudianteCursando = new Estudiante();    
    }

    Materia(String pNombre, int n1, int n2, int n3, int n4, int n5){

        this.nombre = pNombre;

        // Construyen las notas de la materia

        this.nota1 = new Nota(n1);
        this.nota2 = new Nota(n2);
        this.nota3 = new Nota(n3);
        this.nota4 = new Nota(n4);
        this.nota5 = new Nota(n5);


        // Incializar los promedios
        this.promedio = 0;
        this.promedioAjustado = 0;
        
        // Inicializar peorNota
        this.peorNota = new Nota();

        //Inicializar estudiante
        this.estudianteCursando = new Estudiante();
    }


    // Constructor que refleja la asociación con la clase Estudiante
    
    public Materia(Estudiante pEstudianteCursando, String pNombre, int n1, int n2, int n3, int n4, int n5){

    this.nombre = pNombre;

    // Construyen las notas de la materia

        this.nota1 = new Nota(n1);
        this.nota2 = new Nota(n2);
        this.nota3 = new Nota(n3);
        this.nota4 = new Nota(n4);
        this.nota5 = new Nota(n5);

        // Coleccionar las notas para tener una cardinalidad variable (muchas)

        coleccionNotas.add(this.nota1);
        coleccionNotas.add(this.nota2);
        coleccionNotas.add(this.nota3);
        coleccionNotas.add(this.nota4);
        coleccionNotas.add(this.nota5);

        // Incializar los promedios
        this.promedio = 0;
        this.promedioAjustado = 0;
        
        // Inicializar peorNota
        this.peorNota = new Nota();

        //Asignación del estudiante
        this.estudianteCursando = pEstudianteCursando; // Asociación

        
    }

    // Métodos Generales

    public void mostrarMateria(){
        System.out.println(); // Línea en blanco
        System.out.println();
        System.out.println("******Materia******\n" +this.nombre);
        // this.nota1.mostrarNota();
        // this.nota2.mostrarNota();
        // this.nota3.mostrarNota();
        // this.nota4.mostrarNota();
        // this.nota5.mostrarNota();

        for (Nota nota : coleccionNotas) {
            nota.mostrarNota();
        }
    
        System.out.println("Peor Nota: ");
        this.peorNota.mostrarNota();
        
        System.out.println("Promedio Ajustado: "+this.promedioAjustado);
        this.estudianteCursando.mostrarInfoEstudiante();
        

    }

    // Obtener peor Nota

    public void obtenerPeorNota(){
        //Suponemos que la peor nota
        this.peorNota = this.nota1;
        //Las demás comparaciones
        if(this.nota2.getEscala100() < peorNota.getEscala100() ){
            this.peorNota = nota2;
        }
        if(this.nota3.getEscala100() < peorNota.getEscala100() ){
            this.peorNota = nota3;
        }
        if(this.nota4.getEscala100() < peorNota.getEscala100() ){
            this.peorNota = nota4;
        }
        if(this.nota5.getEscala100() < peorNota.getEscala100() ){
            this.peorNota = nota5;
        }
    }
    
    public void obtenerPeorNotaColeccion(){
        //Suponemos que la peor nota es la primera de la coleccion

        this.peorNota = this.coleccionNotas.get(0);
        
        //Revisar toda la colección para dejar en el atributo peorNota de materia la incumbente - es el mejor valor que ha obtenido para mi criterio de búsqueda, entonces lo deseable es encontrar la nota más bajita.

        for (int i = 1; i < this.coleccionNotas.size(); i++) {
            if (this.coleccionNotas.get(i).getEscala100()<this.peorNota.getEscala100()) {
                this.peorNota = this.coleccionNotas.get(i);
            }
        }
    }
    
    // Requerimiento
    // no retorna nada por que el valor queda almacenado en la variable que tenemos en la parte de los atributos
    
    public void calcularPromedioAjustado(){

    //Obtener la peor de las notas (carga en el atributo)
    this.obtenerPeorNota();

    // Calculo del promedio ajustado
    this.promedioAjustado = ((nota1.getEscala5() + nota2.getEscala5() + nota3.getEscala5() +nota4.getEscala5() +nota5.getEscala5())-peorNota.getEscala5())/4;

} 
    public void calcularPromedioAustadoColeccion(){

    // Obtener la peor de las notas de la colección
    this.obtenerPeorNotaColeccion();

     // Calculo del promedio ajustado
    this.promedioAjustado = 0;
    
    for (Nota nota : coleccionNotas) {
        this.promedioAjustado += nota.getEscala5();
    } 
    
    this.promedioAjustado = (this.promedioAjustado - peorNota.getEscala5()) / (this.coleccionNotas.size()-1);
    }
    
// Adicionar nota a la materia

public void adicionarNota(int pEscala100){

    // Construir la nota
    Nota nuevaNota = new Nota(pEscala100);

    // Agregar a la colección de notas

    this.coleccionNotas.add(nuevaNota);

    // Equivalente en una sola linea
    //this.coleccionNotas.add(new Nota(pEscala100));

} 

public void adicionarNota(int pEscala100, String pNombre){

    // Construir la nota
    Nota nuevaNota = new Nota(pNombre,pEscala100);

    // Agregar a la colección de notas

    this.coleccionNotas.add(nuevaNota);

    // Equivalente en una sola linea
    //this.coleccionNotas.add(new Nota(pEscala100));

} 

    
public void generarMensajePromedioAjustado(){
    System.out.println("El promedio ajustado es "+ this.promedioAjustado);
}

//Asignar nombres a las notas

public void asignarNombresNotas (String nom1, String nom2,String nom3, String nom4, String nom5){
    this.nota1.setNombre(nom1);
    this.nota2.setNombre(nom2);
    this.nota3.setNombre(nom3);
    this.nota4.setNombre(nom4);
    this.nota5.setNombre(nom5);
}
    // Getters

    public Nota getPeorNota() {
        return peorNota;
    }

    public double getPromedioAjustado() {
        return promedioAjustado;
    }

    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
public void setNota5(Nota nota5) {
    this.nota5 = nota5;
}
}

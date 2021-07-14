package co.edu.utp.misiontic2022.c2;

public class Materia {

//Atributos
String nombre;
double promedioAjustado;
double promedio;
Nota nota1; // La clase va a tener la responsabilidad de llamar las notas
Nota nota2;
Nota nota3;
Nota nota4;
Nota nota5;
// funcionalidades adicionales
Nota peorNota;
Nota mejorNota;

//Constructores 
//Las notas no pueden existir sueltas, en uno de los métodos de materia se construyen las notas
//La nota se la crea en la materia


Materia(String pNombre, int n1, int n2, int n3, int n4, int n5){
    
    this.nombre =pNombre;

    // Construyen las notas de la materia
    this.nota1 = new Nota(n1);
    this.nota1 = new Nota(n2);
    this.nota1 = new Nota(n3);
    this.nota1 = new Nota(n4);
    this.nota1 = new Nota(n5);

    // Inicializar peorNota
    this.peorNota = new Nota();

    // Inicializar promedios
    this.promedio = 0;
    this.promedioAjustado =0;
}

//Métodos generales

public void mostrarMateria(){
    System.out.println ("****** Materia *******");
    this.nota1 = new Nota();
    this.nota2 = new Nota();
    this.nota3 = new Nota();
    this.nota4 = new Nota();
    this.nota5 = new Nota();
    System.out.println("Peor Nota: ");
    this.peorNota.mostrarNota();
    System.out.println("Promedio Ajustado " + promedioAjustado);
} 
public void obtenerPeorNota(){
    // Suponemos que la peor nota
    this.peorNota = this.nota1;
    //demás comparaciones
    if(this.nota2.getEscala100() < peorNota.getEscala100()){
        this.peorNota =nota2;    
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

// Requerimiento
// La información se guardan en los atributos
public void calcularPromedioAjustado(){
        
    //Obtener la peor de las notas (carga en el atributo)
    this.obtenerPeorNota();

    //Cálculo del promedio ajustado
    this.promedioAjustado = (nota1.getEscala5()+nota2.getEscala5()+nota3.getEscala5()+nota4.getEscala5()+nota5.getEscala5()-peorNota.getEscala5())/4;        
    
}

public void generarMensajeProedioAjustado(){
    System.out.println("El promedio ajustado es: "+this.promedioAjustado);
}

//Getters
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


}

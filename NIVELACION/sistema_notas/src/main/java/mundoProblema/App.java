package mundoProblema;

// Acá es donde se ejecuta mi código
//Sistema de notas 

public class App 
{
    public static void main( String[] args ){
    //      // Probar nuestra clase nota
    //     Nota nota1 = new Nota("Taller 2");
    //     // Observar el contenido
    //     //System.out.println(nota1);

    // // Utilizar un comportamiento de la clase -> mostrar sus atributos formateados (organizar en casillas) en consola.
    // //nota1.mostrarNota();

    // // Construir segunda nota aprovechando otro comportamiento de construcción -> Requerimiento

    // // int calificacionEscala100 = 69;
    // // Nota nota2 = new Nota (calificacionEscala100);
    // // nota2.mostrarNota();
    
    // //Ejemplo constructor con código
    // Nota notaEjemploFirmas = new Nota (34688,true);

    // notaEjemploFirmas.mostrarNota();
    
    // // Ejemplo constructor con código utilizando opcion 

    // Nota notaEmpleandoOpcion = new Nota(45678,0);
    // notaEmpleandoOpcion.mostrarNota();

    // //Ejemplo constructor nota en escala de 100 utilizando opción

    // Nota notaOpcion100 = new Nota(44,1);
    // notaOpcion100.mostrarNota();


    // // Ejemplo Pedro Miguel

    // double calificacionPedro = 4;
    // Nota notaPedro = new Nota ("Taller Pedro",(double)4);
    // notaPedro.mostrarNota();

    // // otra forma sería
    // // Nota notaPedro = new Nota ("Taller Pedro",calificacionPedro);

    // // crear una nota para mostrar la funcionalidad de los getters y los setters

    // // quiero conocer el valor de nota pedro en escala de 100

    // System.out.println("Solamente el contenido del atributo escala100 -> "+notaPedro.getEscala100());


    // //Actualizar el nombre de una nota que ya está creada
    // notaOpcion100.setNombre("Nombre Actualizado Nota100");
    // notaOpcion100.mostrarNota();

    //Probar la clase Materia (Orientadoo al requerimiento)
    Materia materia = new Materia("FundamentosProg",40,50,39,76,96);
    materia.mostrarMateria();

    //Utilizar comportamientos de materia para alcanzar el objetivo
    materia.obtenerPeorNota();
    materia.calcularPromedioAjustado();
    materia.generarMensajePromedioAjustado();

    //Mostrar la materia después del proceso
    materia.mostrarMateria();

    // En un contexto externo 

    System.out.println("Peor nota obtenida desde un contexto externo: ");
    materia.getPeorNota().mostrarNota();


    // Mostrar modificación de nombres de notas desde el contexto de la materiass
    System.out.println("Nueva versión de la materia:");
    materia.asignarNombresNotas("Reto1", "Foro2", "Reto4", "Taller de Objetos", "MVC");
    materia.mostrarMateria();

// Modificar la quinta nota de la materia, que está encapsulada a traves del setter. -> la quinta nota es 10
//Nota nuevaNota5 = new Nota(10);
// materia.setNota5(nuevaNota5);

materia.setNota5(new Nota(10));
materia.mostrarMateria();


// Crear Estudiante y reflejara asociación
Estudiante estudianteInstanciando = new Estudiante(12345, " Andrea del Pilar", " Jaramillo Garzón");
Materia materiaAsociadaEstudiante = new Materia(estudianteInstanciando,"Fundamentos Programación",40,50,39,76,96);
materiaAsociadaEstudiante.obtenerPeorNota();
materiaAsociadaEstudiante.calcularPromedioAjustado();
materiaAsociadaEstudiante.mostrarMateria();

}
}
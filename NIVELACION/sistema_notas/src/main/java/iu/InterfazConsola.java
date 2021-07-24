package iu;

// Traer claes del mundo del problema (nuestro modulamiento)

import mundoProblema.Materia;
import java.util.Scanner;
import mundoProblema.Estudiante;
import mundoProblema.Nota;

public class InterfazConsola {

    // Atributos

    private Materia materia;
    private Estudiante estudiante;

    // Constructores 

    InterfazConsola(){
        this.materia = new Materia();
        this.estudiante = new Estudiante();

    }

    // Métodos

    // Ejecutar en main loop de la aplicación
    public int menuPrincipal(){
        System.out.println();
        System.out.println();
        System.out.println("-----Menú Principal ------");
        System.out.println("1. Registrar Estudiante");
        System.out.println("2. Registrar Info Materia");
        System.out.println("3. Mostrar Promedio Ajustado");
        System.out.println("4. Mostrar info materia");
        System.out.println("5. Mostrar Info Estudiante");
        System.out.println("6. Adicionar Nota");
        System.out.println("7. Salir");
        System.out.print("Ingresar Opción: ");

        Scanner sc = new Scanner (System.in);
        int opcionIngresada = sc.nextInt();
        return opcionIngresada;

    }

    public void registrarEstudiante(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingrese el código del Estudiante: ");
        int pCodigo = sc.nextInt();
        sc.nextLine(); // manejar el movimento de carro que no fue interpretado por nextInt(Enter)
        System.out.print("Ingrese los nombres del Estudiante: ");
        String pNombres = sc.nextLine();
        System.out.print("Ingrese los Apellidos del Estudiante: ");
        String pApellidos = sc.nextLine();
        
        // Instancia la información recogida y la carga en la aplicación (Interface)
        this.estudiante = new Estudiante(pCodigo, pNombres, pApellidos);
    }

    public void registrarMateria(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingrese el nombre de la materia: ");
        String pNombreMateria = sc.nextLine(); 
        System.out.print("Ingrese Nota 1 (Escala de 100): ");
        int pNota1 = sc.nextInt();
        sc.nextLine(); // manejar el movimento de carro que no fue interpretado por nextInt(Enter)
        System.out.print("Ingrese Nota 2 (Escala de 100): ");
        int pNota2 = sc.nextInt();
        sc.nextLine(); // manejar el movimento de carro que no fue interpretado por nextInt(Enter)
        System.out.print("Ingrese Nota 3 (Escala de 100): ");
        int pNota3 = sc.nextInt();
        sc.nextLine(); // manejar el movimento de carro que no fue interpretado por nextInt(Enter)
        System.out.print("Ingrese Nota 4 (Escala de 100): ");
        int pNota4 = sc.nextInt();
        System.out.print("Ingrese Nota 5 (Escala de 100): ");
        int pNota5 = sc.nextInt();
        sc.nextLine(); // manejar el movimento de carro que no fue interpretado por nextInt(Enter)

        //Instanciar con la información recogida
        this.materia = new Materia(this.estudiante , pNombreMateria, pNota1, pNota2, pNota3, pNota4, pNota5);

    }

    public void mostrarPromedioAjustadoColeccion(){
        
        // Calcular el promedio ajustado de la colección
        this.materia.calcularPromedioAustadoColeccion();

        //Estando listo ese promedio, preparar el mensaje de salida

        System.out.println("El promedio ajustado del estudiante: "+this.estudiante.getCodigo()+ " es: "+this.materia.getPromedioAjustado());

    }

    public void registrarNota(){
        
        // Formulario (interaccion con el usuario)
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingrese el nombre de la nota: ");
        String pNombre = sc.nextLine(); 
        System.out.print("Ingrese calificación (Escala de 100): ");
        int pEscala100 = sc.nextInt();
        sc.nextLine(); // manejar el movimento de carro que no fue interpretado por nextInt(Enter)

        // Consumo de la lógica o del mundo que hemos modelado
    
        this.materia.adicionarNota(pEscala100, pNombre);
    }


    public void ejecutarMainLoop(){

        boolean continuar = true;


        while (continuar) {
        // Aloja la ejecución de la aplicación 

        int opcion = menuPrincipal();
        if (opcion ==1) {
            //Llamado al registro del estudiante
            this.registrarEstudiante();
            
        }else if (opcion ==2 ){
            // Llamado al registro de la materia
            this.registrarMateria();

        }else if(opcion ==3){
            // Presentar promedio ajustado
            this.mostrarPromedioAjustadoColeccion();

        }else if(opcion ==4){
            //  Mostrar info de la materia
            this.materia.mostrarMateria();

        }else if(opcion ==5){
            // Llamado a mostrar info del estudiante
            this.estudiante.mostrarInfoEstudiante();

        }else if(opcion ==6){
            // Llamado Adicionar nota
            this.registrarNota();
            

        }else if(opcion ==7){
            continuar = false;
            System.out.println("Salida exitosa");

        }else{
            System.out.println("Opción Invalida!");
        }
        
        }
    }
    
    public static void main(String[] args) {
        
        // Creamos la aplicación en versión consola
        InterfazConsola interfaz = new InterfazConsola();

        //Iniciamos la aplicación
        interfaz.ejecutarMainLoop();
    }
}

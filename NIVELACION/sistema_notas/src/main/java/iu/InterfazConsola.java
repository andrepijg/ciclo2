package iu;

import mundoProblema.Materia;

import java.util.Scanner;

import mundoProblema.Estudiante;


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
        System.out.println("3 Mostrar Promedio Ajustado");
        System.out.println("4. Mostrar info materia");
        System.out.println("5. Mostrar Info Estudiante");
        System.out.println("6. Adicionar Nota");
        System.out.println("6. Salir");
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
        
        // Instancia la informaación recogida y la carga en la aplicación (Interface)
        this.estudiante = new Estudiante(pCodigo, pNombres, pApellidos);
    }

    public void ejecutarMainLoop(){

        boolean continuar = true;


        while (continuar) {
        // Aloja la ejecución de la aplicación 

        int opcion = menuPrincipal();
        if (opcion ==1) {
            //Llamado al registro del estudiante
            this.registrarEstudiante();
            
        }else if (opcion == 2){
            // Llamado al registro de la materia
            System.out.println("En Construcción!!");
        }else if(opcion ==3){
            // Llamado a mostrar info del estudiante
            this.estudiante.mostrarInfoEstudiante();
        }else if(opcion ==4){
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

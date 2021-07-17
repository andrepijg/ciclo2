package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;
// paradigma procedural estructurado no es objetos

public class PromedioNotas {
    //Paso a paso -> algoritmo
    // 1) Recoger la información: código del estudiante y las cinco notas
    // 2) Identificar cual es la peor notas
    // 3) Hallar el promedio ajustado
    // 4) Realizar la conversión de escala de 0 a 5
    // 5) Reportar ese promedio ajustado con el formato indicado
    // 

    //Funciones que resuelven el problema -> modularizado
    // 1. alcance --> public static
    // 2. tipo de retorno --> int
    // 3. entre llaves argumentos -->

    // alcance tipo_de_retorno nombreFuncion {argumentos}
    public static int obtenerPeorNota(int nota1, int nota2, int nota3, int nota4, int nota5){
    
    // debemos declarar todas las variables
    int peorNota;
    // Inicializar
    peorNota =nota1;

    //comparación una por una con las demás -> condicionales no excluyentes

    if(peorNota>nota2){
        peorNota = nota2;
    }

    if(peorNota>nota3){
        peorNota = nota3;
    }

    if(peorNota>nota3){
        peorNota = nota3;
    }

    if(peorNota>nota4){
        peorNota = nota4;
    }

    if(peorNota>nota4){
        peorNota = nota4;
    }

    return peorNota;

}

//3)Hallar el promedio ajustado (descartar la peor de las notas) -> 0 a 5 (decimal)

public static double calcularPromedioAjustado (int nota1, int nota2, int nota3, int nota4, int nota5){

    int peorNota = obtenerPeorNota(nota1, nota2, nota3, nota4, nota5);

    int sumatoria = 0;
    
    double promedioAjustado = 0;

    sumatoria = (nota1 + nota2 + nota3 + nota4 + nota5) - peorNota;

    promedioAjustado = (double)sumatoria/4;

    return promedioAjustado;
}

// 4) Conversión escala de 100 a escala de 5

public static double convertirEscala5(double calificacion100){

return (calificacion100/20); //regla de 3 si 100 = a 5 cuanto sería 5
}
    
//5) Reportar ese promedio ajustado con el formato indicado
// no retornamos nada, por eso es vacío

public static void reportarPromedioAjustado(String codigo, double promedioAjustado){
    System.out.println("El promedio ajustado del estudiante" +codigo+ " es:" +promedioAjustado);
}
    //Sección principal o punto de entrada para consumir estas funciones

    public static void main(String[] args) {
        
    //1) Recoger la información: código del estudiante y las 5 notas.

    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el código del estudiante: ");
    String codigoEstudiante = sc.nextLine();
    System.out.println("Ingrese nota 1: ");
    int nota1 = sc.nextInt();

    System.out.println("Ingrese nota 2: ");
    int nota2 = sc.nextInt();

    System.out.println("Ingrese nota 3: ");
    int nota3 = sc.nextInt();

    System.out.println("Ingrese nota 4: ");
    int nota4 = sc.nextInt();

    System.out.println("Ingrese nota 5: ");
    int nota5 = sc.nextInt();

    // Ejecutar las funciones -> al paso 3 (internamente realiza el paso 2)

    double promedioAjustado = convertirEscala5(calcularPromedioAjustado(nota1, nota2, nota3, nota4, nota5)) ;

    // Reportar el resultado
    //reportarPromedioAjustado(codigoEstudiante, Math.round(promedioAjustado)) -> redondeo


    reportarPromedioAjustado(codigoEstudiante, promedioAjustado);
    }
}

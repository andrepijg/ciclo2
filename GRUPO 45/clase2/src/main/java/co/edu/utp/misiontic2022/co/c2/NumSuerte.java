package co.edu.utp.misiontic2022.co.c2;

import java.util.Scanner;

//Algoritmo -> paso a paso
//1) Obtener la fecha en formato Stritn (Cadena DD/MM/AA)
//2) Separar los días, los meses y el año y los almacenamos
//3) Convertir días, meses y años a números
// 4) sumamos los días, meses y años y lo almacenamos en una variable
// 5) Separamos las cifras del número
// 6) Sumamos las cifras del número del paso cinco
// 7) Retornamos el número de la suerte que es el resultado de la suma.


//Funciones de interacción ( Interfaz -> recogemos datos y hacemos reportes o mensajes en consola)

public class NumSuerte {

    public static String leerFecha(){
        // Equivalencia python
        //print ("App....")
        // fecha = input("ingrese la fecha")
        // return fecha

        System.out.println("App del Número de la suerte!");
        System.out.println("Ingrese la fecha dd/mm/aaaa: ");
        Scanner lector = new Scanner (System.in);
        String fecha;
        fecha = lector.nextLine();
        return fecha;
    }

        public static void presentarResultado(int numeroSuerte){
            System.out.println("El número de la suerte es: " +numeroSuerte);
        }
//Lógica
//Declaración del método o función en Python
// def numeroSuerte(fechaNacimiento):
//     pass

//Función o método
    public static int numeroSuerte(String fechaNacimiento){

    //2) Separar los días, los meses y el año y los almacenamos
    String[] partesFecha = fechaNacimiento.split("/",5);

    //3) Convertir días, meses y años a números
    //parseInt -> Convierte (parsea) un argumento de tipo cadena y devuelve un entero de la base especificada.

    int valorDias = Integer.parseInt(partesFecha[0])
    ;
    int valorMeses = Integer.parseInt(partesFecha[1]);int valorAño = Integer.parseInt(partesFecha[2]);

    // 4) sumamos los días, meses y años y lo almacenamos en una variable

    int sumaPartes = valorDias + valorMeses + valorAño;
    

    // 5) Separamos las cifras del número
    String sumaTexto = sumaPartes + "";

    // 6) Sumamos las cifras del número del paso cinco

    //Guía con equivalente en python
    // sumatoriaCifras = 0
    // for i in range(len(sumaTexto)):
    //     sumatoriaCifras += sumaTexto[i]

    int sumatoriaCifras = 0;
    
    for (int i = 0; i < sumaTexto.length(); i++) {
        
        // forma genérica 
        //sumatoriaCifras = sumaCifras + Character.getNumericValue(sumaTexto.charAt(i));

        //forma resumida
        sumatoriaCifras+= Character.getNumericValue(sumaTexto.charAt(i));
    }
    return sumatoriaCifras;

    // 7) Retornamos el número de la suerte que es el resultado de la suma.

    }

    public static void main(String[] args) {
        //Donde se va a ejecutar (seccion principal)
        //Equivalente en Python a lo que está pegado a la margen izquierda
        //Puede estar al principio o al final del método, lo importante es que sea pequeño

        presentarResultado(numeroSuerte(leerFecha()));


    }
}

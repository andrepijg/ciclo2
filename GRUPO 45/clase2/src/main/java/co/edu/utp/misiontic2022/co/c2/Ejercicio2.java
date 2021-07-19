package co.edu.utp.misiontic2022.co.c2;

import java.util.Scanner;

public class Ejercicio2 {
    
    //Ejemplo de constante

    // El final es que dice que es un constante, una buena práctica es que la notación de las constantes (nombre) sea en mayúscula.

    public static final int CONSTANTE_GLORIA = 12;
    public static final double IVA = 0.19;

    // //Requerimiento
    // Programa que calcule el precio de venta de un producto 
    // conociendo el precio por unidad (sin IVA) del producto, 
    // el número de productos vendidos y el porcentaje de IVA aplicado. 
    // Los datos anteriores se leerán por teclado.

    //Interacción

    //Función que recoge precio de venta y cantidad del producto
    public static int[] leerInfoProducto(){

        //Arreglo que recibe información
        int[] arregloInfoProducto = new int[2];

        //Construcción del scanner
        Scanner lector = new Scanner(System.in);

        //Recoger precio del producto        
        System.out.println("Ingrese el precio del producto->  ");
        arregloInfoProducto[0] = lector.nextInt();
        
        //Recoger cantidad del producto
        System.out.println("Ingrese la cantidad del producto->  ");
        arregloInfoProducto[1] = lector.nextInt();
        
        //Cierre del scanner (no es obligatorio)
        lector.close();

        //Retornamos la información coleccionada en un arreglo (lista Python rígida)
        return arregloInfoProducto;
    }

    public static void presentarPrecioVenta(double precioVentaFinal){
        System.out.println("--- El precio con IVA es $: "+precioVentaFinal+" ----");
    }

    //Lógica

    public static double calcularPrecioVenta(int precioUnidad, int cantidad){        
        
        //Variable donde se almacenará precio de venta
        double precioVenta = 0;

        precioVenta = precioUnidad * cantidad * IVA;
        precioVenta = precioVenta + (precioUnidad * cantidad);

        //Retornar precio de venta
        return precioVenta;

    }

    public static void main(String[] args) {

        //Ejecución

        // lee la información y la almacena en un arreglo (lista rígida) como recoge dos datos lo envolvemos en una lista [](infoProducto)
        
        // en el main no debe de haber mucha lógica
        // en calcular precio de venta volvemos y desempaquetamos la información 

        int[] infoProducto = leerInfoProducto();
        presentarPrecioVenta(calcularPrecioVenta(infoProducto[0], infoProducto[1]));
        
        
    }

}
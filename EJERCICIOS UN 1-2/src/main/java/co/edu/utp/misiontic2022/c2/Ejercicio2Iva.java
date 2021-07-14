package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Ejercicio2Iva {
// comentario   
/*Programa que calcule el precio de venta de un producto conociendo el precio
por unidad (sin IVA) del producto, el número de productos vendidos y el
porcentaje de IVA aplicado Los datos anteriores se leerán por teclado*/

public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Ingrese el producto: ");
    System.out.println ("Ingrese el precio del producto sin IVA: ");
    int precioSinIva;
    precioSinIva = sc.nextInt();
    System.out.println ("Ingrese el numero de productos comprados: ");
    int numProd;
    numProd = sc.nextInt();
    System.out.println ("Ingrese el porcentaje de IVA: ");
    int iva;
    iva = sc.nextInt();
    int precioVentaUni;
    precioVentaUni = ((precioSinIva * iva)/100) + precioSinIva;
    int precioVentaTotal;
    precioVentaTotal = precioVentaUni * numProd;

    System.out.println ("El precio de venta de sus productos es: " +precioVentaTotal);
    
    sc.close();
    
}

}

package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Ejercicio5Hipotenusa {
    

//Programa que lea la longitud de los catetos de un triángulo rectángulo y
//calcule la longitud de la hipotenusa según el teorema de Pitágoras.

//1) Leer los catetos -> Scanner
//2)formula para calcular la hipotenusa a**2 +b**2 = c**2
//3) mostrar en pantalla

public static void main(String[] args) {
    double a, b, h;
    System.out.println("Indroduzca longitud cateto a: ");
    Scanner sc = new Scanner (System.in);
    a = sc.nextInt();
    System.out.println("Indroduzca longitud cateto b: ");
    b = sc.nextInt();
    
    h = Math.sqrt((Math.pow(a, 2)+ Math.pow(b,2)));

    System.out.println("La longitud de la hipotenusa es igual a: "+h);
    
    sc.close();
}
}
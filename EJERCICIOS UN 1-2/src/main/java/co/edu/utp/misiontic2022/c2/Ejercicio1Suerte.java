package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Ejercicio1Suerte 
{
    public static void main( String[] args ){
    int dia = 0;
    int mes = 0;
    int año = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println ("Digite su fecha de nacimiento");
    System.out.println ("Digite el día: ");
    dia = sc.nextInt();
    System.out.println ("Digite el mes: ");
    mes = sc.nextInt();
    System.out.println ("Digite el año: ");    
    año = sc.nextInt();

    int cifra1 = 0;
    int cifra2 = 0;
    int cifra3 = 0;
    int cifra4 = 0;
    int suma = 0;
    int numSuerte = 0;

    suma = dia + mes + año;

    cifra1 = suma/1000;
    cifra2 = suma/100%10;
    cifra3 = suma/10%10;
    cifra4 = suma%10;

    numSuerte = cifra1 + cifra2 + cifra3 + cifra4;

    System.out.println ("Su numero de la suerte es: "+numSuerte);

    sc.close();

    }
}

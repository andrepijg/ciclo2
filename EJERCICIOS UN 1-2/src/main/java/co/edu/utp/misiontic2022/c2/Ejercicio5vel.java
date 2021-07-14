package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

// Programa que pase una velocidad en Km/h a m/s La velocidad se lee por teclado

public class Ejercicio5vel {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la velocidad en Km/hora: ");  
        double ms, kmh;
        kmh = sc.nextInt();
        ms = (kmh*1000/3600);
        ms = Math.round(ms * 100) / 100d;
        System.out.println("La velocidad " +kmh+ " km/h, es igual a " +ms+ " m/s.");
        sc.close();



    }
    
    
    
    
}

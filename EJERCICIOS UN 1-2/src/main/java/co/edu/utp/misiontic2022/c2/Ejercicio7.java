package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Ejercicio7 {
// Programa que lea un carácter por teclado y compruebe si es
// una letra mayúscula

// Preguntar como se restringe que el usuario solo pueda colocar entero o un solo carácter
public static void main(String[] args){
    
    Scanner sc = new Scanner (System.in);
    System.out.println(("Ingrese un carácter: "));
    char c = sc.next().charAt(0); 

    String respuesta = Character.isUpperCase(c) ? "El caracter " +c+ " está en Mayúscula ": "El carácter ingresado " +c+ " está en minúscula";
    System.out.println(respuesta);
    sc.close();
    }
}
    


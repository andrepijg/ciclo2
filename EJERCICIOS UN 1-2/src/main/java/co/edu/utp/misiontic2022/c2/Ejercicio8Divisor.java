package co.edu.utp.misiontic2022.c2;
import java.util.*;

public class Ejercicio8Divisor {
    // * Programa que lea dos números por teclado y muestre el resultado de 
    // * la división del primero por el segundo.     
    // * Se comprueba que el divisor es distinto de cero.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dividendo, divisor;
        System.out.print("Introduzca el dividendo: ");
        dividendo = sc.nextDouble();
        System.out.print("Introduzca el divisor: ");
        divisor = sc.nextDouble();
        if(divisor==0){
            System.out.println("No se puede dividir por cero");   
        }else{
            System.out.println(dividendo + " / " + divisor + " = " + dividendo/divisor);  
            System.out.printf("%.2f / %.2f = %.2f %n" , dividendo, divisor , dividendo/divisor);        
        sc.close();
        }

    }
}   


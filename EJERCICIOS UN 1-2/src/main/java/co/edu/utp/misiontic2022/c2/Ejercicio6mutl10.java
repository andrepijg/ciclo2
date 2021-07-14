package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Ejercicio6mutl10 {
    public static void main(String[] args) {
        //Programa que lea un número entero y muestre si el número es
        //múltiplo de 10.

        System.out.println("Escriba un numero: ");
        int n;
        String m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        m = (n%10 ==0)? "El numero ingresado es múltiplo de 10": "El numero ingresado NO es multiplo de 10";

        System.out.println(m);
        sc.close();
        }
}
        
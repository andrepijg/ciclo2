package co.edu.utp.misiontic2022.co.c2;

import java.util.Scanner;

public class Fibonacci {

    static final int F_0 = 0;
    static final int F_1 = 1;

    public static int leerNumero(){
        System.out.print("Ingrese el número hasta el cual quiere la serie de Fibonacci--> ");
        Scanner sc = new Scanner (System.in);
        int N;
        N = sc.nextInt();
        sc.close();
        return N;
    }

    //Serie de fibonacci -> el enésimo término es igual al último y el penúltimo
    // F(N) = F(N-2) + F(N-1)
    // f(0) = 0 
    // f(1) = 1 
    //-----------------------
    // f(2)= f(0) + f(1) = 1 
    // f(3) = f(2) + f(1) = 2
    // f(4) = f(3) + f(2) = 3
    // f(5) = f(4) + f(3) = 5
    // f(6) = f(5) + f(4) = 8

    public static void mostrarSerieFibonacci(int N){
    
    // Variables 
    int terminoN_2 = F_0;
    int terminoN_1 = F_1;

    // gereralizar la presentación de todos los términos
    for (int i = 0; i <= N; i++) {
        //Casos Base
        if (i == 0 || i ==1){
            System.out.printf("F(%d) = %d %n",i,i);
        }
        // Caso general
        else {
            System.out.printf("F(%d) = F(%d) + F(%d) = %d %n",i,i-2,i-1,terminoN_2+terminoN_1);

            //Actualizamos variables ->necesitamos una variable auxiliar

            int auxiliar = terminoN_2;
            terminoN_2 = terminoN_1;
            terminoN_1 = auxiliar + terminoN_1;
        }
    }
}
public static void main(String[] args) {
    System.out.println("Serie de Fibonacci");
    mostrarSerieFibonacci(leerNumero()); 
   // mostrarSerieFibonacci(8);   
}
}

  // La secuencia solo da hasta el número 47, revisar en donde está el error

import java.util.*;

public class Ejercicio3 {
//Escribe un programa java que lea una variable de tipo entero y asígnale un valor
//A continuación muestra un mensaje indicando si la variable es par o impar
//Utiliza el operador condicional para resolverlo
//Ej 14 es par o 15 es impar

    public static String parImpar (int numero) { 
        if (numero %2 == 0){
            return "El numero " + numero + " es par";}
        else{
            return "El numero " + numero + " es impar";
        }
    }

    public static void main(String[] args) {
       //Recolección en python
       //numero = int(input("Ingrese un número: "))
    
       //Recolección del numero por teclado
        Scanner sc = new Scanner (System.in);
        System.out.println ("Ingrese un numero: ");
        int numero = sc.nextInt();
        System.out.println(parImpar(numero));

        //No es neceario cierre para versiones relativamente recientes el cierre

        sc.close();

        
    }
}

import java.util.*;

public class Ejercicio2 {
    //Implemente un algoritmo que reciba un número por teclado y cuente cuántas cifras (o dígintos) contiene e imprima el mensaje en la consola

    public static int numeroCifras (int numero) { 

        //Declarar la variable que acumula el numero de cifras
        int numCifras = 0; //Costumbre de inicializar

        //Procedimiento
        // Si a un numero entero le hacemos divisiones sucesivas entre 10 cada vez me retorna un dígito

        /*145 División flotante -> 14.5
            División entera (tipos) -> 14 -> 1*/

        //Mientras sea diferente de cero, realizar divisiones sucesivas
        //y por cada división que se realiza incrementar el acumulador
        //Python -> while numCifras!=0:

        while(numero !=0){
            // numero = numero/10; Versuón genérica de actualización 
            numero /= 10;

            //Incremento por que acabo de eliminar una cifra
            //numCifras = numCifras + 1;
            //numCifras += 1;
            //++numCifras;  // incrementa directamente el contenido de la variable (pre)
            numCifras ++;
        }

        
        //Retornar lo que quede en el acumulador
        return numCifras;

    }

    public static void main(String[] args) {
       //Recolección en python
       //numero = int(input("Ingrese un número: "))
    
       //Recolección del numero por teclado
        Scanner sc = new Scanner (System.in);
        System.out.println ("Ingrese un numero: ");
        int numero = sc.nextInt();

        //Lógica
        int numeroCifras =numeroCifras(numero);
        System.out.println ("El numero de cifras es "+numeroCifras);

        //No es neceario cierre para versiones relativamente recientes el cierre

        sc.close();

        
    }
}

import java.util.Scanner;

//Escribe un programa que lea una cantidad de grados centígrados y la pase a
//grados Fahrenheit La fórmula es F = 32 (9*C/5)

public class Ejercicio4 {
    public static String temperatura(float grados){
        float fahrenheit = 32 + (9 * (grados/5));
        return grados + " centígrados es equivalente a " +fahrenheit+ " grados fahrenheit.";
    }
public static void main(String[] args) {
    Scanner sc =  new Scanner (System.in);
    System.out.print("Digite los grados centigrados: ");
    float grados = sc.nextFloat();
    System.out.println(temperatura(grados));

    sc.close();
    }
}

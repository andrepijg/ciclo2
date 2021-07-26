package co.edu.utp.misiontic2022.c3;

// el diagrama de clases se obtuvo del documento 4 de la unidad 2 pagina #3

public class App 
{
    public static void main( String[] args ){

        Ficha torre1jug1 = new Torre ("Blanco - ", 21.30);
        Ficha torre2jug1 = new Torre ("Negro - ", 21.30);
        Ficha torre1jug2 = new Torre ("Blanco - ", 21.30);
        Ficha torre2jug2 = new Torre ("Negro - ", 21.30); 
        Ficha alfil1jug1 = new Alfil ("Blanco - ", 15.20);
        



        System.out.println(torre1jug1.toString());
        System.out.println(torre2jug1.toString());
        System.out.println(torre1jug2.toString());
        System.out.println(torre2jug2.toString());
        System.out.println(torre1jug1.mover());
        
        // polimorfismo es la capacidad que tiene un método de comportarse según el objeto que lo llame

        System.out.println(alfil1jug1.toString());
        System.out.println(alfil1jug1.mover());

        // Composición --- relación fuerte --- se hace a través del atributo de la clase
        Casilla casilla = new Casilla (3,2); //estoy creando las coordenadas x, y.
        System.out.println(casilla.toString());
        Tablero tablero = new Tablero(" MisiónTic2022",casilla);
        System.out.println(tablero.toString());
        

        // Agregación --- relación débil ---- se hace a través del parámetro de un método

        System.out.println(casilla.verCasilla(casilla.getCoordenadaX(),casilla.getCoordenadaY(), torre1jug1));
    
        System.out.println(casilla.verCasilla(1,5, alfil1jug1));

        }
    }

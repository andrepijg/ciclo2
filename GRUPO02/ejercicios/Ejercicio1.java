public class Ejercicio1 {

    //Lo vamos a hacer como en python
    // Esta es la lógica para realizar el ejercicio
    /*def saludo(nombre):
    cadenaSaludo = "Hola" + nombre
    return cadenaSaludo*/

    //en Java hay que especificar la variable y no se puede cambiar

    //Traducción a Java
    public static String saludo(String nombre){
        String cadenaSaludo = "Hola " + nombre;
        return cadenaSaludo;
    }

    //Sección principal
    //void es vacio 
    // String es recoja unos elementos, es similar a una lista de python, cada elemento debe ser del mismo tipo
    public static void main(String[] args) {
        String nombre = "Tripulante MisiónTic2022";  //es mi variable
        String cadenaSaludoCompleto = saludo(nombre);
        //Para mostrar en pantalla
        System.out.println(cadenaSaludoCompleto);
        
    }


}

package co.edu.utp.misiontic2022.c2;

public class App 
{
    public static void main( String[] args )
    {
        //voy a crear un objeto de tipo persona

        Persona objPersona1 = new Persona(42151902, "Andrea del Pilar", "Jaramillo Garzón", "F");
        Persona objPersona2= new Persona(1089608382, "Valentina", "Giraldo Jaramillo", "F");

        objPersona1.getIdentificacion();
        objPersona2.getIdentificacion();

        System.out.println(objPersona1.getIdentificacion());
        System.out.println(objPersona2.getIdentificacion());
        System.out.println
        
        (objPersona1);
        System.out.println(objPersona1.getNombre());
        objPersona1.setNombre("Andrea");
        System.out.println(objPersona1.getNombre());
        System.out.println(objPersona1);
    }
}

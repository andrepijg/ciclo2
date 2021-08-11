package view;

import controller.ControladorRequerimientosReto4;
import model.vo.LiderCiudad;
import model.vo.ProyectoCiudad;
import model.vo.SumaProveedor;

import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientosReto4 {

    //Controlador
    public static ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();
    
    public static void requerimiento1() {

        System.out.println("-----Proyecto Ciudad-------");

        try{
            ArrayList<ProyectoCiudad>proyectos = controlador.consultarProyectoCiudad();
            

            //Encabezado del resultado
            System.out.println("Constructora Fecha_Inicio Clasificación");

            for (ProyectoCiudad proyectoCiudad : proyectos) {
                System.out.printf("%s %s %s %n",
                proyectoCiudad.getConstructora(),
                proyectoCiudad.getFechaInicio(),
                proyectoCiudad.getClasificacion());
            
            }
        }catch (SQLException e){
            System.err.println("Ha ocurrido un error" +e.getMessage());
        }
    }

    public static void requerimiento3() {

        System.out.println("-----Suma Cantidades-------");

        try{
            ArrayList<SumaProveedor>sumProveedor = controlador.consultarSumaProveedor();
            

            //Encabezado del resultado
            System.out.println("Suma Cantidades");

            for (SumaProveedor sumaProveedor : sumProveedor) {
                System.out.printf("%d %n",
                                sumaProveedor.getCantidad());
            }
        }catch (SQLException e){
            System.err.println("Ha ocurrido un error" +e.getMessage());
        }
    }


    public static void requerimiento4() {

        System.out.println("-----Líder Ciudad-------");

        try{
            ArrayList<LiderCiudad>liderCiudad = controlador.consultarLiderCiudad();
            

            //Encabezado del resultado
            System.out.println("Nombre Líder");

        for (LiderCiudad liderC : liderCiudad) {
            System.out.printf("%s %n",
            liderC.getNombreLider());
        }
        
        }catch (SQLException e){
            System.err.println("Ha ocurrido un error" +e.getMessage());
        }
    }

        

    }



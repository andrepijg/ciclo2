package controller;

//Estructuras de datos (colecciones)
import java.util.ArrayList;


//Modelos (acceso y objetos contenedores)
import model.dao.ProyectoCiudadDao;
import model.vo.LiderCiudad;
import model.dao.LiderCiudadDao;
import model.vo.ProyectoCiudad;
import model.dao.SumaProveedorDao;
import model.vo.SumaProveedor;

//Librerías para bases de datos
import java.sql.SQLException;


public class ControladorRequerimientosReto4 {

    private  ProyectoCiudadDao proyectoCiudadDao;
    private  SumaProveedorDao sumaProveedorDao;
    private LiderCiudadDao liderCiudadDao;
    
    public ControladorRequerimientosReto4() {
        this.proyectoCiudadDao = new ProyectoCiudadDao ();
        this.sumaProveedorDao = new SumaProveedorDao();
        this.liderCiudadDao = new LiderCiudadDao ();
    }
    public ArrayList<ProyectoCiudad> consultarProyectoCiudad() throws SQLException {
    return this.proyectoCiudadDao.rankingProyectosCiudad();
    }

    public ArrayList<LiderCiudad> consultarLiderCiudad() throws SQLException {
    return this.liderCiudadDao.rankingLiderCiudad();
        
    }

    public ArrayList<SumaProveedor> consultarSumaProveedor() throws SQLException {
    return this.sumaProveedorDao.rankingSumaProveedor();
        
    }

}


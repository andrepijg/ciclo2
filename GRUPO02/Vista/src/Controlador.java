import java.awt.event.*;

public class Controlador implements ActionListener{

    // El controlador es el que tiene el listener

    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista, Modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
        this.vista.botonSumar.addActionListener(this);
        }

        public void iniciar (){
            vista.setTitle("MVC");
            vista.setLocationRelativeTo(null); // Esta vista está solita por eso se le coloca nulo, si pertence a otra ventana le colocamos el componente al cual pertence.
        }
        // Es el que ejecuta
        // Toma los datos de los campos de texto para poderlo operar.

        // En la clase vista es donde obtenemos los numeros y se lo vamos a colocar al num que está en nuestro modelo.

        public void actionPerformed(ActionEvent evt){
            
            try{
                modelo.setNum1 (Integer.parseInt(vista.txtCampo1.getText()));

                modelo.setNum2 (Integer.parseInt(vista.txtCampo2.getText()));

                modelo.sumar();
                vista.txtResultado.setText(String.valueOf(modelo.getResultado()));

               // modelo.multiplicar();
               // vista.txtResultado.setText(String.valueOf(modelo.getResultado()));
        
            }catch (NumberFormatException e){
            System.out.println(e);
            vista.mensajeError("Favor digitar números enteros");
        }

    }

    
}

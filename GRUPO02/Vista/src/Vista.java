import javax.swing.*;

public class Vista extends JFrame {
    
    public JTextField txtCampo1 = new JTextField (10);
    public JLabel etiquetaSuma = new JLabel ("+");
    public JTextField txtCampo2 = new JTextField (10);
    public JButton botonSumar = new JButton ("Sumar");
    public JTextField txtResultado = new JTextField (10);

    public Vista (){
        JPanel panelCalculadora = new JPanel ();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200); //define el tamaño del contendedor

        panelCalculadora.add(txtCampo1);
        panelCalculadora.add(etiquetaSuma);
        panelCalculadora.add(txtCampo2);
        panelCalculadora.add(botonSumar);
        panelCalculadora.add(txtResultado);
        
        this.add(panelCalculadora); // Incorporamos a la calculadora
    }

    // Métodos que nos permiten obtener los valores como texto y nos lo conviertan a un entero.

    public int getTxtCampo1(){
        return Integer.parseInt(txtCampo1.getText());
    }

    public int getTxtCampo2(){
        return Integer.parseInt(txtCampo2.getText());
    }

    public int getTxtResultado(){
        return Integer.parseInt(txtResultado.getText());
    }
// Se asigna un resultado
// String value of me vuelve ese numero en un string.
// Cuando aparece setText para poderlo poner en ese campo debemos convertirlo a cadena para ponerlo en el campo.

    public void setTextResultado (int num){
        txtResultado.setText(String.valueOf (num));
    }

    public void mensajeError (String msg){
        JOptionPane.showMessageDialog(this, msg);
    }
}

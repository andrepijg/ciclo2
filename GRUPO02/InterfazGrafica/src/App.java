import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        // muestra un mensaje en un cuadro de diálogo.
        JOptionPane.showMessageDialog(null, "Hola !! Grupo #2");

        // Mostrar una entrada
        String ciudad = JOptionPane.showInputDialog("Digite la ciudad en la que se encuentra: ");
        // Como estamos capturando por teclado, debemos de guardarlo en una variable.  como las caputuras por teclado siempre son un string entonces le colocamos antes del JOptionPane, la clase String

        JOptionPane.showMessageDialog(null,"_::> "+ciudad+ " <::_" );

        // para castear y guardar nuestra variable como un int lo hacemos con ParseInt

        int n = Integer.parseInt((JOptionPane.showInputDialog("Digite un número")));
        JOptionPane.showMessageDialog(null,"Numero Entero = "+n );

        double a = Double.parseDouble((JOptionPane.showInputDialog("Digite un número")));
        JOptionPane.showMessageDialog(null,"Numero Real = "+a );

        double x = Double.parseDouble((JOptionPane.showInputDialog("Digite un número")));
        JOptionPane.showMessageDialog(null,"Numero Real = "+x,"Ventana del numero Real", JOptionPane.INFORMATION_MESSAGE);

        Double y = Double.parseDouble((JOptionPane.showInputDialog("Digite un número")));
        JOptionPane.showMessageDialog(null,"Numero Real = "+y,"Ventana del numero Real", JOptionPane.ERROR_MESSAGE);
    }
}

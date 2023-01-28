import javax.swing.JOptionPane;

public class WelcomeMessageJO {
    /**
     * Modify the previous aplication to request the name by JOptionPane.
     **/
    public static void main(String[] args) {
        /*ShowInputDialog is a method that show input with the component parent , message , title and typeDialog */
        String name = JOptionPane.showInputDialog(null, "Ingresa tu nombre","Titulo",1);
        /*ShowMessage is a method that show dialog with the component parent , message , title and typeDialog */
        JOptionPane.showMessageDialog(null,"Hola " + name + " Bienvenido", "Bienvenida",1);
    }

}

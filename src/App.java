import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Oh Hello... " +name );

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        int CCV = Integer.parseInt(JOptionPane.showInputDialog("Enter the three numbers on the back of your card: "));
        int SIN = Integer.parseInt(JOptionPane.showInputDialog("Enter your SIN: "));
        String Adress = JOptionPane.showInputDialog("Enter your Adress: ");
    }
}
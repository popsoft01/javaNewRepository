
import javax.swing.*;

public class JOption3 {

        public static void main(String... args){
            String name = JOptionPane.showInputDialog("Enter your Name");

            String message = JOptionPane.showInputDialog("Enter your message: ");

            String firstNumber = JOptionPane.showInputDialog("Enter your Number");

            String secondNumber =JOptionPane.showInputDialog("Enter your Number");

            String sum = firstNumber + secondNumber;

            JOptionPane.showMessageDialog(null, name+" "+message +" " +sum);
        }

}

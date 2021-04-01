

import javax.swing.*;

public class JOption2 {
    public static void main(String... args){
        String name = JOptionPane.showInputDialog("Enter your Name");

        String message = JOptionPane.showInputDialog("Enter your message: ");

        JOptionPane.showMessageDialog(null, name+" "+message);
    }
}

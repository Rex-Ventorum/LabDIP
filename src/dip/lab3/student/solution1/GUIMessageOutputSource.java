package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

public class GUIMessageOutputSource implements MessageOutputSource{

    @Override
    public final void sendMessage(String message) {
        if(message == null) throw new IllegalArgumentException("Message Is Required!");
        JOptionPane.showMessageDialog(null, message);
    }
    
}

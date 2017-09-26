package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

public class GUIInputSource implements MessageInputSource{

    @Override
    public final String recieveMessage() {
        String msg = JOptionPane.showInputDialog(null, "Type Message: ");
        return (msg == null ? "NO MESSAGE" : msg);
    }
    
}

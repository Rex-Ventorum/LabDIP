package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

public class StartUp {
    public static void main(String[] args) {
        
        //--- CHOOSE ONE ---//
        MessageInputSource inputSource = new GUIInputSource();
        //MessageInputSource inputSource = new ConsoleInputSource();
        
        // --- CHOOSE ONE ---//
        MessageOutputSource outputSource = new GUIOutputSource();
        //MessageOutputSource outputSource = new ConsoleOutputSource();
        
        MessagingService msgService = new MessagingService(inputSource,outputSource);
        msgService.sendMessageToSource();
    }
}

package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

public class StartUp {
    public static void main(String[] args) {
        MessageInputSource inputSource = new ConsoleInputSource();
        MessageOutputSource outputSource = new GUIOutputSource();
        MessagingService msgService = new MessagingService(inputSource,outputSource);
        msgService.recieveMessageFromSource();
        msgService.sendMessageToSource(msgService.getLastMessageRecieved());

    }
}

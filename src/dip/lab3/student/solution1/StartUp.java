package dip.lab3.student.solution1;

public class StartUp {
    public static void main(String[] args) {
        
        /************************************************************************************************************************
         * NOTE: ConsoleInputSource -> GUIOutputSource Is not working for reasons I cannot figure out The code just hangs up... *
         * All other combinations work properly and ConsoleInputSource and GUIOutputSorce work individally just not in tandem   *
         ************************************************************************************************************************/
        
        //--- CHOOSE ONE ---//
        MessageInputSource inputSource = new GUIInputSource();
        //MessageInputSource inputSource = new ConsoleInputSource();
        
        // --- CHOOSE ONE ---//
        //MessageOutputSource outputSource = new GUIOutputSource();
        MessageOutputSource outputSource = new ConsoleOutputSource();
        
        MessagingService msgService = new MessagingService(inputSource,outputSource);
        
        // --- SEND MESSAGE USING InputSource --- //
        msgService.sendMessageToSource();
        
        // --- SEND CUSTOM MESSAGE --- //
        //msgService.sendMessageToSource("Custom Message");
        
        // --- RECIEVE MESSAGE ONLY --- //
        //msgService.recieveMessageFromSource();
        
        // --- GET LAST SENT AND LAST RECIEVED MESSAGES --- //
        //String LastMesageSent = msgService.getLastMessageSent();
        //String LastMessageRecieved = msgService.getLastMessageRecieved();        
    }
}

package dip.lab3.student.solution1;

public class MessagingService{
    private String lastMessageRecieved;
    private String lastMessageSent;
    private MessageInputSource inputSource;
    private MessageOutputSource outputSource;
    
    public MessagingService(MessageInputSource inputSource, MessageOutputSource outputSource){
        setMessageInputSource(inputSource);
        setMessageOutputSource(outputSource);
    }
    
    public final String recieveMessageFromSource(){
        lastMessageRecieved = inputSource.recieveMessage();
        return lastMessageRecieved;
    }
    
    public final void sendMessageToSource(){
        sendMessageToSource(recieveMessageFromSource());
    }
    public final void sendMessageToSource(String message){
        outputSource.sendMessage(message);
        lastMessageSent = message;
    }
    
    public final void setMessageInputSource(MessageInputSource inputSource){
        if(inputSource == null) throw new IllegalArgumentException("Input Source May Not Be Null!");
        this.inputSource = inputSource;
    }
    
    public final void setMessageOutputSource(MessageOutputSource outputSource){
        if(outputSource == null) throw new IllegalArgumentException("Output Source May Not Be Null!");
        this.outputSource = outputSource;
    }
    
    public final MessageOutputSource getMessageOutPutSource(){
        return outputSource;
    }
    
    public final MessageInputSource getMessageInputSource(){
        return inputSource;
    }
    
    public final String getLastMessageRecieved(){return lastMessageRecieved;}
    public final String getLastMessageSent(){return lastMessageSent;}
}

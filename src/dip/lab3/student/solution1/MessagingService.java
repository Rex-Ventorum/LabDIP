package dip.lab3.student.solution1;

public class MessagingService{
    private String defaultMessage;
    private String lastMessageRecieved;
    private MessageInputSource inputSource;
    private MessageOutputSource outputSource;
    
    public MessagingService(MessageInputSource inputSource, MessageOutputSource outputSource){
        setMessageInputSource(inputSource);
        setMessageOutputSource(outputSource);
        defaultMessage = lastMessageRecieved = "No Message";
    }
    
    public final String recieveMessageFromSource(){
        lastMessageRecieved = inputSource.recieveMessage();
        return lastMessageRecieved;
    }
    
    public final void sendMessageToSource(){
        if(lastMessageRecieved == null) sendMessageToSource(defaultMessage);
        else sendMessageToSource(lastMessageRecieved);
    }
    public final void sendMessageToSource(String message){
        outputSource.sendMessage(message);
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
    
    public final void setDefaultMessage(String message){
        if(message == null) throw new IllegalArgumentException("Default Message May Not Be Null!");
        defaultMessage = message;
    }

    public final String getDefaultMessage(){
        return defaultMessage;
    }
}

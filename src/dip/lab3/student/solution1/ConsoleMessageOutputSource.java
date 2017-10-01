package dip.lab3.student.solution1;

public class ConsoleMessageOutputSource implements MessageOutputSource{

    @Override
    public final void sendMessage(String message) {
        if(message == null) throw new IllegalArgumentException("Message Is Reqired!");
        System.out.println(message);
    }
    
}

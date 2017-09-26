package dip.lab3.student.solution1;

public class ConsoleOutputSource implements MessageOutputSource{

    @Override
    public void sendMessage(String message) {
        if(message == null) throw new IllegalArgumentException("Message Is Reqired!");
        System.out.println(message);
    }
    
}

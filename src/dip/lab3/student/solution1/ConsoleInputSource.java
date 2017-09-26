package dip.lab3.student.solution1;

public class ConsoleInputSource implements MessageInputSource{

    @Override
    public final String recieveMessage() {
        String msg = System.console().readLine();
        return (msg == null ? "NO MESSAGE" : msg);
    }
}

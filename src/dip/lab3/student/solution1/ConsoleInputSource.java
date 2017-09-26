package dip.lab3.student.solution1;

import java.util.Scanner;

public class ConsoleInputSource implements MessageInputSource{

    @Override
    public final String recieveMessage() {
        String message;
        Scanner scanner = new Scanner(System.in);
        message = scanner.nextLine();
        scanner.close();
        return message;
    }
}

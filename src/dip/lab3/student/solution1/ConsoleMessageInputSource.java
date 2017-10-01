package dip.lab3.student.solution1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleMessageInputSource implements MessageInputSource{

    @Override
    public final String recieveMessage() {
        String msg = null;
        BufferedReader reader = null;
        try{
        reader = new BufferedReader(new InputStreamReader(System.in));
        msg = reader.readLine();
        }catch(IOException e){msg = "INPUT ERROR";}
        finally{
            try { if(reader != null) reader.close();
            } catch (IOException ex) {/*Do Nothing*/}
        }
        return (msg == null ? "NO MESSAGE" : msg);
    }
}

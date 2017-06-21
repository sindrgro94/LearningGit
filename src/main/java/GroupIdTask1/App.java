package GroupIdTask1;


import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.PumpStreamHandler;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;


public class App 
{
    public static void main( String[] args ) throws IOException{
        if (args.length==1){
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            CommandLine cmdLine = new CommandLine("ls");
            cmdLine.addArgument(args[0]);
            DefaultExecutor executor = new DefaultExecutor();
            PumpStreamHandler streamHandler = new PumpStreamHandler(outputStream);
            executor.setStreamHandler(streamHandler);
            executor.execute(cmdLine);
            String out = outputStream.toString();
        }
        else{
            System.out.println("Wrong input parameters");
        }
    }
}

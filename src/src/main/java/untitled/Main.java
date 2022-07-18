package src.main.java.untitled;

import src.main.java.untitled.command.CommandReader;

public class Main {
    public static void main (String[] arg){
        /*int code = Authentication.authenticate();
        if (code == 0)
            System.out.println("Login success");
        else
            System.out.println("Login failed");
        */
        CommandReader.startReadCommand();


    }
}

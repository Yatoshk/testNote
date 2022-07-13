package src;

import src.command.CommandReader;
import src.command.CommandType;
import src.repository.NoteRepository;
import src.repository.impl.NoteRepositoryImpl;

import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
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

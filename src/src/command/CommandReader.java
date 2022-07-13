package src.command;
import src.Note;
import src.command.executor.NoteCreateExecutor;
import src.repository.NoteRepository;
import src.repository.impl.NoteRepositoryImpl;

import java.util.Scanner;

public class CommandReader {

    protected static final NoteRepository noteRepository = new NoteRepositoryImpl();
    public static int startReadCommand(){
        System.out.println("Program started, write your command: ");
        Scanner s = new Scanner(System.in);
        while(true){
            var text = s.nextLine();
            int code = CommandReader.readCommand(text);
            if (code == 0)
                break;
        }
        return 0;
    }
    /**
     * creat note;
     * notes;
     * remove note;
     *
     * example: create note noteName noteText noteText noteText
     */
    public static int readCommand(String command){
        if (command.contains("create note")){
            return new NoteCreateExecutor().execute(command);
        }
        if (command.contains("notes")){
            return viewAllNotes(command);
        }
        if (command.contains("remove note")){
            return removeNote(command);
        }
        if (command.contains("exit")){
            return 0;
        }
        return -1;
    }

    private static int viewAllNotes(String command){
        var notes = noteRepository.getAllNotes();
        for (var note: notes){
            System.out.printf("Note: %s, Text: %s, Author: %s /n", note.getName(), note.getText(), note.getAuthor());
        }

        return 1;
    }
    private static int removeNote(String command){
        String[] words = command.split(" ");
        String noteName = words[2];
        noteRepository.remove(noteName);
        return 1;
    }
}

package src.main.java.untitled.executor;

import src.main.java.untitled.Note;

public class NoteCreateExecutor implements Executor {
    @Override
    public int execute(String text){
        return createNote(text);
    }

    private static int createNote(String command){
        String[] words = command.split(" ");
        String noteName = words[2];
        StringBuilder noteTextSb = new StringBuilder();
        for (int i = 3; i < words.length; i++){
            noteTextSb.append(words[i]);
            noteTextSb.append(" ");
        }
        String noteText = noteTextSb.toString();

        Note newNote = new Note(noteName, noteText);
        //NOTE_REPOSITORY.save(newNote);
        System.out.println("Note created");
        return 1;
    }

}

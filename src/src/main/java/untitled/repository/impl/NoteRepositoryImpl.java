package src.main.java.untitled.repository.impl;

import src.main.java.untitled.Note;
import src.main.java.untitled.repository.NoteRepository;

import java.util.HashSet;
import java.util.Set;

public class NoteRepositoryImpl implements NoteRepository {
    private static final Set<Note> NOTES = new HashSet<>();
    @Override
    public Note save(Note note){
        NOTES.add(note);
        return note;
    }

    @Override
    public Set<Note> getAllNotes() {
        return NOTES; // todo
    }

    @Override
    public void remove(String name) {
        //todo
    }
}

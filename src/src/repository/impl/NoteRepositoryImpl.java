package src.repository.impl;

import src.Note;
import src.repository.NoteRepository;

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

package src.main.java.untitled.repository;
import src.main.java.untitled.Note;
import java.util.Set;
public interface NoteRepository {
    Note save(Note note);
    Set<Note> getAllNotes();
    void remove(String name);
}

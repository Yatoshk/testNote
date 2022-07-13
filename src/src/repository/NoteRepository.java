package src.repository;
import src.Note;
import java.util.Set;
public interface NoteRepository {
    Note save(Note note);
    Set<Note> getAllNotes();
    void remove(String name);
}

package src.main.java.untitled;

import java.time.Instant;
import java.util.Objects;

public class Note {
    private final String name;
    private final String author;
    private final Instant creationDate;

    private String text;
    private Instant updateDate;

    public Note(String name, String text){
        this.name = name;
        this.text = text;
        author = null;
        creationDate = Instant.now();
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public String getText() {
        return text;
    }

    public Instant getUpdateDate() {
        return updateDate;
    }

    public void setText(String text) {
        this.text = text;
        this.updateDate = Instant.now();
    }

    public void setUpdateDate(Instant updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(name, note.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

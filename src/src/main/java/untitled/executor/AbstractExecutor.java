package src.main.java.untitled.executor;

import src.main.java.untitled.repository.NoteRepository;
import src.main.java.untitled.repository.impl.NoteRepositoryImpl;

public abstract class AbstractExecutor implements Executor{

    protected static final NoteRepository NOTE_REPOSITORY = new NoteRepositoryImpl();

}

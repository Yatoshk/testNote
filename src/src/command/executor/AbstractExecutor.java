package src.command.executor;

import src.repository.NoteRepository;
import src.repository.impl.NoteRepositoryImpl;

public abstract class AbstractExecutor implements Executor{

    protected static final NoteRepository NOTE_REPOSITORY = new NoteRepositoryImpl();

}

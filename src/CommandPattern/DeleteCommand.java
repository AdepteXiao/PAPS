package CommandPattern;

import DAOFabric.EntityRepository;

public class DeleteCommand implements Command {
    private final EntityRepository repository;
    private final String entity;

    public DeleteCommand(EntityRepository repository, String entity) {
        this.repository = repository;
        this.entity = entity;
    }

    public void execute() {
        repository.delete(entity);
    }
}

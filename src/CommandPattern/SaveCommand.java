package CommandPattern;

import DAOFabric.EntityRepository;

public class SaveCommand implements Command {
    private final EntityRepository repository;
    private final String entity;

    public SaveCommand(EntityRepository repository, String entity) {
        this.repository = repository;
        this.entity = entity;
    }

    public void execute() {
        repository.save(entity);
    }
}
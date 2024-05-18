package CommandPattern;

import DAOFabric.EntityRepository;

public class GetByIdCommand implements Command {
    private final EntityRepository repository;
    private final int id;

    public GetByIdCommand(EntityRepository repository, int id) {
        this.repository = repository;
        this.id = id;
    }

    public void execute() {
        repository.findById(id);
    }
}

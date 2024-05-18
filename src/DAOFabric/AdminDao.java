package DAOFabric;

import CommandPattern.Command;
import CommandPattern.DeleteCommand;
import CommandPattern.GetByIdCommand;
import CommandPattern.SaveCommand;
import Server.Dao;

public class AdminDao implements Dao {
    private final EntityRepository repository;
    private String data = "AdminData";
    public AdminDao(EntityRepository repository) {
        this.repository = repository;
    }

    @Override
    public String getById(int id) {
        Command command = new GetByIdCommand(repository, id);
        command.execute();
        return repository.findById(id);
    }

    @Override
    public void save(String entity) {
        Command command = new SaveCommand(repository, entity);
        command.execute();
    }

    @Override
    public void delete(String entity) {
        Command command = new DeleteCommand(repository, entity);
        command.execute();
    }

    @Override
    public String getData() {
        return this.data;
    }

    @Override
    public void addData(String newData) {
        this.data += newData;
    }
}

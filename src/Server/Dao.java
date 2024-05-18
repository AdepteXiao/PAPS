package Server;

import DAOFabric.EntityRepository;

public interface Dao {

    String getById(int id);
    void save(String entity);
    void delete(String entity);
    String getData();
    void addData(String data);
}

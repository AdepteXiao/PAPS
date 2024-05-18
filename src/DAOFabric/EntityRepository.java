package DAOFabric;

public interface EntityRepository {
    String findById(int id);
    void save(String entity);
    void delete(String entity);
}

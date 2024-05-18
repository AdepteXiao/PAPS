package ORM;


import DAOFabric.EntityRepository;

abstract class Repository implements EntityRepository {
    public abstract String findById(int id);
    public abstract void save(String entity);

    public abstract void delete(String entity);
}


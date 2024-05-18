package DAOFabric;

import ORM.AdminRepository;
import Server.Dao;
import Server.DaoCreator;

public class AdminDaoCreator implements DaoCreator {
    public Dao createDao() {
        return new AdminDao(new AdminRepository());
    }
}

package DAOFabric;

import ORM.UserRepository;
import Server.Dao;
import Server.DaoCreator;

public class UserDaoCreator implements DaoCreator {
    public Dao createDao() {
        return new UserDao(new UserRepository());
    }
}

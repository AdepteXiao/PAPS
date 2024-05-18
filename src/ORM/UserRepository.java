package ORM;

public class UserRepository extends Repository {

    public String findById(int id) {
        return "User entity " + id;
    }

    public void save(String entity) {
    }

    public void delete(String entity) {
    }
}

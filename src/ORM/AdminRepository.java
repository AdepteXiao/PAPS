package ORM;

public class AdminRepository extends Repository {
    public String findById(int id) {
        return "Admin entity " + id;
    }

    public void save(String entity) {
    }

    public void delete(String entity) {
    }
}

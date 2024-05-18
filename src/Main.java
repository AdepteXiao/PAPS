import DAOFabric.UserDao;
import ORM.UserRepository;
import Server.Dao;
import Server.Spa;
import Server.UserSPA;
import controllers.Controller;

public class Main {
    public static void main(String[] args) {
        UserRepository repository = new UserRepository();
        Dao dao = new UserDao(repository);
        Spa spa = new UserSPA();
        Controller controller = new Controller(dao, spa);

        controller.addData(", Элемент 1");
        controller.addData(", Элемент 2");
        controller.addData(", Элемент 3");

        controller.updateView();
    }
}
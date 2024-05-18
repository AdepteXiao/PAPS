package Server;

public class AdminSpa implements Spa{

    @Override
    public void present(String data) {
        System.out.println(data);
    }

//    private final Dao dao;
//
//    public AdminSpa(Dao dao) {
//        this.dao = dao;
//    }
//
//    public void present() {
//        System.out.println("Present admin dao");
//    }
}

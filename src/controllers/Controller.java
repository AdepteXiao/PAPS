package controllers;

import Server.Dao;
import Server.Spa;

public class Controller {
    private final Dao dao;
    private final Spa spa;

    public Controller(Dao dao, Spa spa) {
        this.dao = dao;
        this.spa = spa;
    }

    public void addData(String item) {
        dao.addData(item);
    }

    public void updateView() {
        spa.present(dao.getData());
    }
}

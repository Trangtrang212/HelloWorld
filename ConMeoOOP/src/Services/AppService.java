package Services;

import Model.Meo;
import Services.Interface.AppInterface;

import java.util.ArrayList;
import java.util.List;

public class AppService implements AppInterface {
    private List<Meo> db;

    public AppService() {
        db = new ArrayList<>();
    }


    @Override
    public boolean add(Meo meo) {
        for (int i = 0; i < db.size(); i++){
            if (db.get(i).getId() == meo.getId()){
                return false;
            }
        }
        db.add(meo);
        return true;
    }

    @Override
    public boolean delete(int id) {
        for (int i = 0; i < db.size(); i++){
            if (db.get(i).getId() == id){
                db.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(int id, String value) {
        for (int i = 0; i < db.size(); i++){
            if (db.get(i).getId() == id){
                db.get(i).setTiengKeu(value);
                return true;
            }
        }
        return false;
    }

    @Override
    public void displayAll() {
        for (int i = 0; i < db.size(); i++){
            db.get(i).display();
        }
    }

    @Override
    public void displayById(int id) {
        for (int i = 0; i < db.size(); i++){
            if (db.get(i).getId() == id){
                db.get(i).display();
            }
        }
    }
}

package Services.Interface;

import Model.Meo;

public interface AppInterface {
    boolean add(Meo meo);
    boolean delete(int id);
    boolean update(int id, String value);
    void displayAll();
    void displayById(int id);
}

package project_asm_java.model.design;

import java.util.List;

public interface ICafe<T,E> {
    boolean create(T t);
    boolean update(T t);
    boolean delete(E id);
    List<T> findAll();
    T findByID(E id);
    List<T> readFromFile();
    boolean writeToFile(List<T> list);
}

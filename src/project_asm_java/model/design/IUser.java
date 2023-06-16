package project_asm_java.model.design;

import java.util.List;

public interface IUser<T,E> extends ICafe<T,E> {
    List<T> displayByDate(List<T> list);
    List<T> findByUserNameOrFullName(String name);
    T checkLogin(String username, String password);
}

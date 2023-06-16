package project_asm_java.model.design;

import java.util.List;

public interface ICatalog<T,E> extends ICafe<T, E>{
    List<T> findByCatalogName(String name);
    List<T> displayByPriority(List<T> list);
    T getCatalogByCatalogName(String name);
}

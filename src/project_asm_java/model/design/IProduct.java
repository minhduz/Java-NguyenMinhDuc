package project_asm_java.model.design;

import java.util.List;

public interface IProduct<T,E> extends ICafe<T, E>{
    List<T> displayByCatalog(List<T> T);
    List<T> findByProductName(String name);
    List<T> findByProductPrice(double priceMax,double priceMin);
}

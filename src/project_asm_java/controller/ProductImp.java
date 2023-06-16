package project_asm_java.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import project_asm_java.data.FileImp;
import project_asm_java.model.config.ShopConstant;
import project_asm_java.model.design.IProduct;
import project_asm_java.model.entity.Product;

public class ProductImp implements IProduct<Product, Integer>{

    @Override
    public List<Product> displayByCatalog(List<Product> listProduct) {
        if(listProduct != null){
            Collections.sort(listProduct, (Product o1, Product o2) -> Double.compare(o1.getProductPrice(), o2.getProductPrice()));
        }
        return listProduct;
    }

    @Override
    public List<Product> findByProductName(String name) {
        List<Product> listProduct = readFromFile();
        List<Product> listProductSearchByName = new ArrayList<>();
        for (Product product:listProduct) {
            if(product.getProductName().toLowerCase().contains(name.toLowerCase())){
                listProductSearchByName.add(product);
            }
        }
        return listProductSearchByName;
    }

    @Override
    public List<Product> findByProductPrice(double priceMax,double priceMin) {
        List<Product> listProduct = readFromFile();
        List<Product> listProductSearchByPrice = new ArrayList<>();
        for (Product product:listProduct) {
            if(product.getProductPrice() >= priceMin && product.getProductPrice() <= priceMax){
                listProductSearchByPrice.add(product);
            }
        }
        return listProductSearchByPrice;      
    }

    @Override
    public boolean create(Product product) {
        List<Product> listProduct = readFromFile();
        if (listProduct == null) {
            listProduct = new ArrayList<>();
        }
        listProduct.add(product);
        boolean check = writeToFile(listProduct);
        return check;
    }

    @Override
    public boolean update(Product product) {
        List<Product> listProduct = readFromFile();
        boolean returnData = false;
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getProductID()== product.getProductID()){
                listProduct.set(i,product);
                returnData = true;
                break;
            }
        }
        boolean result = writeToFile(listProduct);
        if(result && returnData){
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        Product product = findByID(id);
        List<Product> listProduct = readFromFile();
        if(product!=null && listProduct.contains(product)){
            listProduct.remove(product);
        }
        boolean result = writeToFile(listProduct);
        return result;
    }

    @Override
    public List<Product> findAll() {
        return readFromFile();
    }

    @Override
    public Product findByID(Integer id) {
        List<Product> listProduct = readFromFile();
        for (Product product:listProduct) {
            if(product.getProductID() == id){
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> readFromFile() {
        FileImp<Product> fileImp = new FileImp<>();
        return fileImp.readDataFromFile(ShopConstant.URL_PRODUCT);
    }

    @Override
    public boolean writeToFile(List<Product> list) {
        FileImp<Product> fileImp = new FileImp<>();
        return fileImp.writeToFile(list, ShopConstant.URL_PRODUCT);
    }
    
}

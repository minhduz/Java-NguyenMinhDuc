package project_asm_java.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import project_asm_java.data.FileImp;
import project_asm_java.model.config.ShopConstant;
import project_asm_java.model.design.ICatalog;
import project_asm_java.model.entity.Catalog;
import project_asm_java.model.entity.Product;

public class CatalogImp implements ICatalog<Catalog, Integer>{
    @Override
    public List<Catalog> findByCatalogName(String name) {
        List<Catalog> listCatalog = readFromFile();
        List<Catalog> listUserSearchByCatalogName = new ArrayList<>();
        for (Catalog catalog:listCatalog) {
            if(catalog.getCatalogName().contains(name)){
                listUserSearchByCatalogName.add(catalog);
            }
        }
        return listUserSearchByCatalogName;
    }

    @Override
    public List<Catalog> displayByPriority(List<Catalog> listCatalog) {
       if(listCatalog != null){
            Collections.sort(listCatalog, (Catalog o1, Catalog o2) -> Integer.compare(o1.getCatalogPriority(), o2.getCatalogPriority()));
        }
        return listCatalog;
    }

    @Override
    public boolean create(Catalog catalog) {
        List<Catalog> listCatalog = readFromFile();
        if (listCatalog == null) {
            listCatalog = new ArrayList<>();
        }
        listCatalog.add(catalog);
        boolean check = writeToFile(listCatalog);
        return check;
    }

    @Override
    public boolean update(Catalog catalog) {
        List<Catalog> listCatalog = readFromFile();
        boolean returnData = false;
        Catalog changeCatalog = null;
        for (int i = 0; i < listCatalog.size(); i++) {
            if (listCatalog.get(i).getCatalogID()== catalog.getCatalogID()){
                listCatalog.set(i,catalog);
                changeCatalog = catalog;
                returnData = true;
                break;
            }
        }
        boolean result = writeToFile(listCatalog);
        
        //Cap nhat thong tin cua Product chua Catalog bi doi status
        if (changeCatalog != null) {
            //Lay danh sach san pham
            ProductImp productImp = new ProductImp();
            List<Product> listPro = productImp.findAll();
            for (Product pro : listPro) {
                if (pro.getProductCatalog().getCatalogID()== changeCatalog.getCatalogID()){
                    pro.setProductCatalog(changeCatalog);
                }
            }
            productImp.writeToFile(listPro);
        }
        if (result && returnData) {
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        Catalog catalog = findByID(id);
        List<Catalog> listCatalog = readFromFile();
        if(catalog!=null && listCatalog.contains(catalog)){
            listCatalog.remove(catalog);
        }
        boolean result = writeToFile(listCatalog);
        return result;
    }

    @Override
    public List<Catalog> findAll() {
        return readFromFile();
    }

    @Override
    public Catalog findByID(Integer id) {
        List<Catalog> listCatalog = readFromFile();
        for (Catalog catalog:listCatalog) {
            if(catalog.getCatalogID() == id){
                return catalog;
            }
        }
        return null;
    }

    @Override
    public List<Catalog> readFromFile() {
        FileImp<Catalog> fileImp = new FileImp<>();
        return fileImp.readDataFromFile(ShopConstant.URL_CATALOG);
    }

    @Override
    public boolean writeToFile(List<Catalog> list) {
        FileImp<Catalog> fileImp = new FileImp<>();
        return fileImp.writeToFile(list, ShopConstant.URL_CATALOG);
    }

    @Override
    public Catalog getCatalogByCatalogName(String name) {
        List<Catalog> listCatalog = findAll();
        Catalog chosenCatalog = null;
        for (Catalog catalog : listCatalog) {
            if(catalog.getCatalogName().equals(name)){
                chosenCatalog = catalog;
            }
        }
        
        return chosenCatalog;
    }
}

package project_asm_java.model.config;

import java.util.List;
import java.util.regex.Pattern;
import project_asm_java.model.entity.Catalog;
import project_asm_java.model.entity.Product;
import project_asm_java.model.entity.User;

public class ShopValidation {
    public static boolean checkValidateUserName(String str) {
        String userNamePattern = "^[A-Za-z0-9]+[A-Za-z0-9]$";
        return Pattern.compile(userNamePattern)
                .matcher(str)
                .matches();
    }
       
    public static boolean checkStringLength(String str, int max, int min) {
        return str.length() <= max && str.length() >= min;
    }
    
    public static boolean checkExistUserName(List<User> list, String username) {
        if(list != null){
            for (User user : list) {
                if (user.getUserName().equals(username)) {
                    return false;
                }
            }
        }        
        return true;
    }
    
    public static boolean checkEmail(String str) {
        String emailPattern = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        return Pattern.compile(emailPattern)
                .matcher(str)
                .matches();
    }

    public static boolean checkPhone(String str) {
        String phonePattern = "^(84|0[3|5|7|8|9])+([0-9]{8})$";
        return Pattern.compile(phonePattern)
                .matcher(str)
                .matches();
    }
    
    public static boolean checkExistCatalogName(List<Catalog> list, String catalogName) {
        if(list != null){
            for (Catalog catalog : list) {
                if (catalog.getCatalogName().trim().equals(catalogName.trim())) {
                    return false;
                }
            }
        }        
        return true;
    }
     
    public static boolean checkInteger(String str) {
        try {
            Integer.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static boolean checkDouble(String str) {
        try {
            Double.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static boolean checkExistProductName(List<Product> list, String productName) {
        if(list != null){
            for (Product product : list) {
                if (product.getProductName().trim().equals(productName.trim())) {
                    return false;
                }
            }
        }
        return true;        
    }
}

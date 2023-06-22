package project_asm_java.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import project_asm_java.data.FileImp;
import project_asm_java.model.config.ShopConstant;
import project_asm_java.model.design.IUser;
import project_asm_java.model.entity.User;

public class UserImp implements IUser<User,Integer> {

    @Override
    public List<User> displayByDate(List<User> listUser) {
        if(listUser != null){
            Collections.sort(listUser, (User o1, User o2) -> o2.getUserDate().compareTo(o1.getUserDate()));
        }
        return listUser;
    }

    @Override
    public List<User> findByUserNameOrFullName(String name) {
        List<User> listUser = readFromFile();
        List<User> listUserSearchByNameOrFullName = new ArrayList<>();
        for (User user:listUser) {
            if(user.getUserName()!=null && user.getUserFullName()!=null){
                if(user.getUserName().contains(name) || user.getUserFullName().trim().toLowerCase().contains(name.trim().toLowerCase())){
                    listUserSearchByNameOrFullName.add(user);
                }
            }          
        }
        return listUserSearchByNameOrFullName;
    }

    @Override
    public User checkLogin(String username, String password) {
        List<User> listUser = readFromFile();
        for (User user:listUser) {
            if(user.getUserName().equals(username)&&user.getUserPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

    @Override
    public boolean create(User user) {
        List<User> listUser = readFromFile();
        if (listUser==null){
            listUser= new ArrayList<>();
        }
        listUser.add(user);
        boolean check = writeToFile(listUser);
        return check;
    }

    @Override
    public boolean update(User user) {
        List<User> listUser = readFromFile();
        boolean returnData = false;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUserID() == user.getUserID()){
                listUser.set(i,user);
                returnData = true;
                break;
            }
        }
        boolean result = writeToFile(listUser);
        if(result && returnData){
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        User user = findByID(id);
        List<User> listUser = readFromFile();
        if(user!=null && listUser.contains(user)){
            listUser.remove(user);
        }
        boolean result = writeToFile(listUser);
        return result;
    }

    @Override
    public List<User> findAll() {
        return readFromFile();
    }

    @Override
    public User findByID(Integer id) {
        List<User> listUser = readFromFile();
        for (User user:listUser) {
            if(user.getUserID() == id){
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> readFromFile() {
        FileImp<User> fileImp = new FileImp<>();
        return fileImp.readDataFromFile(ShopConstant.URL_USER);
    }

    @Override
    public boolean writeToFile(List<User> list) {
        FileImp<User> fileImp = new FileImp<>();
        return fileImp.writeToFile(list, ShopConstant.URL_USER);
    }
    
}

package project_asm_java.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class FileImp<T> {
    public List<T> readDataFromFile(String filePath){
        File file = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        List<T> list = null;
        try {
            file = new File(filePath);
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            list = (List<T>) ois.readObject();
        }catch (IOException | ClassNotFoundException e){
        }finally {
            try {
                if(ois!=null){
                    ois.close();
                }
                if(fis!=null){
                    fis.close();
                }
            }catch (IOException ex){
            }
        }
        return list;
    }
    
    public boolean writeToFile(List<T> list, String filePath){
        File file = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        boolean result = false;
        try {
            file = new File(filePath);
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            result = true;
        }catch (IOException e){
        }finally {
            try {
                if(oos!=null){
                    oos.close();
                }
                if(fos!=null){
                    fos.close();
                }
            }catch (IOException ex){
            }
        }
        return result;
    }
    
}

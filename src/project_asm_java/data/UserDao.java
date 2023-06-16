
package project_asm_java.data;

import project_asm_java.model.entity.User;
import java.sql.*;

public class UserDao {
    public boolean save(User user){
        Connection conn = null;
        CallableStatement callSt = null;
        boolean result = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call proc_insertUser(?,?,?,?,?,?,?,?)}");
            callSt.setInt(1,user.getUserID());
            callSt.setString(2, user.getUserName());
            callSt.setString(3, user.getUserPassword());
            callSt.setString(4, user.getUserConfirmPassword());
            callSt.setString(5, user.getUserFullName());
            callSt.setString(6, user.getUserEmail());
            callSt.setString(7, user.getUserPhone());
            callSt.setBoolean(8, user.isUserStatus());
            callSt.executeUpdate();
            result = true;
        }catch (SQLException ex){
            result = false;
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return result;
    }
    
    public boolean update(User user){
        Connection conn = null;
        CallableStatement callSt = null;
        boolean result = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call proc_updateUser(?,?,?,?,?,?,?,?)}");
            callSt.setInt(1,user.getUserID());
            callSt.setString(2, user.getUserName());
            callSt.setString(3, user.getUserPassword());
            callSt.setString(4, user.getUserConfirmPassword());
            callSt.setString(5, user.getUserFullName());
            callSt.setString(6, user.getUserEmail());
            callSt.setString(7, user.getUserPhone());
            callSt.setBoolean(8, user.isUserStatus());
            callSt.executeUpdate();
            result = true;
        }catch (SQLException ex){
            result = false;
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return result;
    }
    
    public boolean delete(int userID){
        Connection conn = null;
        CallableStatement callSt = null;
        boolean result = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call proc_deleteUser(?)}");
            callSt.setInt(1,userID);
            callSt.executeUpdate();
            result = true;
        }catch (SQLException ex){
            result = false;
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return result;
    }
}

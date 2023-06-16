
package project_asm_java.controller;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import project_asm_java.model.entity.User;

/**
 *
 * @author Nguyễn Minh Đức
 */
public class UserImpTest {
    
    UserImp userImp = new UserImp();
    
    public UserImpTest() {
    }

    @Test
    public void testDisplayByDate() {
        List<User> userList = userImp.findAll();
        User user1 = userImp.findByID(3);
        User user2 = userImp.findByID(1);
        List<User> sortedList = userImp.displayByDate(userList);
        Assertions.assertEquals(user1, sortedList.get(0));
        Assertions.assertEquals(user2, sortedList.get(2));
    }

    @Test
    public void testFindByUserNameOrFullName() {
        List<User> listSearch1 = userImp.findByUserNameOrFullName("duc");
        List<User> listSearch2 = userImp.findByUserNameOrFullName("nguyen");
        List<User> listSearch3 = userImp.findByUserNameOrFullName("admin");
        Assertions.assertEquals(2, listSearch1.size());
        Assertions.assertEquals(3, listSearch2.size());
        Assertions.assertEquals(1, listSearch3.size());
    }

    @Test
    public void testCheckLogin() {
        User loggedInUser1 = userImp.checkLogin("john", "password1");
        User loggedInUser2 = userImp.checkLogin("admin123", "123456");
        User admin = userImp.findByID(1);
        User loggedInUser3 = userImp.checkLogin("ducnhit", "123123");
        User user = userImp.findByID(2);
        Assertions.assertEquals(null, loggedInUser1);        
        Assertions.assertEquals(admin, loggedInUser2);
        Assertions.assertEquals(user, loggedInUser3);
    }

    @Test
    public void testCreate() {
        User newUser = new User(10, "john", new Date());
        boolean created = userImp.create(newUser);
        Assertions.assertTrue(created);
    }

    @Test
    public void testUpdate() {
        User existingUser = new User(10, "john123", new Date());
        boolean updated = userImp.update(existingUser);
        Assertions.assertTrue(updated);
    }

    @Test
    public void testDelete() {
        boolean deleted = userImp.delete(10);
        Assertions.assertTrue(deleted);
    }

    @Test
    public void testFindAll() {
        List<User> userList = userImp.findAll();
        Assertions.assertNotNull(userList);
    }

    @Test
    public void testFindByID() {
        User user = userImp.findByID(1);
        Assertions.assertNull(user);
    }

    @Test
    public void testReadFromFile() {
    }

    @Test
    public void testWriteToFile() {
    }
    
}

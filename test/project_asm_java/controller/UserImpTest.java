
package project_asm_java.controller;
import java.util.ArrayList;
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
        // Create sample user objects
        User user1 = new User(1, "John", new Date(122, 0, 15)); // January 15, 2022
        User user2 = new User(2, "Alice", new Date(123, 1, 10)); // February 10, 2023
        User user3 = new User(3, "Bob", new Date(121, 11, 1)); // December 1, 2021

        // Create a list of users in unsorted order
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        // Create expected sorted list
        List<User> expectedList = new ArrayList<>();
        expectedList.add(user2); // Alice (latest date)
        expectedList.add(user1); // John
        expectedList.add(user3); // Bob (oldest date)

        // Call the displayByDate function
        List<User> sortedList = userImp.displayByDate(userList);

        // Assert the sorted list matches the expected list
        Assertions.assertEquals(expectedList, sortedList);
    }

    @Test
    public void testFindByUserNameOrFullName() {
        //User's data is already have in file
        List<User> listSearch1 = userImp.findByUserNameOrFullName("duc");
        List<User> listSearch2 = userImp.findByUserNameOrFullName("nguyen");
        List<User> listSearch3 = userImp.findByUserNameOrFullName("admin");
        Assertions.assertEquals(2, listSearch1.size());
        Assertions.assertEquals(3, listSearch2.size());
        Assertions.assertEquals(1, listSearch3.size());
    }

    @Test
    public void testCheckLogin() {
        //User's data is already have in file
        User loggedInUser1 = userImp.checkLogin("john", "password1");
        User loggedInUser2 = userImp.checkLogin("admin123", "123456");
        User loggedInUser3 = userImp.checkLogin("ducnhit", "123123");
        User admin = userImp.findByID(1);
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
        //User's data is already have in file
        User existingUser = new User(4, "john123", new Date());
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
        //User's data is already have in file
        List<User> userList = userImp.findAll();
        Assertions.assertNotNull(userList);
    }

    @Test
    public void testFindByID() {
        //User's data is already have in file
        User user = userImp.findByID(1);
        Assertions.assertNotNull(user);
    }

    @Test
    public void testReadFromFile() {
    }

    @Test
    public void testWriteToFile() {
    }
    
}

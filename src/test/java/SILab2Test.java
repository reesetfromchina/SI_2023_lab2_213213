
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {


    private final User user1 = null;
    List<User> users1 = null;

    private final User test2User = new User(null, "asim", "gzinz@gmail.com");
    List<User> test2Users = new ArrayList<User>(Arrays.asList(
            new User("gzinz@gmail.com", "123","gzinz@gmail.com"),
            new User("David", "123","bcrven334@gmail.com")));


    private final User test3User = new User("Abraham", "asim123345", "gzinzgmailcom");
    List<User> test3Users = new ArrayList<User>(Arrays.asList(
            new User("David", "123","gzinz@gmail.com"),
            new User("David", "123","gzinz@gmail.com")));

    private final User test4User = new User("Teodor5545", "a sim123345", "gzinzgmailcom");
    List<User> test4Users = new ArrayList<User>(Arrays.asList(
            new User("Teodor5545", "123","gzinz@gmail.com"),
            new User("David", "123","gzinz@gmail.com")));

    private final User test5User = new User("Teodor5545", "a#sim123345", "hasim@gmail.com");
    List<User> test5Users = new ArrayList<User>(Arrays.asList(
            new User("Aerrbb", "123","gzinz@gmail.com"),
            new User("David", "123","gzinz@gmail.com")));


    // Every branch  test
    @Test
    void everyBranchTest(){
        assertThrows(RuntimeException.class, ()-> SILab2.function(user1, users1));
        assertFalse(SILab2.function(test2User, test2Users));
        assertFalse(SILab2.function(test3User, test3Users));
        assertFalse(SILab2.function(test4User, test4Users));
        assertTrue(SILab2.function(test5User, test5Users));
    }




    User nullUser = null;
    User nullPassword = new User("",null,"");
    User nullEmail = new User("","",null);
    User noException = new User("","","");

    @Test
    void multipleConditionTest(){
        assertAll("Multiple condition testing",
                ()-> assertThrows(RuntimeException.class, ()->SILab2.function(nullUser, new ArrayList<>())),
                ()->assertThrows(RuntimeException.class, ()->SILab2.function(nullPassword, new ArrayList<>())),
                ()-> assertThrows(RuntimeException.class, ()->SILab2.function(nullEmail, new ArrayList<>())),
                ()->assertDoesNotThrow(()->SILab2.function(noException, new ArrayList<>())));
    }


}

package User;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class UserTest {
    public static User user ;;
@Test
public void testUserName(){
    user=new User("Bob", "password23" ,23);

   String expected="Bob";
   String Username= user.getUserName();
   assertEquals(expected, Username);
}
    @Test    public void testPassWord() {
     user = new User("Adam","Gurka", 34);
    String expected = "Gurka";
    String actual = user.getPassWord();
    assertEquals(expected,actual);
}
    @Test    public void testChangeUserName() {
     user = new User("Adam", "Pannkaka" ,67);
    String expected = "Johan";
    user.updateUserName("Johan");
    String actual = user.getUserName();
    assertEquals(expected,actual);
}
@Test
    public void testChangeShortUserName() {
     user = new User("Peter", "Password", 67);
    String expected = "Peter";
    user.updateUserName("Jim");
    String actual = user.getUserName();
    assertEquals(expected,actual);
}
}
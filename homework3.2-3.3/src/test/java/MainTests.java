import org.junit.Test;

public class MainTests extends BaseTest {

    @Test
    public void testLogin() {
        mainPage.search("username@gmail.com", "password");
    }
}
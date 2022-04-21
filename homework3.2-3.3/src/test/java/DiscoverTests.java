import org.junit.Test;

public class DiscoverTests extends BaseTest {

    @Test
    public void testJobSearch() {
        DiscoverPage discoverPage = mainPage.openDiscoverPage();

        discoverPage.openTopic(0);
    }
}
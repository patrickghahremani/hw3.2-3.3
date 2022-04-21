import org.junit.Test;

public class JobSearchTests extends BaseTest {

    @Test
    public void testJobSearch() {
        JobSearchPage jobSearchPage = mainPage.openJobsPage();

        jobSearchPage.searchJobs("java");

    }
}
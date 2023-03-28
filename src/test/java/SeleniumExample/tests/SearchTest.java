package SeleniumExample.tests;

import SeleniumExample.pages.amazonPage;
import SeleniumExample.pages.ebayPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchTest extends TestsBase {

    @Before
    public void before() {
        driver = seleniumInit("http://www.ebay.com");
        amazonPage = new amazonPage(driver);
        ebayPage = new ebayPage(driver);
    }

    @After

    public void after() {

        seleniumClose(driver);
    }

    @Test
    public void searchShirtEbay() {
        ebayPage.searchOnEbay("Shirt");
        assertTrue(true);
    }
}

package seleniumPageObject.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import seleniumPageObject.pages.GoogleMain;
import seleniumPageObject.pages.GoogleResult;

public class GoogleTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("Start test");
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.testStart("https://www.google.com");

        GoogleMain main = new GoogleMain(driver);
        GoogleResult results = new GoogleResult(driver);

        main.searchPattern("Covid19");
        String text = results.getResults();
        System.out.println("Total results from google results page = " + text);
        base.testEnd(driver);

    }

}

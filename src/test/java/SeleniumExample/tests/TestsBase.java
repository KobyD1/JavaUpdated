package SeleniumExample.tests;

import SeleniumExample.pages.amazonPage;
import SeleniumExample.pages.ebayPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class TestsBase {

    public ChromeDriver driver = null;
    public amazonPage amazonPage = null;
    public ebayPage ebayPage = null;

    public ChromeDriver seleniumInit(String url) {

        System.out.println("Starting Test...");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(url);
        return driver;
    }





    public void seleniumClose(ChromeDriver driver) {
        driver.quit();
        System.out.println("...End Test");
    }
}

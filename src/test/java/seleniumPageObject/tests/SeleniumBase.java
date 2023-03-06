package seleniumPageObject.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class SeleniumBase {

    public ChromeDriver testStart(String url) {

        System.out.println("Starting...");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--start-maximized");
        options.setAcceptInsecureCerts(true);

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get(url);
        return driver;

    }

    public void testEnd(ChromeDriver driver) {
        driver.close();
        System.out.println("Test Completed ");

    }

}

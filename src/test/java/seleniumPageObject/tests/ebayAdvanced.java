package seleniumPageObject.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class ebayAdvanced {

    public static void main(String[] args) {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.testStart("https://www.ebay.com");
        WebElement searchMenu = driver.findElement(By.id("gh-ac"));
        WebElement searchBtn = driver.findElement(By.id("gh-btn"));
        searchMenu.click();
        searchMenu.clear();
        searchMenu.sendKeys("Adidas");
        searchBtn.click();

        WebElement includeDesc = driver.findElement(By.id("s0-51-9_incl_desc"));

        includeDesc.click();

        searchBtn.click();
        base.testEnd(driver);

    }
}

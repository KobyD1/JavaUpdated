package SeleniumExample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utils {


    public void clickOnElementIfClickable(WebElement elementToClick, WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementToClick));
        element.click();

    }

}

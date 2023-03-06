package seleniumPageObject.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleMain {

    private WebDriver driver;


    @FindBy(name="q")
    WebElement search ;

    @FindBy(id="hplogo")
    WebElement logo ;





    //Constructor
    public GoogleMain(WebDriver driver){
        this.driver=driver;

        PageFactory.initElements(driver, this);
    }

    public void searchPattern(String pattern){
        new WebDriverWait(driver, Duration.ofMinutes(2))
                .until(ExpectedConditions.visibilityOf(search));
        search.click();
        search.clear();
        search.sendKeys(pattern);
        search.sendKeys(Keys.ENTER);
    }

    public String getLogo(){


        return  logo.getText();
    }


}

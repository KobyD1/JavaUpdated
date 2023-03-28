package SeleniumExample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonPage {

    @FindBy(css = "input[class*=nav-input]")
    WebElement searchMenu;

    @FindBy(id = "nav-search-submit-button")
    WebElement searchBtn;

    @FindBy(css = "div[class='sg-col-inner']")
    WebElement result;
    private ChromeDriver driver;

    public amazonPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchOnAmazon(String pattern) {

        searchMenu.click();
        searchMenu.sendKeys(pattern);
        searchBtn.click();


    }

    public void getResults() {
        String text = result.getText();
        System.out.println("text found "+text);
    }


}
package SeleniumExample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ebayPage {

    @FindBy(id = "gh-ac")
    WebElement searchMenu;

    @FindBy(id = "gh-btn")
    WebElement searchBtn;

    @FindBy(css = "div.srp-controls__row-cells")
    WebElement result;
    private ChromeDriver driver;
    Utils utils = new Utils();

    public ebayPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void searchOnEbay(String pattern) {
        searchMenu.click();
        searchMenu.clear();
        searchMenu.sendKeys(pattern);
        utils.clickOnElementIfClickable(searchBtn,driver);


    }

    public int getEbayResults() {
        String text = result.getText();
        if (text.contains("+")) {
            text = text.substring(0, text.indexOf("+"));
        } else {
            text = text.substring(0, text.indexOf("results"));
        }
        text = text.replace(",", "");
        int textAsInt = Integer.parseInt(text);
        return textAsInt;
    }
}

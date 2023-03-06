package seleniumPageObject.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {

    public static void main(String[] args) {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.testStart("https://www.calculator.net");
        WebElement searchMenu  = driver.findElement(By.id("calcSearchTerm"));
        WebElement searchBtn = driver.findElement(By.id("bluebtn"));
        List<String> products = new ArrayList<>();
        products.add("Time");
        products.add("BMI");
        products.add("Age");
        for (String product :products) {
            searchMenu.click();
            searchMenu.clear();
            searchMenu.sendKeys(product);
            searchBtn.click();
            WebElement res = driver.findElement(By.partialLinkText(product));
            String resultText = res.getText();
            System.out.println(resultText+" found as a result of search ");

        }

base.testEnd(driver);
    }

}

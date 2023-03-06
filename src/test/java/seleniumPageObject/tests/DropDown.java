package seleniumPageObject.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

    public static void main(String[] args) {


        System.out.println("Start test");
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.testStart("https://demo.guru99.com/test/newtours/reservation.php");
         Select flights = new Select(driver.findElement(By.name("fromPort")));
         flights.selectByIndex(3);

        base.testEnd(driver);
    }
}

package seleniumPageObject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleResult {
	   private WebDriver driver;

		
		 @FindBy(id="result-stats")
		    WebElement results ;


		    //Constructor
		    public GoogleResult(WebDriver driver){
		        this.driver=driver;

		        PageFactory.initElements(driver, this);
		    }
		    

		    public String getResults(){
		    	String text = results.getText();
		    	Integer index1= text.indexOf("-")+1;
		    	Integer index2=text.indexOf(")")-18;
		       	text=text.substring(index1, index2);
		    	return text;
		        
		    }

}

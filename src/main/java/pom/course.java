package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class course {
   @FindBy(id ="course")
   private WebElement coursbtn;


  @FindBy(xpath ="(//a[text()='Selenium Training'])[1]")
  private WebElement selniumbtn;
  
	@FindBy(name ="addresstype")
	private WebElement drpdwn;
	

	
  public WebElement getDrpdwn() {
		return drpdwn;
	}

public course(WebDriver driver) {
	  PageFactory.initElements(driver, this);
  }

public WebElement getCoursbtn() {
	return coursbtn;
}

public void seleniumbtn() {
	selniumbtn.click();
}


}
  

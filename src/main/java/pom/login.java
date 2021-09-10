package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	@FindBy(xpath="//span[text()='GEARS']")
	private WebElement gears;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[1]")
	private WebElement demo;
	
	@FindBy(name ="q")
	private WebElement search;
    
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchbtn;
	
	public login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void  gears() {
		gears.click();
	}

	public void demo() {
		demo.click();
	}
	
	public void search(String key)
	{
		search.sendKeys(key);
	}
    
	public void btn() {
		searchbtn.click();
	}
}

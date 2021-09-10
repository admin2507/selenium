package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testingpage {
@FindBy(id="Selenium Training")
private WebElement sel;

@FindBy(id="cartArea")
private WebElement cart;

@FindBy(xpath="//i[@class='fa fa-facebook']")
private WebElement fb;

public Testingpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void fbclick() {
	fb.click();
}

public WebElement getFb() {
	return fb;
}

public WebElement getSel() {
	return sel;
}

public WebElement getCart() {
	return cart;
}
}

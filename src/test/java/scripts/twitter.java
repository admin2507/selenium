package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericlib.BaseClass;
import genericlib.PropertyFile;
import pom.login;
import pom.seleniumpage;
import pom.seleniumtraining;

public class twitter extends BaseClass {
@Test
   public void tc3() throws FileNotFoundException, IOException, InterruptedException {
	login l = new login(driver);
	l.search(PropertyFile.getData("value1"));
	l.btn();
	
	seleniumpage pg = new seleniumpage(driver);
	//utility.swtichtab(driver);
	pg.selclick();

	seleniumtraining t=new seleniumtraining(driver);
	utility.switchframe(driver);
	//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(t.getPlaybtn()));
	
    Thread.sleep(15000);
	t.pausebutton();
	utility.switchback(driver);
	Thread.sleep(3000);
	t.takethiscoursebtn();
	Thread.sleep(3000);
	
	
}
}

package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericlib.BaseClass;
import genericlib.PropertyFile;
import pom.Testingpage;
import pom.course;
import pom.facebookpage;
import pom.login;



public class LikeFB extends BaseClass {
	@Test
	public void tc2() throws FileNotFoundException, IOException, InterruptedException {
		login s = new login(driver);
		s.gears();
		s.demo();
		
	    course c = new course(driver);
	    utility.swtichtab(driver);
		utility.dropdown(c.getDrpdwn(),PropertyFile.getData("value"));
		
		Testingpage p = new Testingpage(driver);
		utility.swtichtab(driver);
		utility.draganddrop(driver, p.getSel(), p.getCart());
		WebElement ele = p.getFb();
		Point loc = ele.getLocation();
	    int x = loc.getX();
		int y = loc.getY();
		utility.scrollbar(driver,x,y);
		p.fbclick();
		
		facebookpage f = new facebookpage(driver);
		utility.swtichtab(driver);
		f.fblike();
		
		Assert.assertEquals(driver.getTitle(),PropertyFile.getData("fbtitle"));
		
	}
	
}

package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericlib.BaseClass;
import genericlib.PropertyFile;
import pom.addtocart;
import pom.course;
import pom.login;

public class tc1 extends BaseClass {
@Test
   public void addtocarts() throws FileNotFoundException, IOException {
	login s = new login(driver);
	s.gears();
	s.demo();
	
	course c = new course(driver);
	utility.swtichtab(driver);
	utility.mouserhover(driver,c.getCoursbtn());
	c.seleniumbtn();
	
	addtocart a = new addtocart(driver);
	utility.swtichtab(driver);
	utility.doubleclick(driver,a.getPlusbtn());
	a.submitbtn();
	utility.alertpopup(driver);
	
	
	Assert.assertEquals(driver.getTitle(),PropertyFile.getData("title"));
}
}

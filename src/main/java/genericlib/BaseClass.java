package genericlib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;


public class BaseClass implements Autoconstant {
   public WebDriver driver;
   public PropertyFile pdata = new PropertyFile();
   public WebdriverUtility utility = new WebdriverUtility();
   @BeforeMethod
   public void openApp() throws FileNotFoundException, IOException {
	   ChromeDriverManager.chromedriver().setup(); // to launch chrome 
	  // FirefoxDriverManager.firefoxdriver().setup(); for firefox driver
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get(pdata.getData("url"));
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
   }
   
   
   @AfterMethod
   public void closeApp(ITestResult res) throws IOException {
	   int sts = res.getStatus();
	   String name = res.getName();
	   
	   if(sts ==2) {
		   photo p = new photo();
		   p.getPhoto(driver, name);
	   }
	   driver.quit();
   }



}

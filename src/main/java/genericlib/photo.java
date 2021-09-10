package genericlib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class photo implements Autoconstant {
      public void getPhoto(WebDriver driver,String name) throws IOException { // given variable name to get name of tst case which is failed 
    	  
    	  Date d = new Date(); // created date class to have daily failed tc screenshot 
    	 String date = d.toString().replaceAll(":","-");
    	 
    	  TakesScreenshot ts = (TakesScreenshot) driver;
    	  File src = ts.getScreenshotAs(OutputType.FILE);
    	  File dest = new File(photopath+date+name+".png"); // it will take screenshot
    	  FileUtils.copyFile(src, dest);
      }
}

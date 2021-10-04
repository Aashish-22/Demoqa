package base_layer;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public static String  Screenshot1(WebDriver driver,String screenshotname)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"/DemoQa/Screen/"+screenshotname+".png";
		File destination= new File(path);
		
		
		try
		{
		FileUtils.copyFile(source, destination);
		}
		catch (Exception e)
		{   
			
		}
		return path;
		
		
		}

	}



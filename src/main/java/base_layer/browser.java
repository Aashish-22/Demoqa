package base_layer;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import Test_layer.IMP;


public class browser extends IMP {

	public void bi() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		logger1.log(Status.PASS, "Website has launch Successfully");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		logger1.log(Status.PASS, "Maximize successfully");
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		String Actual_Title="ToolsQA";
		Assert.assertEquals(Actual_Title, driver.getTitle());
		logger1.log(Status.PASS," Assertion has performed Successfully");
		Thread.sleep(2000);
		
	}
	
	}


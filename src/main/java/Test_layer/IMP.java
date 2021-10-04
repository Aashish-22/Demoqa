package Test_layer;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Interaction;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Page_layer.ALFRWIN;
import Page_layer.BookStore;
import Page_layer.Elements;
import Page_layer.Forms;
import Page_layer.Interactions;
import base_layer.Screenshot;
import base_layer.browser;

public class IMP {
	
	public static ExtentSparkReporter htmlreporter = new ExtentSparkReporter("./ReportQA/QA");
public static ExtentReports Report=new ExtentReports();
public static ExtentTest logger1,logger2,logger3,logger4,Logger5,logger6,logger7;
public static WebDriver driver;
public static JavascriptExecutor js=(JavascriptExecutor)driver; 
static Properties prop;

@BeforeSuite
public void logger(){
	Report.attachReporter(htmlreporter);
	logger1= Report.createTest("Browser Initialization");
	logger2=Report.createTest("Elements");
	logger3=Report.createTest("Forms");
	logger4=Report.createTest("Alerts frame window");
	Logger5=Report.createTest("Interactions");
	logger6=Report.createTest("Book Store");
	logger7=Report.createTest("Fail test");
}


public static void load_property_file()throws IOException
{
prop = new Properties();



try {
InputStream input=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Demoqa.prop");
prop.load(input);

} catch (FileNotFoundException e) {

e.printStackTrace();
}
}

public static String getobj(String Data) throws IOException
{
load_property_file();
String data= prop.getProperty(Data);
return data;
}


@Test(priority=1)
public void Step1() throws InterruptedException {
	browser bw=PageFactory.initElements(driver, browser.class);
	bw.bi();
}
	@Test(priority=2)
	public void Step2() throws InterruptedException, AWTException, IOException {
	Elements E=PageFactory.initElements(driver, Elements.class);
	E.Elmt();
	}
	
	@Test(priority=3)
	public void Step3() throws InterruptedException, IOException {
		Forms f=PageFactory.initElements(driver, Forms.class);
		f.formm();
	}
	@Test(priority=4)
	public void Step4() throws InterruptedException {
	ALFRWIN a=PageFactory.initElements(driver, ALFRWIN.class);
	a.frame();
	}
	@Test(priority=5)
	public void Step5() throws InterruptedException {
	Interactions in=PageFactory.initElements(driver, Interactions.class);
	in.Inter();
	}
	
	@Test(priority=6)
	public void Step6() throws InterruptedException, IOException {
		BookStore book=PageFactory.initElements(driver, BookStore.class);
	book.BS();
	}
	
@AfterMethod
	public void teardown(ITestResult result) throws IOException
	{
		
		try {
		if(ITestResult.FAILURE==result.getStatus())
		{
		String temp=Screenshot.Screenshot1(driver, result.getName());
		
		logger6.fail("Testcase name "+ result.getName());
		logger6.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
	    }}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
	}
			
		@AfterSuite
		public void tear() {
			
				Report.flush();
		//		driver.close();
	
		
	
}

}

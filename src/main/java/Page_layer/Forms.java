package Page_layer;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

import Test_layer.IMP;

public class Forms extends IMP  {
	
	@FindBy(xpath="//*[text()='Forms']")WebElement form;
	@FindBy(xpath="//span[text()='Practice Form']")WebElement PF;
	@FindBy(id="firstName")WebElement FN;
	@FindBy(id="lastName")WebElement LN;
	@FindBy(id="userEmail")WebElement Email;
	@FindBy(id="userNumber")WebElement Number;
	@FindBy(xpath="//input[@value='Male']")WebElement gen;
	@FindBy(id="dateOfBirthInput")WebElement dob;
	@FindBy(className="react-datepicker__month-select")WebElement Month;
	@FindBy(className="react-datepicker__year-select")WebElement Year;
	@FindBy(xpath="//div[text()='22']")WebElement day;
	@FindBy(xpath="//*[@id='subjectsContainer']")WebElement Subj;
	@FindBy(xpath="//*[text()='Sports']")WebElement hobb;
	@FindBy(id="uploadPicture")WebElement pic;
	@FindBy(id="currentAddress")WebElement CA;
	@FindBy(xpath="//*[text()='Select State']")WebElement st;
	@FindBy(xpath="//*[text()='NCR']")WebElement ncr;
	@FindBy(xpath="//*[text()='Select City']")WebElement city;
	@FindBy(xpath="//*[text()='Delhi']")WebElement Del;
	@FindBy(id="submit")WebElement sub;
	@FindBy(xpath="//*[text()='Close']")WebElement close;
	
	
	public void formm() throws InterruptedException, IOException {
		form.click();
		Thread.sleep(3000);
		logger3.log(Status.PASS, "fORM button has been clicked successfully");
		
		PF.click();
		Thread.sleep(3000);
		logger3.log(Status.PASS, "PracticefORM button has been clicked successfully");
		
		FN.sendKeys(getobj("FFname"));
		Thread.sleep(3000);
		
		logger3.log(Status.PASS, "firstName has been Entered successfully");
		
		LN.sendKeys(getobj("FLname"));
		Thread.sleep(3000);
		logger3.log(Status.PASS, "lastName has been Entered successfully");
	
		Email.sendKeys(getobj("FEmail"));
		Thread.sleep(3000);
		logger3.log(Status.PASS, "Email has been Entered successfully");
	
		Number.sendKeys(getobj("FMobile"));
		Thread.sleep(3000);
		logger3.log(Status.PASS, "Number has been Entered successfully");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", gen);
		Thread.sleep(3000);
		
		//Calender
		dob.click();
		Thread.sleep(3000);
		logger3.log(Status.PASS, "Dob has been Clicked successfully");
//		
//		Select m=new Select(driver.findElement(By.className("react-datepicker__month-dropdown-container react-datepicker__month-dropdown-container--select")));
//		m.selectByVisibleText("April");
//		Thread.sleep(2000);
//		logger3.log(Status.PASS, "Month has been Entered successfully");
//		
//		Select y=new Select(driver.findElement(By.className("react-datepicker__year-select")));
//		y.selectByValue("1996");
//		Thread.sleep(2000);
//		logger3.log(Status.PASS, "Year has been Entered successfully");
//		
//		day.click();
//		Thread.sleep(2000);
//		logger3.log(Status.PASS, "Day has been Entered successfully");
//	
		
		Select s = new Select(Month);
		s.selectByValue("3");
		Select s1 = new Select(Year);
		s1.selectByVisibleText("1996");
		day.click();
			
		js.executeScript("arguments[0].click()", Subj);
	
//	Subj.sendKeys("testing");	
//	Thread.sleep(3000);
//	logger3.log(Status.PASS, "Subject has been Entered successfully");
		js.executeScript("window.scrollBy(0,360)");
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()", hobb);
	     Thread.sleep(3000);
     	logger3.log(Status.PASS, "Subject has been Entered successfully");
     	
     	pic.sendKeys("C:\\Users\\user\\Pictures\\Screenshots\\Screenshot (1).png");
     	Thread.sleep(3000);
     	logger3.log(Status.PASS, "pic has been uploaded successfully");
     	
     	CA.sendKeys(getobj("FCurrentaddress"));
     	Thread.sleep(3000);
     	logger3.log(Status.PASS, "Current Address has been entered successfully");
     	
     	st.click();
     	Thread.sleep(3000);
     	logger3.log(Status.PASS, "State has been clicked successfully");

     	ncr.click();
     	Thread.sleep(3000);
     	logger3.log(Status.PASS, "State has been selected successfully");     	
     	city.click();
     	Thread.sleep(3000);
     	logger3.log(Status.PASS, "City has been clicked successfully");
     	Del.click();
     	Thread.sleep(3000);
     	logger3.log(Status.PASS, "City has been selected successfully");
     	
     	sub.click();
     	Thread.sleep(3000);
     	logger3.log(Status.PASS, "Submit has been clicked successfully");
     	
     	close.click();
     	Thread.sleep(3000);
     	logger3.log(Status.PASS, "Close has been clicked successfully");
     	
	}

}

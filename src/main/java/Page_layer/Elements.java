package Page_layer;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import Test_layer.IMP;

public class Elements extends IMP {
	
@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]")WebElement Elemnt ;//element field
@FindBy(xpath="//*[@title='Ad.Plus Advertising']")WebElement Adv;
	
	//WebElement for Textbox
@FindBy(xpath="//span[text()='Text Box']")WebElement Textbox;//textbox
@FindBy(id="userName")WebElement UN;//username
@FindBy(id="userEmail")WebElement Email;//to enter email
@FindBy(id="currentAddress")WebElement Address; //to enter address
@FindBy(id="permanentAddress")WebElement PA;//to enter permanent address
@FindBy(id="submit")WebElement Submit;//submit button

//Webelement for Checkbox
@FindBy(xpath="//*[@class='rct-icon rct-icon-uncheck']")WebElement check;// to check the check box
@FindBy(xpath="//span[text()='Check Box']")WebElement Checkbox;//checkbox
@FindBy(xpath="//*[@class='rct-icon rct-icon-expand-all']")WebElement Expand;//to expand 
@FindBy(xpath="//*[@class='rct-icon rct-icon-collapse-all']")WebElement Collapse;//to collapse

//Webelement for Radio Button
@FindBy(xpath="//span[text()='Radio Button']")WebElement RadioButton;
@FindBy(xpath="//input[@id='yesRadio']")WebElement Yes;//to click yess

//Webelement fot Webtables
@FindBy(xpath="//span[text()='Web Tables']")WebElement WT; //to click on webtables
@FindBy(id="addNewRecordButton")WebElement Add;
@FindBy(id="firstName")WebElement FN;
@FindBy(id="lastName")WebElement LN;
@FindBy(id="userEmail")WebElement EM;//email
@FindBy(id="age")WebElement Age;
@FindBy(id="salary")WebElement Sal;
@FindBy(id="department")WebElement Dept;
@FindBy(id="submit")WebElement SUB;

//Webelement for Buttons
@FindBy(xpath="//span[text()='Buttons']")WebElement btn;
@FindBy(id="doubleClickBtn")WebElement DOUBLECLICK;//double click
@FindBy(id="rightClickBtn")WebElement RIGHTCLICK;
@FindBy(xpath="//button[text()='Click Me']")WebElement clck;

//Weelement for links
@FindBy(xpath="//span[text()='Links']")WebElement links;
@FindBy(id="simpleLink")WebElement Simplelink;
@FindBy(id="dynamicLink")WebElement Dynamiclink;

//Webelement for Upload and download
@FindBy(xpath="//*[text()='Upload and Download']")WebElement UD;//upload and download
@FindBy(id="uploadFile")WebElement Uf;//upload file
@FindBy(id="downloadButton")WebElement down;//to click on download button
@FindBy(xpath="//*[text()='Elements']")WebElement clp; //to collapse element pannel


public void  Elmt() throws InterruptedException, AWTException, IOException
{
	Adv.click();//to close adv

	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", Elemnt);
	logger2.log(Status.PASS, "Element button has been clicked successfully");
	
	
	//Textbox field
	Textbox.click();
	logger2.log(Status.PASS, "textbox button has been clicked successfully");
	Thread.sleep(2000);
	UN.sendKeys(getobj("Username"));
	logger2.log(Status.PASS, "Username has entered successfully");
	Thread.sleep(2000);
	
	Email.sendKeys(getobj("Email"));
	logger2.log(Status.PASS, "Email has entered successfully");
	Thread.sleep(2000);
	
	Address.sendKeys(getobj("CurrentAddress"));
	logger2.log(Status.PASS, "Address has entered successfully");
	Thread.sleep(2000);
	
	js.executeScript("window.scrollBy(0,360)");
	PA.sendKeys(getobj("PermanentAddress"));
	logger2.log(Status.PASS, "Permanent Address has entered successfully");
	Thread.sleep(2000);
	
	js.executeScript("arguments[0].click()", Submit);
	logger2.log(Status.PASS, "Submit button has clicked successfully");
	Thread.sleep(2000);
	
	//Checkbox field
	Thread.sleep(3000);
	Checkbox.click();
	Thread.sleep(2000);
	logger2.log(Status.PASS, "Checkbox button has clicked successfully");
	check.click();
	Thread.sleep(2000);
	
	logger2.log(Status.PASS, "Check button has clicked successfully");
	Thread.sleep(2000);
	Expand.click();
	logger2.log(Status.PASS, "Expand button has clicked successfully");
	Thread.sleep(2000);
	Collapse.click();
	logger2.log(Status.PASS, "Collapse button has clicked successfully");
	
	
	////Radio Button
	//Thread.sleep(3000);
	//RadioButton.click();
	//logger2.log(Status.PASS, "Radio button has clicked successfully");
	//
	//Thread.sleep(4000);
	//Yes.click();
	//logger2.log(Status.PASS, " Yess Radio button has clicked successfully");
	
	
	
			//WebTables
	js.executeScript("arguments[0].click()", WT);	
	logger2.log(Status.PASS, " Webtable button has clicked successfully");
	Thread.sleep(3000);
	Add.click();
	Thread.sleep(2000);
	logger2.log(Status.PASS, " Add button has clicked successfully");
	//driver.switchTo().frame("userForm");
	FN.sendKeys(getobj("WFirstname"));
	Thread.sleep(2000);
	logger2.log(Status.PASS, " FirstName has entered successfully");
	
	LN.sendKeys(getobj("WLastname"));
	Thread.sleep(2000);
	logger2.log(Status.PASS, "LastName has entered successfully");
	
	EM.sendKeys(getobj("WEmail"));
	Thread.sleep(2000);
	logger2.log(Status.PASS, "LastName has entered successfully");
	
	Age.sendKeys(getobj("WAge"));
	Thread.sleep(2000);
	logger2.log(Status.PASS, "Age has entered successfully");
	
	Sal.sendKeys(getobj("WSalary"));
	Thread.sleep(2000);
	logger2.log(Status.PASS, "Salary has entered successfully");
	
	Dept.sendKeys(getobj("WDepartment"));
	Thread.sleep(2000);
	logger2.log(Status.PASS, "Department has entered successfully");
	
	SUB.click();
	Thread.sleep(2000);
	logger2.log(Status.PASS, "Submit button has been clicked successfully");
	
	//buttons
	js.executeScript("window.scrollBy(0,360)");
	Thread.sleep(2000);
	btn.click();
	Thread.sleep(2000);
	logger2.log(Status.PASS, "button tab has clicked successfully");
	
	//btn.click();
	
	logger2.log(Status.PASS, "  buttons has clicked successfully");
	Thread.sleep(3000);
	Actions act=new Actions(driver);
	act.doubleClick(DOUBLECLICK).perform();;
	logger2.log(Status.PASS, "  double click buttons has clicked successfully");
	Thread.sleep(2000);
	act.contextClick(RIGHTCLICK).perform();
	logger2.log(Status.PASS, "  Right click buttons has clicked successfully");
	Thread.sleep(2000);
	clck.click();
	logger2.log(Status.PASS, "  click buttons has clicked successfully");
	Thread.sleep(2000);
	
	
	//links
	js.executeScript("window.scrollBy(0,360)");
	Thread.sleep(2000);
	js.executeScript("arguments[0].click()", links);
	Thread.sleep(2000);
	Simplelink.click();
	Thread.sleep(2000);
	String parent=driver.getWindowHandle();//parent window
	Set<String>s=driver.getWindowHandles();
	for(String id : s) {
		driver.switchTo().window(id);
		Thread.sleep(2000);
}
	driver.close();
	
	driver.switchTo().window(parent);
	js.executeScript("arguments[0].click()", Dynamiclink);
	Thread.sleep(2000);
	String parents=driver.getWindowHandle();//parent window
	Set<String>ss=driver.getWindowHandles();
	for(String ids : ss) 
{
		driver.switchTo().window(ids);
		Thread.sleep(2000);	
}
	driver.close();
	driver.switchTo().window(parents);
	Thread.sleep(3000);
	
	
	//upload and download
	js.executeScript("window.scrollBy(0,360)");
	Thread.sleep(2000);
	js.executeScript("arguments[0].click()", UD);
	Thread.sleep(2000);
	Uf.sendKeys("C:\\Users\\user\\Desktop\\abc.docx");
	Thread.sleep(2000);
//	down.click();//to click on download button
//	Thread.sleep(2000);
	
	clp.click();
	Thread.sleep(2000);
}
}


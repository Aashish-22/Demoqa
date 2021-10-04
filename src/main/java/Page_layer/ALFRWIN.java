package Page_layer;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;

import Test_layer.IMP;

public class ALFRWIN extends IMP{
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]")WebElement Elemnt ;//element field
	@FindBy(xpath="//*[text()='Alerts, Frame & Windows']")WebElement alt;//to choose  alert frame window module 
	@FindBy(xpath="//*[@title='Ad.Plus Advertising']")WebElement Adv;
	@FindBy(xpath="//span[text()='Browser Windows']")WebElement browwser;//not performed because this has been done in element module
	@FindBy(xpath="//span[text()='Alerts']")WebElement Alt;
	@FindBy(id="tabButton")WebElement newtab;
	@FindBy(xpath="//button[@id='alertButton']")WebElement Click1;
	@FindBy(id="timerAlertButton")WebElement TimerClick;
	@FindBy(id="confirmButton")WebElement confirmationclick;
	@FindBy(id="promtButton")WebElement promptclick;
	@FindBy(xpath="//span[text()='Modal Dialogs']")WebElement Md;//Modal dialog
	@FindBy(id="showSmallModal")WebElement Small;
	@FindBy(id="closeSmallModal")WebElement closesmall;
	@FindBy(id="showLargeModal")WebElement  large;
	@FindBy(id="closeLargeModal")WebElement closelarge;
	public void frame() throws InterruptedException {
//		Adv.click();
//		js.executeScript("arguments[0].click()", Elemnt);
//Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", alt);
	Thread.sleep(3000);
	logger4.log(Status.PASS, "Alert window frame module has been opened successfully");
	
	js.executeScript("window.scrollBy(0,360)");
	Thread.sleep(2000);
	js.executeScript("arguments[0].click()", Alt);
	Thread.sleep(5000);
	logger4.log(Status.PASS, "Alert tab has been opened successfully");
	
	
	Click1.click();
	Thread.sleep(2000);
	Alert a= driver.switchTo().alert();
	a.accept();
	Thread.sleep(3000);
	logger4.log(Status.PASS, "ALERT 1 tab has been accept successfully");

	
	TimerClick.click();
	Thread.sleep(6000);
	Alert b= driver.switchTo().alert();
	b.accept();
	logger4.log(Status.PASS, "Timer Alert tab has been accept successfully");

	confirmationclick.click();
	Thread.sleep(2000);
	Alert c=driver.switchTo().alert();
	c.accept();
	logger4.log(Status.PASS, "Confirmation Alert tab has been accept successfully");
	
	promptclick.click();
	Thread.sleep(2000);
	Alert d=driver.switchTo().alert();
	d.sendKeys("Aashish");
	d.accept();
	logger4.log(Status.PASS, "Prompt Alert tab has been accept successfully");
	
	js.executeScript("window.scrollBy(0,360)");
	Thread.sleep(2000);
	js.executeScript("arguments[0].click()", Md);
	Thread.sleep(3000);
	logger4.log(Status.PASS, "Modal dialog tab has been opened successfully");

	
	Small.click();
	Thread.sleep(2000);
	logger4.log(Status.PASS, "Small Modal dialog tab has been opened successfully");

	closesmall.click();
	Thread.sleep(3000);
	logger4.log(Status.PASS, "SmallModal dialog tab has been closed successfully");

	
	large.click();
	Thread.sleep(2000);
	logger4.log(Status.PASS, "large Modal dialog tab has been opened successfully");

	closelarge.click();
	Thread.sleep(3000);
	logger4.log(Status.PASS, "largeModal dialog tab has been closed successfully");

	js.executeScript("arguments[0].click()", alt);
	Thread.sleep(3000);
	logger4.log(Status.PASS, "Alert window frame module has been closed successfully");
	
	}
}

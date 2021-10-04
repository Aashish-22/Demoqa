package Page_layer;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;

import Test_layer.IMP;

public class BookStore extends IMP {
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]")WebElement Elemnt ;//element field
	@FindBy(xpath="//*[@title='Ad.Plus Advertising']")WebElement Adv;
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]")WebElement  Book;
	@FindBy(xpath="//*[text()='Login']")WebElement logg;
	@FindBy(xpath="//input[@id='userName']")WebElement UN;
	@FindBy(xpath="//input[@id='password']")WebElement Pass;
	@FindBy(xpath="//button[@id='login']")WebElement LOGIN;
	@FindBy(xpath="//button[@id='gotoStore']")WebElement GOBOOKS;
	@FindBy(xpath="//a[text()='Git Pocket Guide']")WebElement Book1;
	@FindBy(xpath="//button[text()='Add To Your Collection']")WebElement add1;
	@FindBy(xpath="//button[text()='Back To Book Store']")WebElement back1;
	@FindBy(xpath="//a[text()='Understanding ECMAScript 6']")WebElement Book2;
	@FindBy(xpath="//a[text()='Programming JavaScript Applications']")WebElement Book3;
	@FindBy(xpath="//span[text()='Profile']")WebElement Profile;
	@FindBy(xpath="//body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/div[3]/button")WebElement Deletebooks;
	@FindBy(id="closeSmallModal-ok")WebElement OK;
	@FindBy(xpath="//button[text()='Log out']")WebElement logout;
	
	
	
	public void BS() throws InterruptedException, IOException {
//		Adv.click();
//		Thread.sleep(2000);
//			js.executeScript("arguments[0].click()", Elemnt);	
	
	//	Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,360)");
		js.executeScript("arguments[0].click()", Book);	
		Thread.sleep(2000);
		logger6.log(Status.PASS, "Book Module has opened Successfully");
		
		js.executeScript("arguments[0].click()", logg);	
		Thread.sleep(2000);
		logger6.log(Status.PASS, "login tab has opened Successfully");
		
		UN.sendKeys(getobj("BUsername"));
		Thread.sleep(3000);
		logger6.log(Status.PASS, "Username has entered Successfully");

		Pass.sendKeys(getobj("BPassword"));
		Thread.sleep(3000);	
		logger6.log(Status.PASS, "Password has entered Successfully");

		
		LOGIN.click();
		Thread.sleep(2000);
		logger6.log(Status.PASS, "login button has clicked Successfully");

		
		js.executeScript("window.scrollBy(0,360)");
		js.executeScript("arguments[0].click()", GOBOOKS);	
		Thread.sleep(2000);
		logger6.log(Status.PASS, "BookStore has opened Successfully");

		
		Book1.click();
		Thread.sleep(2000);
		logger6.log(Status.PASS, "First book has click Successfully");

		js.executeScript("window.scrollBy(0,360)");
		js.executeScript("arguments[0].click()", add1);	
		Thread.sleep(2000);
		logger6.log(Status.PASS, "First book has added Successfully");

		Alert f=driver.switchTo().alert();
		f.accept();
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click()", back1);	
		Thread.sleep(2000);
		logger6.log(Status.PASS, "Back Button has clicked Successfully");

		//TO ADD 2ND BOOK
		Adv.click();

		js.executeScript("window.scrollBy(0,720)");
		js.executeScript("arguments[0].click()", Book2);	
		Thread.sleep(2000);
		logger6.log(Status.PASS, "Second book has click Successfully");

		js.executeScript("window.scrollBy(0,360)");
		js.executeScript("arguments[0].click()", add1);	
		Thread.sleep(2000);
		
		logger6.log(Status.PASS, "Second book has added Successfully");
		Alert G=driver.switchTo().alert();
		G.accept();
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click()", back1);	
		Thread.sleep(2000);
		logger6.log(Status.PASS, "Back Button has clicked Successfully");

		//TO ADD BOOK 3
		js.executeScript("window.scrollBy(0,360)");
		js.executeScript("arguments[0].click()", Book3);	
		Thread.sleep(2000);
		logger6.log(Status.PASS, "Third book has click Successfully");

		js.executeScript("window.scrollBy(0,320)");
		js.executeScript("arguments[0].click()", add1);	
		Thread.sleep(2000);
		logger6.log(Status.PASS, "Third book has added Successfully");
		
		Alert H=driver.switchTo().alert();
		H.accept();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,320)");
		js.executeScript("arguments[0].click()", Profile);	
		Thread.sleep(2000);
		logger6.log(Status.PASS, "Profile Button has clicked Successfully");

		Adv.click();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,320)");
		js.executeScript("arguments[0].click()", Deletebooks);	
		Thread.sleep(2000);
		logger6.log(Status.PASS, "Delete all books Button has clicked Successfully");

		js.executeScript("arguments[0].click()", OK);	
		Thread.sleep(2000);
		
		Alert i=driver.switchTo().alert();
		i.accept();
		Thread.sleep(2000);
	
		js.executeScript("window.scrollBy(0,-320)");
		js.executeScript("arguments[0].click()", logout);	
		Thread.sleep(2000);
		logger6.log(Status.PASS, "logout Button has clicked Successfully");

	}
}


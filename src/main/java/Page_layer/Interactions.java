package Page_layer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;

import Test_layer.IMP;

public class Interactions extends IMP {
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]")WebElement Elemnt ;//element field
	@FindBy(xpath="//*[@title='Ad.Plus Advertising']")WebElement Adv;
	@FindBy(xpath="//*[text()='Interactions']")WebElement Interactiontab;
	@FindBy(xpath="//span[text()='Sortable']")WebElement Sortable;//to click on sortable
	@FindBy(xpath="//a[@id='demo-tab-grid']")WebElement Grid;
	@FindBy(xpath="//div[@id='demo-tabpane-grid']/div[1]/div[1]/div[3]")WebElement GridThree; //to click on 3rd 
	@FindBy(xpath="//div[@id='demo-tabpane-grid']/div[1]/div[1]/div[9]")WebElement GridNine; //to click on 9th
	@FindBy(xpath="//span[text()='Selectable']")WebElement Selectable;// TO CLICK ON SELELCTABLE TAB
	@FindBy(xpath="//*[text()='Morbi leo risus']")WebElement List3;// TO SELECT 3ELEMENT FROM KIST
	@FindBy(xpath="//*[text()='Cras justo odio']")WebElement List1;//TO SELECT 1ELEMENT FROM LIST
	@FindBy(xpath="//a[@id='demo-tab-grid']")WebElement GridSelect;//TO CLICK ON GRID TAB
	@FindBy(xpath="//div[@id='row3']/li[1]")WebElement GridSeven;//TO SELECT GRID 7 ELEMENT
	@FindBy(xpath="//div[@id='row2']/li[2]")WebElement Gridfive;//TO SELECT GRID 5ELEMENT
	@FindBy(xpath="//span[text()='Resizable']")WebElement Resize;//TO CLICK ON RESIIZE TAB
	@FindBy(xpath="//*[@id='resizableBoxWithRestriction']/span")WebElement arrow;//TO CLICK ON RIGHTBOTTOM ARROM
	@FindBy(xpath="//span[text()='Droppable']")WebElement drop;//TO CLICK ON DROPABLE TAB
	@FindBy(xpath="//div[text()='Drag me']")WebElement drag;//TO CLICK ON SIMPLE DRAGME
	@FindBy(xpath="//body/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div/div[2]")WebElement drop1;//TO CLICK ON SIMPLE DROP HERE
	@FindBy(xpath="//a[text()='Accept']")WebElement accept;//TO CLICK ON ACCEPT TAB
	@FindBy(xpath="//div[text()='Acceptable']")WebElement aceptable;//TO CLICK ON ACCEPTABLE BOX
	@FindBy(xpath="	//body/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div/div[2]/p")WebElement drop2;//TO CLICK ON DROPHERE INACCEPT
	@FindBy(xpath="//span[text()='Dragabble']")WebElement dragable;//TO CLICK ON DRAGABLE TAB
	@FindBy(xpath="//a[text()='Axis Restricted']")WebElement Axis;//TO CLICK ON AXIS RESTRICTED
	@FindBy(id="restrictedX")WebElement xaxis;//TO CLICK ON XAXIS
	@FindBy(id="restrictedY")WebElement yaxis;//TO CLICK ON Y AXIS
	public void Inter() throws InterruptedException {
		//Adv.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click()", Elemnt);
		//Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,360)");
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()", Interactiontab);
		Thread.sleep(3000);
		Logger5.log(Status.PASS, "Interaction tab has opened successfully");
		
		js.executeScript("window.scrollBy(0,360)");
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()", Sortable);
		Thread.sleep(3000);
		Logger5.log(Status.PASS, "Sortable tab has opened successfully");
		
		Grid.click();
		Thread.sleep(3000);
		Logger5.log(Status.PASS, "Grid tab has opened successfully");

		GridThree.click();
		Thread.sleep(3000);
		Logger5.log(Status.PASS, "Grid tab has selected firstnumber successfully");

		GridNine.click();
		Thread.sleep(3000);
		Logger5.log(Status.PASS, "Grid tab has selected Second number successfully");

		js.executeScript("window.scrollBy(0,360)");
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()", Selectable);
		Thread.sleep(3000);
		Logger5.log(Status.PASS, "Selectable tab has opened successfully");
		
		List3.click();
		Thread.sleep(3000);
		Logger5.log(Status.PASS, "List tab has selected first number successfully ");
		
		List1.click();
		Thread.sleep(3000);
		Logger5.log(Status.PASS, "List tab has selected second number successfully ");
		
		
		GridSelect.click();
		Thread.sleep(3000);
		Logger5.log(Status.PASS, "Grid tab has opened successfully in Selectable tab");

		GridSeven.click();
		Thread.sleep(3000);
		Logger5.log(Status.PASS, "Grid tab has selected firstnumber successfully");
		
		Gridfive.click();
		Thread.sleep(3000);
		Logger5.log(Status.PASS, "Grid tab has selected firstnumber successfully");
		
		
		js.executeScript("window.scrollBy(0,360)");
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()",Resize);
		Thread.sleep(3000);
		Logger5.log(Status.PASS, "Resize tab has opened successfully");
		
		Actions  act= new Actions(driver);
		act.dragAndDropBy(arrow, 20, 15).perform();;
		Thread.sleep(3000);
		Logger5.log(Status.PASS, "Size has been changed successfully");

		js.executeScript("window.scrollBy(0,360)");
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()",drop);
		Thread.sleep(3000);
		Logger5.log(Status.PASS, "Dropable tab has opened successfully");
		
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop1).perform();
		Logger5.log(Status.PASS, "Simple drag has performed successfully");

		
		accept.click();
		Thread.sleep(3000);
		Logger5.log(Status.PASS, "Accept tab has opened successfully");
		
		Actions a =new Actions(driver);
		a.dragAndDrop(aceptable, drop2);
		Thread.sleep(5000);
		Logger5.log(Status.PASS, "Accept drag has performed successfully");

		js.executeScript("window.scrollBy(0,360)");
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()",dragable);
		Thread.sleep(3000);
		Logger5.log(Status.PASS, "Draggable tab has opened successfully");
		
		Axis.click();
		Thread.sleep(3000);
		Logger5.log(Status.PASS, "Axis restricted tab has opened successfully");
			
	
		Point p=xaxis.getLocation();
		System.out.println("Position of X-axis is :-" +p.getX());
		System.out.println("Position of Y-axis is :-" +p.getY());
		Actions x=new Actions(driver);
		x.dragAndDropBy(xaxis, -100, p.getY());
		Thread.sleep(3000);
		Logger5.log(Status.PASS, "X Axis has moved  successfully");
	
		Actions y=new Actions(driver);
		y.dragAndDropBy(yaxis, 0, 900);
		Thread.sleep(3000);
		Logger5.log(Status.PASS, "Y Axis has moved successfully");
	}
	
	

}

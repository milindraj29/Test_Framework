package com.learnautomation.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ContextMenu {

	WebDriver driver;
	
	public ContextMenu(WebDriver driver)
	{
		this.driver = driver;
	}
	
@FindBy(linkText= "Context Menu" )WebElement ContextMenu;
@FindBy(id="hot-spot")WebElement Context_Menu_Click;


	public void ContextMenuTest()
	{
		
		ContextMenu.click();
		Actions action = new Actions(driver);
		action.contextClick(Context_Menu_Click).perform();
		//Switch to the alert box and click on OK button
		Alert alert = driver.switchTo().alert();
		alert.getText();
		String expectedText = "You selected a context menu";
		Assert. assertEquals(alert.getText(),expectedText);
		System.out.println("Alert Text\n" +alert.getText());
		alert.accept();

	}

}



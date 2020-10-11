package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragandDrop {

	WebDriver driver;
	
	public DragandDrop(WebDriver driver)
	{
		this.driver = driver;
	}
	
@FindBy(linkText= "Drag and Drop" )WebElement DragDrop;
@FindBy(id="column-a")WebElement FromElement;
@FindBy(id="column-b")WebElement ToElement;


	public void DragandDropTest()
	{
		
		DragDrop.click();
		Actions action = new Actions(driver);
		action.dragAndDrop(FromElement, ToElement).build().perform();
		action.dragAndDrop(ToElement, FromElement).build().perform();
		
	}

}



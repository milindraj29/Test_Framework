package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRemoveElements {

	WebDriver driver;
	
	public AddRemoveElements(WebDriver driver)
	{
		this.driver = driver;
	}
	
@FindBy(linkText="Add/Remove Elements" )WebElement Add_RemoveElements;
@FindBy(xpath="//button[@onclick='addElement()']")WebElement AddElement;
@FindBy(xpath="//button[@onclick='deleteElement()']")WebElement Delete;

	public void AddRemoveElementsTest()
	{
		
		Add_RemoveElements.click();
		AddElement.click();
		Delete.click();
	}

}



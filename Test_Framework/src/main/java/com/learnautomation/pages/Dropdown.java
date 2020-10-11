package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	WebDriver driver;
	
	public Dropdown(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(linkText= "Dropdown" )WebElement DropdownLink;
	@FindBy(id= "dropdown" )WebElement Dropdown;



	public void DropdownTest()
	{
		DropdownLink.click();
		Select option = new Select(Dropdown);
		option.selectByVisibleText("Option 1");
		option.selectByVisibleText("Option 2");
		
		
	}

}


